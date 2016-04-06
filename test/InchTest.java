import Length.Inch;
import Length.Feet;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class InchTest {

    @Test
    public void OneYardEqualsThreeFeet() throws Exception {
        assertEquals(new Inch(12), new Inch(12));
    }

    @Test
    public void OneYardDoesNotEqualToTwoFeet() throws Exception {
        assertNotEquals(new Feet(12), new Inch(4));
    }

}
