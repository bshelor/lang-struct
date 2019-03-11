grammar AntlrActions;

block
    locals [
        List<String> symbols = new ArrayList<String>()
    ]
        : start {System.out.println("symbolTable="+$symbols);}
        ;

start : list 'EOF' {System.out.println("EOF");};
list : expr ';' {System.out.println(";");} list | ;
expr : term terms;
terms : '+' term {System.out.print("+ ");} terms | '-' term {System.out.print("- ");} terms | ;
term : factor factors;
factors : '*' factor {System.out.print("* ");} factors | '/' factor {System.out.print("/ ");} factors | 'MOD' factor {System.out.print("MOD ");} factors | ;
factor : '(' expr ')' | ID {System.out.print($ID.text+" ");} {$block::symbols.add($ID.text);} | NUM {System.out.print($NUM.text+" ");};

ID : [A-Za-z]([A-Za-z] | [0-9])*;
NUM : [0-9]([0-9])*;
WS : [ \t\r\n] -> skip;