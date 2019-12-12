package tests;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class Test_001 extends BaseClass{

    @Test
    public void Chrome_test(){

        ExtentTest test = extent.createTest("google_test", "THis is a test");
        test.log(Status.INFO, "TEST ONE STARTED");
        driver.get("https://google.com");
        test.log(Status.PASS, "Navigated to gooogle.com");

        driver.findElement(By.name("q")).sendKeys("Appium");
        test.log(Status.PASS, "Search parameter passed");

        driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
        test.log(Status.PASS, "Search Done");

        test.log(Status.INFO, "COMPLETED");
    }
}
