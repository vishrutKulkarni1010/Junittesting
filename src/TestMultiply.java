import org.junit.Assert;
import org.junit.Test;

public class TestMultiply {
    @Test
    public void testMultiply(){
        System.out.println("Test Multiply getting executed");
        Calculator calc = new Calculator();
        int a=5;
        int b=5;
        int expected = 25;
        int actual = calc.multiply(a,b);
        Assert.assertEquals(expected,actual);
    }
}
