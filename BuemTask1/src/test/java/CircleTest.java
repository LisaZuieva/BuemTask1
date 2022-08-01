import main.java.Circle;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CircleTest {
    Circle firstTest = new Circle(1);
    int diametr = firstTest.getDiametr();
    int firstTestResault = 2;

    @Test
    public void testDiametr(){
        System.out.println("@Test getDiametr(): " + diametr + " = " + firstTestResault);
        assertEquals(firstTestResault, diametr);
    }
}
