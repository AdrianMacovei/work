package org.internship;

import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

public class CalculatorTest extends BaseCalculatorClass{

    Calculator calculator;

    @DataProvider(name = "calculatorTestData")
    public Object[][] createData1() {
        return new Integer[][]{
                {2, 8, 10},
                {-2, -4, -6},
                {-3, 2, -1},
                {0, 0, 0},
                {1, 0, 1},
                {-2, 0, -2},

        };

    }


    @BeforeMethod
    public void setUp() {
        calculator = new Calculator();
        System.out.println("Make setUp for CalculatorTest methods");
    }

    @Test(dataProvider = "calculatorTestData",
            description = "This test method test the Calculator sum method with different values", timeOut = 1000)
    public void testCalculator(int a, int b, int sum) {
        Assert.assertEquals(calculator.sum(a, b), sum, "The test failed!");
        Assert.assertTrue(calculator.sum(a, b) == sum, "The test failed!");
        Assert.assertFalse(!(calculator.sum(a, b) == sum), "The test failed!");
    }

    @Test(dataProvider = "calculatorTestData",
            description = "This test method test the Calculator sum method with different values", timeOut = 1000)
    public void testCalculatorSoftAssert(int a, int b, int sum) {
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(calculator.sum(a, b), sum, "The test failed!");
        // make this failed intentionally
        softAssert.assertTrue(calculator.sum(a, b) == sum, "Intentionally failed!");
        softAssert.assertFalse(!(calculator.sum(a, b) == sum), "The test failed!");
        softAssert.assertAll();
    }


    @Test
    private void testCalculatorWithPrivate() {
        // this will run and the print will appear in the console because have @Test at method level
        System.out.println("This will not run because is private");
    }

    @Test(enabled = false)
    public void testEnableFalse() {
        System.out.println("This method will not be executed because enable is False");
    }
}
