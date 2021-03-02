package calculator_test;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SumTest extends BaseTest {

    @Test(dataProvider = "valuesForSumTest", groups = {"unitTests1"})
    public void sumTest(long a, long b, long expectedValue) {
        long result = calculator.sum(a, b);
        Assert.assertEquals(result, expectedValue, "Invalid sum");
    }

    @DataProvider(name = "valuesForSumTest")
    public Object[][] valuesSum() {
        return new Object[][]{
                {10, 23, 33},
                {10, -1, 9},
                {0, 0, 0},
                {-1, -1, -2},
        };
    }
}
