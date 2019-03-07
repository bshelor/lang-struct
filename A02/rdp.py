import sys

global dictList
dictList = []

def initDict(length):
    global dictList
    lst = ["term","factor","keyword","parenthesis","EOF","terminal"]
    for i in range(length):
        dictList.append({})
        for item in lst:
            if item == "terminal":
                dictList[i][item] = {"NUM": {}, "ID":{}}
            else:
                dictList[i][item] = {}
            

def processInput(fileName):
    file = open(fileName, "r")
    statement = ""
    lst = []
    for x in file:
        for char in x:
            if char == ";":
                statement += char
                lst.append(statement)
                statement = ""
            elif char not in ["\n"]:
                statement+=char
    file.close() 
    return lst

def next(lst, line, pos):
    nextChar = lst[line][pos]
    item = ""

    while nextChar == " ":
        pos += 1
        nextChar = lst[line][pos]
    
    if isLetter(nextChar):
        ## is a letter
        item += nextChar
        pos += 1
        while isLetter(lst[line][pos]):
            item += lst[line][pos]
            pos += 1
        return item, pos, 'ID'
    if isNum(nextChar):
        ## is a number
        item += nextChar
        pos += 1
        while isNum(lst[line][pos]):
            item += lst[line][pos]
            pos += 1
            if pos >= len(lst[line]):   ########## getting an index out of range error here. not sure how
                break
                
        return item, pos
    if nextChar in [';',':',',','(',')','-','\n','\r']:
        return nextChar, pos+1
    else:
        return EnvironmentError 


def isLetter(char):
    if (char >= "A" and char <= "Z") or (char >= "a" and char <= "z"):
        return True
    else:
        return False

def isNum(char):
    if (char >= "0" and char <= "9"):
        return True
    else:
        return False


def tokenize(lst):
    global dictList
    for i in range(len(lst)):
        position = 0
        term_str = ""
        term_pos = 0
        for char in lst[i]:
            # print("char="+char)
            # print("term_str="+term_str)
            # print()
            if term_str == "MOD" or term_str == "EOF":
                dictList[i]["keyword"][term_pos] = term_str
                term_str = ""
                term_pos = 0
            if char in ["+","-"]:
                if term_str != "":
                    dictList[i]["terminal"]["ID"][term_pos] = term_str
                    term_str = ""
                    term_pos = 0
                dictList[i]["term"][position] = char
            elif char in ["*","/"]:
                if term_str != "":
                    dictList[i]["terminal"]["ID"][term_pos] = term_str
                    term_str = ""
                    term_pos = 0
                dictList[i]["factor"][position] = char
            elif char in ["(",")"]:
                if term_str != "":
                    dictList[i]["terminal"]["ID"][term_pos] = term_str
                    term_str = ""
                    term_pos = 0
                dictList[i]["parenthesis"][position] = char
            elif char == ";":
                if term_str != "":
                    dictList[i]["terminal"]["ID"][term_pos] = term_str
                    term_str = ""
                    term_pos = 0
                dictList[i]["EOF"][position] = char
            elif char.isdigit():
                if term_str == "":
                    dictList[i]["terminal"]["NUM"][position] = char
                else:
                    term_str += char
            else:
                if term_str == "":
                    term_pos = position
                term_str += char
                # dictList[i]["terminal"][position] = char
            if position == (len(lst[i])-1) and term_str != "":
                # print("got here")
                if term_str == "MOD" or term_str == "EOF":
                    dictList[i]["keyword"][term_pos] = term_str
                else:
                    dictList[i]["terminal"]["ID"][term_pos] = term_str

            position+=1


def main():
    global dictList
    fileName = sys.argv[1]
    listOfStatements = processInput(fileName)
    initDict(len(listOfStatements))
    # print(dictList)
    print(listOfStatements)
    print()

    print(next(["ab"],0,0))

    # tokenize(listOfStatements)

    # for line in listOfStatements:
    #     print(line)
    # print(dictList)

main()

