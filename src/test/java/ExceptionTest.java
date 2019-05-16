import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ExceptionTest {
    Exception e;


    @Before
    public void setUp() {
        //arrange
        e = new Exception();


    }

    @After
    public void tearDown() {
        //arrange
        e = null;


    }

    @Test
    public void ArithmeticException() { //Not asked in P.e 3


        //act
        String result = e.ArithmeticException(3, 0);

        //assert
        assertEquals("Can't divide a number by 0", result);
    }

    @Test
    public void NegativeArraySizeException() {
        String result = e.NegativeArraySizeException(-8);
        assertEquals("Can't create array of negative size", result);
    }


    @Test
    public void NullPointerException() {
        String result = e.NullPointerException(0);
        assertEquals("NullPointerException..", result);
    }

    @Test
    public void ArrayIndexOutOfBound() {
        String result = e.ArrayIndexOutOfBound(9);
        assertEquals("Wrong index number, please enter correct number. ", result);
    }

    @Test
    public void StringIndexOutOfBoundsException() {
        String result = e.StringIndexOutOfBoundsException(5);
        assertEquals("Wrong character index number, please enter correct number. ", result);
    }
}