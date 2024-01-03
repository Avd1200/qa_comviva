package stringAssertions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import stringutils.StringUtils;

import static org.junit.jupiter.api.Assertions.*;

public class StringTests
{
    @Test
    public void testReverse(){
        StringUtils obj = new StringUtils();

        try{
            obj.reverse(null);
            fail("Exception should have occurred");
        }
        catch (NullPointerException e){
            assertEquals(e.getMessage(),"Cannot invoke \"String.length()\" because \"str\" is null");
        }

        Assertions.assertAll(
                () -> Assertions.assertEquals("arga",obj.reverse("agra"),"Reversed does not match original"),
                () -> Assertions.assertEquals("",obj.reverse(""))
        );
    }

    @Test
    public void testPalindrome(){
        StringUtils obj = new StringUtils();

        try{
            obj.isPalindrome(null);
        }
        catch (NullPointerException e){
            assertEquals(e.getMessage(),"Cannot invoke \"String.length()\" because \"str\" is null");
        }

        Assertions.assertAll(
                () -> Assertions.assertTrue(obj.isPalindrome("radar"),"Not a palindrome"),
                () -> Assertions.assertTrue(obj.isPalindrome("")),
                () -> Assertions.assertFalse(obj.isPalindrome("Malayalam")),
                () -> Assertions.assertFalse(obj.isPalindrome("ab"))
        );
    }

    @Test
    public void testConcatenation(){
        StringUtils obj = new StringUtils();
        assertEquals("",obj.concatenate("",""));
        assertNotEquals("NamasteIndia",obj.concatenate("Namaste ","India"));
        assertEquals("NewDelhi",obj.concatenate("New","Delhi"));
    }

    @Test
    public void testOccurrences(){
        StringUtils obj = new StringUtils();
        assertEquals(0,obj.countOccurrences("",'c'));
        assertEquals(2,obj.countOccurrences("Arunachal",'a'));
//        assertEquals(1,obj.countOccurrences("sdf",' '));
    }
}
