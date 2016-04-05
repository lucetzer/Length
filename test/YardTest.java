import Length.*;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class YardTest {

    @Test
    public void TwoYardMeasurementsEqualInLengthShouldBeEqual() throws Exception {
        assertEquals(new Yard(3), new Yard(3));
    }

    @Test
    public void TwoYardMeasurementsNotEqualInLengthShouldBeNotBeEqual() throws Exception {
        assertNotEquals(new Yard(3), new Yard(4));
    }

    @Test
    public void OneLengthShouldEqualToEquivalentInYard() throws Exception {
        assertEquals(new Yard(1760), new Length(1));
    }

    @Test
    public void OneLengthShouldNotEqualWrongConversionInYard() throws Exception {
        assertNotEquals(new Yard(1761), new Length(1));
    }
}