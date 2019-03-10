import org.antlr.v4.runtime.*;

import java.io.FileInputStream;

public class ActionsTest {
    public static void main(String[] args) throws Exception {
//        FileInputStream inputstream = new FileInputStream("inputs/test.txt");
//        ANTLRInputStream input = new ANTLRInputStream(inputstream);
        CharStream input = CharStreams.fromFileName("input.txt");
        System.out.println(input);
        AntlrActionsLexer lexer = new AntlrActionsLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
//        AntlrActionsListenerBaseListener listener = new AntlrActionsBaseListener();
        AntlrActionsParser parser = new AntlrActionsParser(tokens);
        parser.start(); // parse the input stream!
    };
}
