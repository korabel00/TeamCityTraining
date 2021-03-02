package calculator_test;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SubTest extends BaseTest {

    @Test(dataProvider = "valuesForSubtractionTest", groups = {"unitTests1"})
    public void SubtractionTest(long a, long b, long expectedValue) {
        long result = calculator.sub(a, b);
        Assert.assertEquals(result, expectedValue, "Invalid subtraction");
    }

    @DataProvider(name = "valuesForSubtractionTest")
    public Object[][] valuesForSub() {
        return new Object[][]{
                {10, 23, -13},
                {10, -1, 11},
                {0, 0, 0},
                {-1, -1, 0},
        };
    }
}
