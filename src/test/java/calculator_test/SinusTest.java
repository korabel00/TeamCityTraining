package calculator_test;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SinusTest extends BaseTest {

    @Test(dataProvider = "valuesForSinusTest", groups = {"unitTests1"})
    public void sinusTest(long a, double expectedValue) {
        double result = calculator.sin(a);
        Assert.assertEquals(result, expectedValue, "Invalid sinus value");
    }

    @DataProvider(name = "valuesForSinusTest")
    public Object[][] values() {
        return new Object[][]{
                {30, -0.9880316257476807},
                {90, 0.8939966559410095},
                {180, -0.8011526465415955},
                {360, 0.9589157104492188},
        };
    }
}
