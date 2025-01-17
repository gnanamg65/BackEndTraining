
package Day13.Prime;
import org.junit.Assert;
import org.junit.Test;
public class PrimeCheckerTest {
    @Test
    public void testValidPrimes() {
        PrimeChecker pc = new PrimeChecker();
        Assert.assertTrue(pc.isPrime(2));
        Assert.assertTrue(pc.isPrime(3));
        Assert.assertTrue( pc.isPrime(5));
        Assert.assertTrue(pc.isPrime(7));
        Assert.assertTrue( pc.isPrime(13));
    }
    @Test
    public void testNonPrimeNumbers() {
        PrimeChecker pc = new PrimeChecker();
        Assert.assertFalse(pc.isPrime(4));
        Assert.assertFalse( pc.isPrime(6));
        Assert.assertFalse( pc.isPrime(9));
    }
    @Test
    public void testEdgeCases() {
        PrimeChecker pc = new PrimeChecker();
        Assert.assertFalse( pc.isPrime(0));
        Assert.assertFalse( pc.isPrime(1));
        Assert.assertFalse(pc.isPrime(-5));
    }
    @Test
    public void testLargePrime() {
        PrimeChecker pc = new PrimeChecker();
        Assert.assertTrue( pc.isPrime(104729));
    }
    @Test
    public void testLargeNonPrime() {
        PrimeChecker pc = new PrimeChecker();
        Assert.assertFalse( pc.isPrime(1000000));
    }
}

