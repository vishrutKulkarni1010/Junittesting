import org.junit.Assert;
import org.junit.Test;

public class TestDivision {
    @Test
    public void testDivide() throws Exception {
        System.out.print("Test Divide getting executed");
        Calculator calc = new Calculator();
        int a =10;
        int b = 5;
        int expected=2;
        Assert.assertEquals(expected,calc.divide(a,b));
    }
    @Test(expected = Exception.class)
    public void testDivideException() throws Exception {
        System.out.print("Test Divide getting executed");
        Calculator calc = new Calculator();
        int a =10;
        int b = 0;
        int expected=2;
        Assert.assertEquals(expected,calc.divide(a,b));
    }
}

