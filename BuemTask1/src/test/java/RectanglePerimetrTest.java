import main.java.Rectangle;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RectanglePerimetrTest {
    Rectangle testPerimetr = new Rectangle(3, 6);
    int perimetr = testPerimetr.getPerimetr();
    int perimertResault = 18;

    @Test
    public void testPerimetr() {
        System.out.println("@Test getPerimetr(): " + perimetr + " = " + perimertResault);
        assertEquals(perimetr, perimertResault);
    }
}
