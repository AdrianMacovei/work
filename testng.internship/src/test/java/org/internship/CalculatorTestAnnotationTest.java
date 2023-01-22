package org.internship;

import org.testng.Assert;
import org.testng.annotations.*;


@Test(dataProvider = "calculatorTestData")
public class CalculatorTestAnnotationTest {

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


    @AfterMethod
    public void tearDown() {
        System.out.println("Now we make tear down for method testCalculator");
    }
    @BeforeClass
    public void beforeClass() {
        System.out.println("Now we run tests from the CalculatorTest class");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("Now we finish tests from the CalculatorTest class");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("Start to run our tests");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("Our tests are done!");
    }

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("In this suite we will execute CalculatorTest and LoginTest");
    }
    @AfterSuite
    public void afterSuite() {
        System.out.println("The suite of tests is now finished");
    }
}
