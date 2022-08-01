import main.java.Rectangle;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RectangleBreadthTest {
    Rectangle testBreadth = new Rectangle(1,2);
    double breadth = testBreadth.getBreadth();
    double breadthResault = 1.0;

    @Test
    public void testBreadth(){
        System.out.println("@Test getBreadth(): " + breadth + " = " + breadthResault);
        assertEquals(breadth, breadthResault);
    }
}
