import org.junit.*;


public class TestCalculate {

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

    @Before
    public void runBeforeEveeryTest(){
        System.out.println("method assoc. with before annotation");
    }
    @After
    public void runAfterEveeryTest(){
        System.out.println("method assoc. with After annotation");
    }
    @BeforeClass
    public static void beforeClassMethod(){
        System.out.println("method assoc. with beforeClass annotation");
    }

    @AfterClass
    public static void afterClassMethod(){
        System.out.println("method assoc. with afterClass annotation");
    }
}
