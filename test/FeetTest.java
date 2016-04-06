import Length.Feet;
import Length.Yard;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class FeetTest {

    @Test
    public void OneYardEqualsThreeFeet() throws Exception {
        assertEquals(new Feet(3), new Feet(3));
    }

    @Test
    public void OneYardDoesNotEqualToTwoFeet() throws Exception {
        assertNotEquals(new Feet(2), new Feet(1));
    }
}

