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
        # print(x)
        for char in x:
            # print(char)
            # print("statement=" + statement)
            # print("statement + char="+statement+char)
            if char == ";" or "EOF" in statement+char:
                # print("got here")
                statement += char
                lst.append(statement)
                statement = ""
            elif char not in ["\n"]:
                statement+=char
    file.close() 
    return lst


def next(string, pos):
    nextChar = string[pos]
    item = ""

    while nextChar == " ":
        pos += 1
        nextChar = string[pos]
    
    if isLetter(nextChar):
        ## is a letter
        item += nextChar
        pos += 1
        while isLetter(string[pos]) or isNum(string[pos]):
            item += string[pos]
            pos += 1
            if pos >= len(string):
                break

        if item == "MOD":
            return item, pos, 'MOD'
        elif item == 'EOF':
            return item, pos, 'EOF'

        return item, pos, 'ID'

    if isNum(nextChar):
        ## is a number
        item += nextChar
        pos += 1
        while isNum(string[pos]):
            item += string[pos]
            pos += 1
            if pos >= len(string):
                break
                
        return item, pos, "NUM"

    if nextChar == ';':
        return nextChar, pos+1, "EXPR_END"
    elif nextChar in ['(',')']:
        return nextChar, pos+1, "PAREN"
    elif nextChar in [':',',','-','\n','\r']:
        return nextChar, pos+1, "OTHER" 
    elif nextChar in ['-','+']:
        return nextChar, pos+1, "TERM"
    elif nextChar in ['*','/']:
        return nextChar, pos+1, "FACTOR"
    else:
        return "Syntax Error", pos+1, "ERR"


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
    pos = 0

    for line in range(len(lst)):
        print("line="+lst[line])
        # print("length of line --> "+str(len(lst[line])))
        dictList[line] = []
        pos = 0
        while pos < len(lst[line]):
            item, pos, tag = next(lst[line], pos)
            dictList[line].append({'item': item, 'line_pos': (pos-len(item)), 'line_num': line, 'tag': tag})    
            # print(item)
            # print(pos)
            # print(tag)
    

# def tokenize(lst):
#     global dictList
#     for i in range(len(lst)):
#         position = 0
#         term_str = ""
#         term_pos = 0
#         for char in lst[i]:
#             # print("char="+char)
#             # print("term_str="+term_str)
#             # print()
#             if term_str == "MOD" or term_str == "EOF":
#                 dictList[i]["keyword"][term_pos] = term_str
#                 term_str = ""
#                 term_pos = 0
#             if char in ["+","-"]:
#                 if term_str != "":
#                     dictList[i]["terminal"]["ID"][term_pos] = term_str
#                     term_str = ""
#                     term_pos = 0
#                 dictList[i]["term"][position] = char
#             elif char in ["*","/"]:
#                 if term_str != "":
#                     dictList[i]["terminal"]["ID"][term_pos] = term_str
#                     term_str = ""
#                     term_pos = 0
#                 dictList[i]["factor"][position] = char
#             elif char in ["(",")"]:
#                 if term_str != "":
#                     dictList[i]["terminal"]["ID"][term_pos] = term_str
#                     term_str = ""
#                     term_pos = 0
#                 dictList[i]["parenthesis"][position] = char
#             elif char == ";":
#                 if term_str != "":
#                     dictList[i]["terminal"]["ID"][term_pos] = term_str
#                     term_str = ""
#                     term_pos = 0
#                 dictList[i]["EOF"][position] = char
#             elif char.isdigit():
#                 if term_str == "":
#                     dictList[i]["terminal"]["NUM"][position] = char
#                 else:
#                     term_str += char
#             else:
#                 if term_str == "":
#                     term_pos = position
#                 term_str += char
#                 # dictList[i]["terminal"][position] = char
#             if position == (len(lst[i])-1) and term_str != "":
#                 # print("got here")
#                 if term_str == "MOD" or term_str == "EOF":
#                     dictList[i]["keyword"][term_pos] = term_str
#                 else:
#                     dictList[i]["terminal"]["ID"][term_pos] = term_str

#             position+=1

def Start():
    global dictList
    List()
    EOF()

def EOF():
    global dictList
    if token == "EOF":
        return

def List():
    global dictList

def Expr():
    global dictList

def Term():
    global dictList

def Terms():
    global dictList

def Factor():
    global dictList

def Factors():
    global dictList



def main():
    global dictList
    fileName = sys.argv[1]
    listOfStatements = processInput(fileName)
    initDict(len(listOfStatements))
    # print(dictList)
    print(listOfStatements)
    print()
    tokenize(listOfStatements)

    Start()
    # print(dictList)

    # print(next(["&"],0,0))

    # tokenize(listOfStatements)

    for line in range(len(dictList)):
        # print("Line "+str(line))
        print(dictList[line])
    # print(dictList)

main()

