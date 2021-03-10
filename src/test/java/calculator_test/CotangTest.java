package calculator_test;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CotangTest extends BaseTest {

    @Test(dataProvider = "valuesForCotangTest", groups = {"unitTests1"})
    public void cotangTest(float a, double expectedValue) {
        float result = calculator.ctg(a);
        Assert.assertEquals(result, expectedValue, "Invalid tang value");
    }

    @DataProvider(name = "valuesForCotangTest")
    public Object[][] values() {
        return new Object[][]{
                {30, -0.1561199575662613},
                {90, -0.5012028217315674},
                {180, 0.7469987869262695},
                {360, -0.2958456873893738},
        };
    }
}
