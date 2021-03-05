package calculator_test;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CosineTest extends BaseTest {

    @Test(dataProvider = "valuesForCosineTest", groups = {"unitTests1"})
    public void cosineTest(double a, double expectedValue) {
        double result = calculator.cos(a);
        Assert.assertEquals(result, expectedValue, "Invalid cosine");
    }

    @DataProvider(name = "valuesForCosineTest")
    public Object[][] values() {
        return new Object[][]{
                {60, -0.9524129804151563},
                {90, -0.4480736161291701},
                {120, 0.8141809705265618},
                {360, -0.2836910914865273},
        };
    }
}
