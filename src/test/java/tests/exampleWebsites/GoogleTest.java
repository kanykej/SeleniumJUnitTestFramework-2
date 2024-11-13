package tests.exampleWebsites;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GoogleTest {
    @Test
    public void googleTest1() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");

    }

    @Test
    public void googleTest2() {
        System.out.println("google test 2");
    }

    @Test(groups = {"sanity"})
    public void googleTest3() {
        System.out.println("google test 3");
    }

    @Test(groups={"login"})
    public void googleTest4() {
        System.out.println("google test 4");
    }
    @Test
    public void logingoggle1(){
        System.out.println("google login 1");
    }
    @Test
    public void loginGoogle2(){
        System.out.println("goolge login 2");
    }
}
