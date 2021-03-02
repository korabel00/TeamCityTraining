package calculator_test;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MultTest extends BaseTest {

    @Test(dataProvider = "valuesForMultTest", groups = {"unitTests1"})
    public void multTest(long a, long b, long expectedValue) {
        long result = calculator.mult(a, b);
        Assert.assertEquals(result, expectedValue, "Invalid multiplication");
    }

    @DataProvider(name = "valuesForMultTest")
    public Object[][] valuesSum() {
        return new Object[][]{
                {0, 0, 0},
                {100, -1, -100},
                {3, 1, 3},
                {-1, -1, 1},
        };
    }
}
