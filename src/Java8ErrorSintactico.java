import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;

/**
 * Created by trossky on 6/14/15.
 */
public class Java8ErrorSintactico extends Java8ErrorBase {

    @Override
    public void syntaxError(Recognizer<?, ?> recognizer,
                            Object offendingSymbol, int linea, int charPositionInLine, String msg,
                            RecognitionException e) {
        //System.out.printf("\nError Syntactico : linea = %d, columna = %d -> %s", linea, charPositionInLine, msg.concat(" Agregar elemento faltante"));
        System.out.printf( "\033[31m>>>Error Sintáctico: línea: %d:%d >>> %s", linea, charPositionInLine, msg.concat(" Agregar o quitar elemento indicado.\n"));
        System.out.print("\033[30m");
    }
}
