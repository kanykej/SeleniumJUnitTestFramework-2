package tests.exampleWebsites;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class EtsyTest {
@Test(groups={"login"})
    public void etsyTest1(){
    WebDriver driver=new ChromeDriver();
    driver.get("https://www.etsy.com/");
}
    @Test (groups={"sanity"})
    public void etsyTest2(){
        System.out.println("etsy test 2");
    }
    @Test
    public void login1(){
        System.out.println("etsy login 1");
    }
    @Test
    public void login2(){
        System.out.println("etsy login 2");
    }
}
