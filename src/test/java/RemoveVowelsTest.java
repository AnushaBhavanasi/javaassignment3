import org.junit.Test;

import static org.junit.Assert.*;

public class RemoveVowelsTest {
    RemoveVowels  oe = new RemoveVowels();;


    @Test
    public void removeVowels() {
        String[] str2 = {"India", "pakistan", "uzbekistan", "melbourne"};
        String[] str = oe.vowelsRemove(str2);
        String[] str1 = {"Ind", "pkstn", "zbkstn", "mlbrn"};
        assertArrayEquals(str1, str);


    }
    /*@Test
    public void AllVowels() {
        String[] str2 = {"aeiou"};
        String[] str = oe.vowelsRemove(str2);
        String[] str1 = {""};
        assertArrayEquals(str1, str);
    }*/
    @Test
    public void AllVowels() {
        oe = new RemoveVowels();
        String[] str2 = {"aeiou"};

        String[] str = oe.vowelsRemove(str2);
        String[] str1 = {""};

        assertArrayEquals(str1, str);


    }

    @Test
    public void VowelsConsonants() {
        oe = new RemoveVowels();
        String[] str2 = {"d", "a", "e", "f"};

        String[] str = oe.vowelsRemove(str2);
        String[] str1 = {"d","","","f",} ;

        assertArrayEquals(str1, str);


    }
    @Test
    public void nullPointer() {
        oe = new RemoveVowels();
        String s = "";

        String str = oe.nullPointerException(s);
        assertEquals("input string cannot be null",str);
    }
    @Test

    public void places2() {
        String str3 = "eaou";
        String result = oe.removeVowels(str3);
        assertEquals("", result);


    }
}



