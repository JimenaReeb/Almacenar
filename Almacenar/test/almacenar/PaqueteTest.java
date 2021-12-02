package almacenar;
import almacenar.Paquete;
import org.junit.Test;
import static org.junit.Assert.*;
public class PaqueteTest {
    
    public PaqueteTest() {
    }
    @Test
    public void testGetVolumen() {
        System.out.println("getVolumen");
        Paquete instance = new Paquete (1.0);
        double expResult = 1.0;
        double result = instance.getVolumen();
        assertEquals(expResult, result, 0.0);
    }
    
}
