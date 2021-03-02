package calculator_test;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DivisionTest extends BaseTest {

    @Test(dataProvider = "valuesForDivisionTest", groups = {"unitTests1"})
    public void divisionTest(double a, double b, double expectedValue) {
        double result = calculator.div(a, b);
        Assert.assertEquals(result, expectedValue, "Invalid division");
    }

    @Test(expectedExceptions = NumberFormatException.class, groups = {"unitTests1"})
    public void divisionWithExceptionLong() {
        calculator.div(30, 0);
    }

    @Test(expectedExceptions = NumberFormatException.class, groups = {"unitTests1"})
    public void divisionWithExceptionDouble() {
        calculator.div(30.0, 0);
    }

    @DataProvider(name = "valuesForDivisionTest")
    public Object[][] valuesForDiv() {
        return new Object[][]{
                {30, 1, 30.0},
                {10, -2, -5.0},
                {0, 1, 0},
                {0.5, 0.5, 1.0},
        };
    }
}
