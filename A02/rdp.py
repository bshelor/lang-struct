import sys

global dictList
dictList = []

def initDict(length):
    global dictList
    lst = ["term","factor","keyword","parenthesis","EOF","terminal"]
    for i in range(length):
        dictList.append({})
        for item in lst:
            dictList[i][item] = {}
            

def processInput(fileName):
    file = open(fileName, "r")
    statement = ""
    lst = []
    for x in file:
        for char in x:
            if char == ";":
                lst.append(statement)
                statement = ""
            elif char not in [" ", "\n"]:
                statement+=char
    file.close() 
    return lst

def tokenize(lst):
    global dictList
    for i in range(len(lst)):
        position = 0
        for char in lst[i]:
            if char in ["+","-"]:
                dictList[i]["term"][position] = char
            elif char in ["*","/"]:
                dictList[i]["factor"][position] = char
            elif char in ["MOD","EOF"]:
                dictList[i]["keyword"][position] = char
            elif char in ["(",")"]:
                dictList[i]["parenthesis"][position] = char
            elif char == ";":
                dictList[i]["EOF"][position] = char
            else:
                dictList[i]["terminal"][position] = char
            position+=1


def main():
    global dictList
    fileName = sys.argv[1]
    listOfStatements = processInput(fileName)
    initDict(len(listOfStatements))
    print(dictList)
    print(listOfStatements)

    tokenize(listOfStatements)

    print(dictList)

main()

