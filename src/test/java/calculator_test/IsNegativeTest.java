package calculator_test;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class IsNegativeTest extends BaseTest {

    @Test(dataProvider = "valuesForNegativeTest", groups = {"unitTests1"})
    public void isNegativeTest(long a, boolean expectedValue) {
        boolean result = calculator.isNegative(a);
        Assert.assertEquals(result, expectedValue, "Invalid positive");
    }

    @DataProvider(name = "valuesForNegativeTest")
    public Object[][] values() {
        return new Object[][]{
                {1, false},
                {-1, true},
                {0, false},
        };
    }
}
