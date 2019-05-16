import org.junit.Test;

import static org.junit.Assert.*;

public class OddEvenTest {
        OddEven oe;
        @Test
    public void oddEvenCheck()
        {
            oe=new OddEven();
            int a[]={2,31,45,62};
            String[] str=oe.oddEven(a);
            String[] str2={"even","odd","odd","even"};
            assertArrayEquals(str,str2);
        }
        @Test
    public void primeCheck()
        {
            oe=new OddEven();
            int a[]={2,31,45,62};
            int[] r=oe.primeChecking(a);
            int[] res={45,62};
            assertArrayEquals(res,r);

        }
    @Test
    public void reverseArray()
    {
        oe=new OddEven();
        int a[]={43,5,8,1};
        int[] r=oe.reverse(a);
        int[] res={1,8,5,43};
        assertArrayEquals(res,r);
    }
}