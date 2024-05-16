import java.io.*;
import java.util.ArrayList;

public class Estacion extends Parada {
    private static String idLinea;
    private static String nombreParada;
    private String nombreEstacion;

    static String archivoPath = "C:\\Users\\Sergi\\Downloads\\Red de metro\\src\\ArrayL1.data";

    public Estacion(String idLinea, String nombreParada) {
        super(idLinea, nombreParada);
        this.idLinea = idLinea;
        this.nombreParada = nombreParada;
        this.nombreEstacion = getNombreEstacion();
    }

    public static String getNombreEstacion() {
        return nombreParada+ "_" + idLinea;
    }

    @Override
    public String toString() {
        return nombreEstacion;
    }

    public static ArrayList<Estacion> escribirVector() {
        ArrayList<Estacion> arrayL1 = new ArrayList<>();
        try (FileOutputStream fileOut = new FileOutputStream(archivoPath);
             ObjectOutputStream objectOut = new ObjectOutputStream(fileOut)) {

            arrayL1.add(new Estacion("L1", "Fondo"));
            arrayL1.add(new Estacion("L1", "Santa Coloma"));
            arrayL1.add(new Estacion("L1", "Baró de Viver"));
            arrayL1.add(new Estacion("L1", "Trinitat Vella"));
            arrayL1.add(new Estacion("L1", "Torras i Bages"));
            arrayL1.add(new Estacion("L1", "Sant Andreu"));
            arrayL1.add(new Estacion("L1", "Fabra i Puig"));
            arrayL1.add(new Estacion("L1", "La Segrera"));
            arrayL1.add(new Estacion("L1", "Navas"));
            arrayL1.add(new Estacion("L1", "Clot"));
            arrayL1.add(new Estacion("L1", "Glòries"));
            arrayL1.add(new Estacion("L1", "Marina"));
            arrayL1.add(new Estacion("L1", "Arc de Trionf"));
            arrayL1.add(new Estacion("L1", "Catalunya"));
            arrayL1.add(new Estacion("L1", "Urquinaona"));
            arrayL1.add(new Estacion("L1", "Universitat"));
            arrayL1.add(new Estacion("L1", "Urgell"));
            arrayL1.add(new Estacion("L1", "Rocafort"));
            arrayL1.add(new Estacion("L1", "Espanya"));
            arrayL1.add(new Estacion("L1", "Hostafrancs"));
            arrayL1.add(new Estacion("L1", "Plaça de Sants"));
            arrayL1.add(new Estacion("L1", "Mercat Nou"));
            arrayL1.add(new Estacion("L1", "Santa Eulàlia"));
            arrayL1.add(new Estacion("L1", "Torrassa"));
            arrayL1.add(new Estacion("L1", "Florida"));
            arrayL1.add(new Estacion("L1", "Can Serra"));
            arrayL1.add(new Estacion("L1", "Rambla Just Oliveras"));
            arrayL1.add(new Estacion("L1", "Avinguda Carrilet"));
            arrayL1.add(new Estacion("L1", "Bellvitge"));
            arrayL1.add(new Estacion("L1", "Hospital de Bellvitge"));


            // Escribir el ArrayList en el archivo
            objectOut.writeObject(arrayL1);

            System.out.println("Objetos escritos correctamente en el archivo.");
        } catch (IOException e) {
            System.err.println("Error al escribir en el archivo: " + e.getMessage());
            e.printStackTrace();
        }
        return arrayL1;
    }

    public static ArrayList<String> leerVector() {
        ArrayList<Estacion> arrayL1 = new ArrayList<>();
        ArrayList<String> toStringValues = new ArrayList<>();

        try (FileInputStream fileIn = new FileInputStream(archivoPath);
             ObjectInputStream objectIn = new ObjectInputStream(fileIn)) {

            // Leer el ArrayList desde el archivo
            arrayL1 = (ArrayList<Estacion>) objectIn.readObject();
            System.out.println("Objetos leídos correctamente desde el archivo:");

            // Obtener la salida del método toString() para cada elemento
            for (Estacion estacion : arrayL1) {
                toStringValues.add(estacion.toString());
            }
            System.out.println("Contenido del ArrayList toStringValues:");
            for (String value : toStringValues) {
                System.out.println(value);
            }

        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Error al leer desde el archivo: " + e.getMessage());
            e.printStackTrace();
        }
        return toStringValues;
    }
}
