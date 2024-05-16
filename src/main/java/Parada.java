import java.io.Serializable;

public class Parada extends Linea implements Serializable {

    public static String nombre;
    protected static String id_Linea;
    private String barrio;
    private String salidas;


    // Constructor


    public Parada(String id_Linea, String nombre) {
        super(Linea.id);
        id_Linea = Linea.id;
        this.id_Linea = id_Linea;
        this.nombre = nombre;
    }




    // Método toString para representación textual de la parada
    @Override
    public String toString() {
        return "Parada{" +
                "nombre='" + nombre + '\'' +
                ", barrio='" + barrio + '\'' +
                ", salidas='" + salidas + '\'' +
                '}';
    }
}
