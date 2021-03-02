package calculator_test;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TangTest extends BaseTest {

    @Test(dataProvider = "valuesForTangTest", groups = {"unitTests1"})
    public void tangTest(long a, double expectedValue) {
        double result = calculator.tg(a);
        Assert.assertEquals(result, expectedValue, "Invalid tang value");
    }

    @DataProvider(name = "valuesForTangTest")
    public Object[][] values() {
        return new Object[][]{
                {30, -6.405331196646276},
                {90, -1.995200412208242},
                {180, 1.3386902103511544},
                {360, -3.380140413960958},
        };
    }
}
