import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.io.Serializable;
import java.util.ArrayList;

public class Linea implements Serializable {
    protected static String id;
    // Atributos
    protected String inicio;
    protected String fin;

    // Constructor
    public Linea(String id, String inicio, String fin) {
        this.id = id;
        this.inicio = inicio;
        this.fin = fin;
    }

    public Linea(String id) {
        this.id = id;
    }


    // Método toString para representación textual de la línea
    @Override
    public String toString() {
        return "Linea{" +
                "id='" + id + '\'' +
                ", inicio='" + inicio + '\'' +
                ", fin='" + fin + '\'' +
                '}';
    }


    public static void EscribirLinea () {
        ArrayList<String> arrayL1 = Estacion.leerVector();
        String archivePath = "C:\\Users\\Sergi\\Downloads\\Red de metro\\src\\ArrayL1.txt";
        File file = new File(archivePath);
        try {
            PrintStream output = new PrintStream(file);
            for (int i = 0; i < arrayL1.size(); ++i) {
                output.println(arrayL1.get(i));
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
