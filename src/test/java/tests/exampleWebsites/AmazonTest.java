package tests.exampleWebsites;

import org.testng.annotations.Test;
import utilities.Driver;
import utilities.SeleniumUtils;

public class AmazonTest {
    @Test
    public void amazonTest1(){
        Driver.getDriver().get("https://www.amazon.com/");

    }
    @Test(groups={"sanity"})
    public void amazonTest2(){
        System.out.println("this is test 2 of amazon");
        SeleniumUtils.waitForSec(5);
    }
    @Test(groups={"login"})
    public void amazonTest3(){
        System.out.println("this is test3 amazon");
        SeleniumUtils.waitForSec(10);
    }
    @Test
    public void loginAmazon1(){
        System.out.println("amazon login 1");
    }
    @Test
    public void loginAmazon2(){
        System.out.println("amazon login 2");
    }
}
