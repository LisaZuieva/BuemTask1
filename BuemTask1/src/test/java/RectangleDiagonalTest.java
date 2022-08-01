import main.java.Rectangle;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RectangleDiagonalTest {
    Rectangle testDiagonal = new Rectangle(4, 8);
    double diagonal = testDiagonal.getDiagonal();
    double diagonalResault = 5.657;

    @Test
    public void testDiagonal() {
        System.out.println("@Test getDiagonal(): " + diagonal + " = " + diagonalResault);
        assertEquals(diagonal, diagonalResault);
    }
}
