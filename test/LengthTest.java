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
    public void shouldCompareDifferentMeasurementTypesEqualInLength() throws Exception {
        assertEquals(new Feet(6), new Yard(2));
    }

    @Test
    public void shouldCompareDifferentMeasurementTypesNotEqualInLength() throws Exception {
        assertNotEquals(new Feet(6), new Yard(3));
    }


    @Test
    public void shouldAddSameMeasurementTypesAndCompareEqualLengths() throws Exception {
        assertEquals((new Inch(13).add(new Inch(11))), new Feet(2));
    }

    @Test
    public void shouldAddSameMeasurementTypesAndCompareDifferentLengths() throws Exception {
        assertNotEquals((new Yard(13).add(new Yard(13))), new Feet(2));
    }

    @Test
    public void shouldAddDifferentMeasurementTypesAndCompareEqualLengths() throws Exception {
        assertEquals((new Feet(3).add(new Yard(2))), new Yard(3));
    }
}


