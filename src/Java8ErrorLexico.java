import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;

/**
 * Created by trossky on 6/14/15.
 */

public class Java8ErrorLexico  extends  Java8ErrorBase{

    @Override
    public void syntaxError(Recognizer<?, ?> recognizer,
                            Object offendingSymbol, int linea, int charPositionInLine, String msg,
                            RecognitionException e) {
        System.out.printf("\033[35m>>>Error Léxico: Línea: %d:%d >>> %s", linea, charPositionInLine, msg.concat(" caracter o caracteres no válidos.\n"));
        System.out.print("\033[30m");
    }
}
