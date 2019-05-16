import org.junit.Test;

import static org.junit.Assert.*;

public class StringArrayTest {
    StringArray sa;
    @Test

    public  void compareTest()
    {
        String[] s1={"8","A","39"};
        String[] s2={"8","B","39"};
        String s="not equal";
        assertEquals(s,sa.compareString(s1,s2));

    }
    @Test
    public void duplicateRemove()
    {
        String[] a1={"10","20","10","30"};
        String s="duplicates found";
        assertEquals(s,sa.removeDuplicateElements(a1));
    }
    @Test
    public void appendString()
    {
        String[] a1={"10","20","30"};
        String[] a2={"50","20","40"};
        String[] s={"10","20","30","50"};
        assertArrayEquals(s,sa.isAppen(a1,a2));
    }

    @Test
    public void prependMid()
    {
        String[] a1={"10","20","30"};
        String[] a2={"50","60","70"};
        String[] s={"60","10","20","30"};
        assertArrayEquals(s,sa.isPrepen(a1,a2));
    }


}
