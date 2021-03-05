package calculator_test;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CotangTest extends BaseTest {

    @Test(dataProvider = "valuesForCotangTest", groups = {"unitTests1"})
    public void cotangTest(double a, double expectedValue) {
        double result = calculator.ctg(a);
        Assert.assertEquals(result, expectedValue, "Invalid tang value");
    }

    @DataProvider(name = "valuesForCotangTest")
    public Object[][] values() {
        return new Object[][]{
                {30, -0.15611995216165922},
                {90, -0.5012027833801532},
                {180, 0.7469988144140444},
                {360, -0.295845697968555},
        };
    }
}
