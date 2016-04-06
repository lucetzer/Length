import Length.*;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class LengthTest {

    @Test
    public void OneLengthShouldEqualToEquivalentInYard() throws Exception {
        assertEquals(new Yard(1760), new Mile(1));
    }

    @Test
    public void OneLengthShouldNotEqualWrongConversionInYard() throws Exception {
        assertNotEquals(new Yard(1761), new Mile(1));
    }

    @Test
    public void OneYardEqualsThreeFeet() throws Exception {
        assertEquals(new Inch(12), new Feet(1));
    }

    @Test
    public void shouldAddSameLengthsTogetherAndReturnInInches() throws Exception {
        assertEquals(26, new Inch(13).add(new Inch(13)), 0);
        assertEquals(96, new Feet(5).add(new Feet(3)), 0);
        assertEquals(443520, new Mile(4).add(new Mile(3)), 0);
        assertEquals(360, new Yard(5).add(new Yard(5)), 0);
    }

    @Test
    public void shouldCompareDifferentMeasurementTypesEqualInLength() throws Exception {
        assertEquals(new Feet(6), new Yard(2));
    }

    @Test
    public void shouldCompareDifferentMeasurementTypesNotEqualInLength() throws Exception {
        assertNotEquals(new Feet(6), new Yard(3));
    }


    @Test
    public void shouldAddAndCompareDifferentMeasurementTypesEqualInLength() throws Exception {
        float inch = new Inch(13).add(new Inch(11));
        float feet = new Feet(2).convertToInch();
        assertEquals(feet, inch, 0);
    }

    @Test
    public void shouldAddAndCompareDifferentMeasurementTypesNotEqualInLength() throws Exception {
        float inch = new Yard(13).add(new Yard(13));
        float feet = new Feet(2).convertToInch();
        assertNotEquals(feet, inch, 0);
    }
}


