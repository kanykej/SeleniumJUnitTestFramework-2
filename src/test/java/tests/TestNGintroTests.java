package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGintroTests {
    @BeforeTest
    public static void beforeTestMethod(){
        System.out.println("this is before test intro class");
    }

    @BeforeClass
    public static void beforeClass() {
        System.out.println("its before class");
    }

    @BeforeMethod
    public void beforeMethod() { // Renamed to avoid name conflict with test method
        System.out.println("this is before method");
        Assert.assertFalse(10<0);
    }

    @Test
    public void test1() {
        System.out.println("its test 1");
        Assert.assertTrue(5>2);
    }
    @Test
    public void test2(){
        System.out.println("it's test 2");
    }
    @Test
    public void test3(){
        System.out.println("it's test3");
    }
}

