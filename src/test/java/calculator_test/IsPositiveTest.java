package calculator_test;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class IsPositiveTest extends BaseTest {

    @Test(dataProvider = "valuesForPositiveTest", groups = {"unitTests1"})
    public void isPositiveTest(long a, boolean expectedValue) {
        boolean result = calculator.isPositive(a);
        Assert.assertEquals(result, expectedValue, "Invalid positive");
    }

    @DataProvider(name = "valuesForPositiveTest")
    public Object[][] values() {
        return new Object[][]{
                {1, true},
                {-1, false},
                {0, false},
        };
    }
}
