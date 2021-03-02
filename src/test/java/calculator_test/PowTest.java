package calculator_test;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class PowTest extends BaseTest {

    @Test(dataProvider = "valuesForPowTest", groups = {"unitTests1"})
    public void powTest(double a, double b, double expectedValue) {
        double result = calculator.pow(a, b);
        Assert.assertEquals(result, expectedValue, "Invalid multiplication");
    }

    @DataProvider(name = "valuesForPowTest")
    public Object[][] values() {
        return new Object[][]{
                {3.0, 2.0, 9.0},
                {3.0, 5.0, 243.0},
                {-3.0, 2.0, 9.0},
        };
    }
}
