import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)

@Suite.SuiteClasses({
        TestAddition.class,
        TestDivision.class,
        TestSubtract.class,
        TestMultiply.class
})

public class TestSuite {
}
