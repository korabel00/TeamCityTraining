package calculator_test;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SqrtTest extends BaseTest {

    @Test(dataProvider = "valuesForSqrtTest", groups = {"unitTests1"})
    public void sqrtTest(double a, double expectedValue) {
        double result = calculator.sqrt(a);
        Assert.assertEquals(result, expectedValue, "Invalid multiplication");
    }

    @DataProvider(name = "valuesForSqrtTest")
    public Object[][] values() {
        return new Object[][]{
                {4.0, 2.0},
                {256.0, 16.0},
                {1024.0, 32.0},
        };
    }
}
