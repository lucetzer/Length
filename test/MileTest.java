import Length.Mile;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class MileTest {

    @Test
    public void TwoMileMeasurementsEqualInLengthShouldBeEqual() throws Exception {
        assertEquals(new Mile(3), new Mile(3));
    }

    @Test
    public void TwoMileMeasurementsNotEqualInLengthShouldBeNotBeEqual() throws Exception {
        assertNotEquals(new Mile(3), new Mile(2));
    }

}
