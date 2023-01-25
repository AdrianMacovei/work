package org.internship;

import org.testng.Assert;
import org.testng.annotations.*;


@Test(dataProvider = "calculatorTestData")
public class CalculatorTestAnnotationTest extends BaseCalculatorClass {

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

    public void testCalculator(int a, int b, int sum) {
        Assert.assertEquals(calculator.sum(a, b), sum, "The test failed!");
        Assert.assertTrue(calculator.sum(a, b) == sum, "The test failed!");
        Assert.assertFalse(!(calculator.sum(a, b) == sum), "The test failed!");
    }

    private void testCalculatorWithPrivate() {
        // this will run and the print will appear in the console
        System.out.println("This will not run because is private");
    }
}
