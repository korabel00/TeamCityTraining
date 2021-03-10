package calculator_test;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TangTest extends BaseTest {

    @Test(dataProvider = "valuesForTangTest", groups = {"unitTests1"})
    public void tangTest(float a, double expectedValue) {
        float result = calculator.tg(a);
        Assert.assertEquals(result, expectedValue, "Invalid tang value");
    }

    @DataProvider(name = "valuesForTangTest")
    public Object[][] values() {
        return new Object[][]{
                {30, -6.405331134796143},
                {90, -1.9952003955841064},
                {180, 1.338690161705017},
                {360, -3.380140542984009},
        };
    }
}
