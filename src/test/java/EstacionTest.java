import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.io.File;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;

class EstacionTest {

    static String archivoPath = "C:\\Users\\Sergi\\Downloads\\ProvaTest\\src\\main\\java\\ArrayL1.data";

    //Arrengement 1
    @BeforeEach
    void setUp1() {
        File file = new File(archivoPath);
        if (file.exists()) {
            file.delete();
        }
    }

    //Test 1 Mètode a testejar: Linea.Linea(String id, String inicio, String fin)
    @Test
    void testCrearLinea() {
        Linea linea = new Linea("L1", "Fondo", "Hospital de Bellvitge");
        assertNotNull(linea);
        assertEquals("L1", linea.id);
        assertEquals("Fondo", linea.inicio);
        assertEquals("Hospital de Bellvitge", linea.fin);
    }

    //Test 2 Mètode a testejar: Linea.toString()
    @Test
    void testToStringLinea() {
        Linea linea = new Linea("L1", "Fondo", "Hospital de Bellvitge");
        String expected = "Linea{id='L1', inicio='Fondo', fin='Hospital de Bellvitge'}";
        assertEquals(expected, linea.toString());
    }

    //Test 3 Mètode a testejar: Linea.EscribirLinea()
    @Test
    void testEscribirLinea() {
        Linea.EscribirLinea();
        File file = new File("C:\\Users\\Sergi\\Downloads\\Red de metro\\src\\ArrayL1.txt");
        assertTrue(file.exists());
    }

    //Arrengement 2
    @BeforeEach
    void setUp2() {
        String idLinea = "L1";
        String nombreParada = "Fondo";
        Estacion estacion = new Estacion(idLinea, nombreParada);
    }

    //Test 4 Mètode a testejar: Estacion.getNombreEstacion()
    @Test
    void testGetNombreEstacion1() {
        String nombreEstacion = Estacion.getNombreEstacion();
        assertEquals("Fondo_L1", nombreEstacion);
    }

    //Test 5 Mètode a testejar: Estacion.escribirVector()
    @Test
    void testEscribirVector() {
        ArrayList<Estacion> arrayL1 = Estacion.escribirVector();
        assertTrue(arrayL1.size() > 0, "El ArrayList debería contener elementos");
    }

    //Test 6 Mètode a testejar: Estacion.leerVector()
    @Test
    void testLeerVectorNoNulo() {
        ArrayList<String> result = Estacion.leerVector();
        assertNotNull(result);
    }

    //Test 7 Mètode a testejar: Estacion.leerVector()
    @Test
    void testLeerVectorContenidoCorrecto() {
        ArrayList<String> result = Estacion.leerVector();
        assertFalse(result.isEmpty());
        assertTrue(result.contains("Fondo_L1"));
    }

    //Test 8 Mètode a testejar: Parada.toString()
    @Test
    void testToString() {
        Parada parada = new Parada("L1", "Fondo");
        String expected = "Parada{nombre='Fondo', barrio='null', salidas='null'}";
        assertEquals(expected, parada.toString());
    }
}
