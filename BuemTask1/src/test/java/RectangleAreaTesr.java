import main.java.Rectangle;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RectangleAreaTesr {
    Rectangle testArea = new Rectangle(2,4);
    int area = testArea.getArea();
    int areaResault = 8;

    @Test
    public void testArea(){
        System.out.println("@Test getArea(): " + area + " = " + areaResault);
        assertEquals(area, areaResault);
    }
}
