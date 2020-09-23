import org.junit.Assert;
import org.junit.Test;

public class TestSubtract {
    @Test
    public void testDiff(){
        System.out.println("Test Diff getting executed");
        Calculator calc = new Calculator();
        int a = 4;
        int b= 5;
        int expected = -1;
        int actual = calc.diff(a,b);
        Assert.assertEquals(expected,actual);
    }
}
