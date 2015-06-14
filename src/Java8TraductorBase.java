import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by trossky on 6/14/15.
 */
public class Java8TraductorBase extends  Java8BaseListener {


    /*
    //PROCEDIMIENTO PARA GENERAR EL ARCHIVO.dot
    public void crearDOT() throws IOException {

        String ruta = "Archivo.py";
        File archivo = new File(ruta);
        BufferedWriter bw;

        bw = new BufferedWriter(new FileWriter(archivo));
        bw.write(
                //Modifica figura del Gafo.
                "digraph G {\n"
                        + "\tranksep = .25; \n"
                        + "\tedge [arrowsize=.5];\n"
                        + "\tnode [sahpe=ellipse, fontname=\"Arial\", fontsize=9, fixedsize=true, height=.45];\n"
        );
        bw.write("\t");
        for(Map.Entry<String, ArrayList<String>> entry : tablaDOT.entrySet()) {
            bw.write(entry.getKey() + "; ");
        }
        bw.write("\n");

        for(Map.Entry<String, ArrayList<String>> entry : tablaDOT.entrySet()) {
            for(String x : entry.getValue() ){

                bw.write("\t" + entry.getKey() + " -> " + x + ";\n");
            }

        }

        bw.write("}");

        bw.close();

    }
*/
}
