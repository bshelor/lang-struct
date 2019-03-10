import sys

global dictList, validTags, tokenIter, symbolTable

dictList = []
symbolTable = []
validTags = ['NUM','ID','FACTOR','TERM','MOD','OTHER','EXPR_END','PAREN']
tokenIter = {'line': 0, 'iter': 0}

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
            if char == ";" or "EOF" in statement+char:
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
        dictList[line] = []
        pos = 0
        while pos < len(lst[line]):
            item, pos, tag = next(lst[line], pos)
            dictList[line].append({'item': item, 'line_pos': (pos-len(item)), 'line_num': line+1, 'tag': tag})    

def error(type, token, msg):
    print("\n"+type+" Error ----------------------------------")
    print("on line "+str(token["line_num"])+", near '"+str(token["item"])+"'")
    print(msg)
    exit()

def token():
    global tokenIter, dictList

    if tokenIter['line'] == len(dictList):
        return "done"

    val = dictList[tokenIter['line']][tokenIter['iter']]

    if tokenIter['iter'] == ( len(dictList[tokenIter['line']]) - 1 ):
        tokenIter['line'] += 1
        tokenIter['iter'] = 0
    else:
        tokenIter['iter'] += 1

    return val

def peek():
    global tokenIter, dictList

    return dictList[tokenIter['line']][tokenIter['iter']]

def match(char):
    if char != ';':
        print(char, end=" ")
    else:
        print(char)

def Start():
    global validTags

    val = peek()

    if val['tag'] in validTags:
        List()
    elif val['tag'] == "EOF":
        EOF()
    else:
        error("Syntax", val, "Invalid input")
    EOF()

def EOF():
    match("EOF")
    print()
    dumpSymbolTable()

def List():
    val = peek()
    if val['item'] == '(' or val['tag'] in ["NUM","ID"]:
        Expr()
        match(';')
        token()
        List()
    else:
        return

def Expr():
    Term()
    Terms()

def Term():
    Factor()
    Factors()

def Terms():
    val = peek()
    if val['item'] in ['+','-']:
        token()
        Term()
        match(val['item'])
        Terms()
    else:
        return

def Factor():
    global symbolTable
    val = peek()
    if val['item'] == '(':
        token()
        match(val['item'])
        Expr()
        val = token()
        if val['item'] != ')':
            error("Syntax", val, "Must end an expression with a closing ')'")
        else:
            match(val['item'])
    elif val['tag'] == 'ID':
        token()
        match(val['item'])
        symbolTable.append(val)
    elif val['tag'] == 'NUM':
        token()
        match(val['item'])

def Factors():
    val = peek()
    if val['item'] in ['*','/']:
        token()
        Factor()
        match(val['item'])              ## print '*' or '/'
        Factors()
    elif val['tag'] == 'MOD':
        token()
        Factor()
        match(val['item'])
        Factors()
    elif val['tag'] == 'ID':
        error("Syntax", val, "Can't have letters directly after a number. Hint: try putting a space or an operand in between")
    else:
        return

def dumpSymbolTable():
    global symbolTable
    print("Symbol Table:", end=" ")
    for i in symbolTable:
        print(str(i['item'])+' (line '+str(i['line_num'])+':'+str(i['line_pos'])+')', end=", ")



def main():
    global dictList
    fileName = sys.argv[1]
    listOfStatements = processInput(fileName)
    initDict(len(listOfStatements))

    print(listOfStatements)
    print(dictList)
    
    tokenize(listOfStatements)

    print("\n", "-------------Postfix Translation and Symbol Table Dump-------------")
    Start()
    print()

main()