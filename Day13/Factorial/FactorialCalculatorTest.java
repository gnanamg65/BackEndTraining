<<<<<<< HEAD
package Day13.Factorial;

import org.junit.Assert;
import org.junit.Test;

public class FactorialCalculatorTest {
    @Test
    public void testFactorialZero() {
        FactorialCalculator fc = new FactorialCalculator();
        Assert.assertEquals(1, fc.factorial(0));
    }
    @Test
    public void testFactorialSmallPositiveNumbers() {
        FactorialCalculator fc = new FactorialCalculator();
        Assert.assertEquals(1, fc.factorial(1));
        Assert.assertEquals(2, fc.factorial(2));
        Assert.assertEquals(6, fc.factorial(3));
        Assert.assertEquals(24, fc.factorial(4));
        Assert.assertEquals(120, fc.factorial(5));
    }

    @Test
    public void testFactorialLargeNumber() {
        FactorialCalculator fc = new FactorialCalculator();
        Assert.assertEquals(3628800, fc.factorial(10));
    }

    @Test
    public void testFactorialNegativeInput() {
        FactorialCalculator fc = new FactorialCalculator();
        IllegalArgumentException exception = Assert.assertThrows(IllegalArgumentException.class, () -> {
            fc.factorial(-5);
        });
        Assert.assertEquals("Number must be non-negative", exception.getMessage());
    }
}
=======
package Day13.Factorial;

import org.junit.Assert;
import org.junit.Test;

public class FactorialCalculatorTest {
    @Test
    public void testFactorialZero() {
        FactorialCalculator fc = new FactorialCalculator();
        Assert.assertEquals(1, fc.factorial(0));
    }
    @Test
    public void testFactorialSmallPositiveNumbers() {
        FactorialCalculator fc = new FactorialCalculator();
        Assert.assertEquals(1, fc.factorial(1));
        Assert.assertEquals(2, fc.factorial(2));
        Assert.assertEquals(6, fc.factorial(3));
        Assert.assertEquals(24, fc.factorial(4));
        Assert.assertEquals(120, fc.factorial(5));
    }

    @Test
    public void testFactorialLargeNumber() {
        FactorialCalculator fc = new FactorialCalculator();
        Assert.assertEquals(3628800, fc.factorial(10));
    }

    @Test
    public void testFactorialNegativeInput() {
        FactorialCalculator fc = new FactorialCalculator();
        IllegalArgumentException exception = Assert.assertThrows(IllegalArgumentException.class, () -> {
            fc.factorial(-5);
        });
        Assert.assertEquals("Number must be non-negative", exception.getMessage());
    }
}
>>>>>>> 9f4db15e6bd5544983a99aced35c95885731322f
