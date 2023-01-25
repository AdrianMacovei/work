package org.internship;

import org.testng.annotations.*;

public class BaseCalculatorClass {

    Calculator calculator;

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

    @BeforeMethod
    public void setUp() {
        calculator = new Calculator();
        System.out.println("Make setUp for CalculatorTest methods");
    }
}
