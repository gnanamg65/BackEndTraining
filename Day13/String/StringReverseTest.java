package Day13.String;
import org.junit.Test;
import org.junit.Assert;

public class StringReverseTest {

    @Test
    public void testEmptyString() {
        StringReverse sr = new StringReverse();
        String result = sr.reverseString("");
        Assert.assertEquals("", result);
    }

    @Test
    public void testSingleCharacter() {
        StringReverse sr = new StringReverse();
        String result = sr.reverseString("A");
        Assert.assertEquals("A", result);
    }

    @Test
    public void testSpecialCharacters() {
        StringReverse sr = new StringReverse();
        String result = sr.reverseString("@123!");
        Assert.assertEquals("Reversing '@123!' should return '!321@'.", "!321@", result);
    }

}
