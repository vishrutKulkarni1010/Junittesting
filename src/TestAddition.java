import org.junit.Assert;
import org.junit.Test;

public class TestAddition {
    @Test
    public void testSum(){
        System.out.println("Test Sum getting executed");
        Calculator calc = new Calculator();
        int a = 4;
        int b= 5;
        int expected = 9;
        int actual = calc.sum(a,b);
        Assert.assertEquals(expected,actual);
    }
}
