package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class Test_001 extends BaseClass{

    @Test
    public void Chrome_test(){
        System.out.println("THIS IS A TEST");
        driver.get("https://google.com");
        driver.findElement(By.name("q")).sendKeys("Appium");
        driver.findElement(By.name("q")).sendKeys(Keys.ENTER);

        System.out.println("COMPLETED TEST ONE");

    }
}
