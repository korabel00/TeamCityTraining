package calculator_test;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CosineTest extends BaseTest {

    @Test(dataProvider = "valuesForCosineTest", groups = {"unitTests1"})
    public void cosineTest(float a, double expectedValue) {
        double result = calculator.cos(a);
        Assert.assertEquals(result, expectedValue, "Invalid cosine");
    }

    @DataProvider(name = "valuesForCosineTest")
    public Object[][] values() {
        return new Object[][]{
                {60, -0.9524129629135132},
                {90, -0.4480736255645752},
                {120, 0.8141809701919556},
                {360, -0.28369107842445374},
        };
    }
}
