import org.junit.Test;

import static org.junit.Assert.*;

public class AverageMarksTest {
    AverageMarks am=new AverageMarks();
    public void inBetweenZeroAndHundred()
    {
        String z=am.computeMarksEqual(20);
        assertEquals("true",z);
    }
    @Test
    public void greaterThan()
    {
        String z=am.computeMarksGreater(121);
        assertEquals("Input should not be greater than 100",z);
    }
    @Test
    public void lessThanZero()
    {
        String z=am.computeMarksLess(-5);
        assertEquals("Input should not be less than 0",z);
    }


}