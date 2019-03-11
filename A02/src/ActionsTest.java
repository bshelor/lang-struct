import org.antlr.v4.runtime.*;

import java.io.FileInputStream;

public class ActionsTest {
    public static void main(String[] args) throws Exception {
        CharStream input = CharStreams.fromFileName("input.txt");
        AntlrActionsLexer lexer = new AntlrActionsLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        AntlrActionsParser parser = new AntlrActionsParser(tokens);
        parser.block(); // parse the input stream!
    };
}
