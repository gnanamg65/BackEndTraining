<<<<<<< HEAD
package Day13.PalindromString;

import org.junit.Assert;
import org.junit.Test;

public class palindromTest {

    @Test
    public void testValidPalindrom() {
        StringPalindrom sp = new StringPalindrom();
        Assert.assertTrue(sp.isPalindrom("madam"));
        Assert.assertTrue(sp.isPalindrom("A man a plan a canal Panama"));
    }
    @Test
    public void testNonPalindrom() {
        StringPalindrom sp = new StringPalindrom();
        Assert.assertFalse(sp.isPalindrom("hello"));
    }

}
=======
package Day13.PalindromString;

import org.junit.Assert;
import org.junit.Test;

public class palindromTest {

    @Test
    public void testValidPalindrom() {
        StringPalindrom sp = new StringPalindrom();
        Assert.assertTrue(sp.isPalindrom("madam"));
        Assert.assertTrue(sp.isPalindrom("A man a plan a canal Panama"));
    }
    @Test
    public void testNonPalindrom() {
        StringPalindrom sp = new StringPalindrom();
        Assert.assertFalse(sp.isPalindrom("hello"));
    }

}
>>>>>>> 9f4db15e6bd5544983a99aced35c95885731322f
