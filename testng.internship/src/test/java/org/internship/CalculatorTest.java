package org.internship;

import org.testng.Assert;
import org.testng.annotations.*;

public class CalculatorTest {

    Calculator calculator;

    @DataProvider(name = "test1")
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
    }

    @Test(dataProvider = "test1")
    public void testCalculator(int a, int b, int sum) {
        Assert.assertEquals(calculator.sum(a, b), sum, "The test failed!");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("This will be printed before class");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("This will be printed before test");
    }

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("This will be printed before suite");
    }
}
