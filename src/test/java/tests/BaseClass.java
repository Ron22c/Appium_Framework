package tests;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.net.MalformedURLException;
import java.net.URL;

public class BaseClass {
    static AppiumDriver driver;

    @BeforeTest
    public void setup() throws MalformedURLException {
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability(CapabilityType.PLATFORM_NAME, "Android");
        cap.setCapability(MobileCapabilityType.DEVICE_NAME, "OnePlus 5T");
        cap.setCapability(MobileCapabilityType.UDID, "*****");
        cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9");
        cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "60");
        cap.setCapability(MobileCapabilityType.APP, "");
        cap.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
        cap.setCapability(MobileCapabilityType.BROWSER_VERSION, "74.0.3729");


        //TODO: FOR NATIVE APP USE THE BELOW MENTIONED CAPABILITIES
        //cap.setCapability("appPackage","com.oneplus.calculator");
        //cap.setCapability("appActivity", "com.oneplus.calculator.Calculator");

        URL url = new URL("http://0.0.0.0:4723/wd/hub");
        driver = new AppiumDriver(url, cap);
    }

    @AfterTest
    public void teardown(){
        driver.close();
        driver.quit();
    }
}


//TODO: set path to chromeDriver :  appium --chromedriver-executable /path/to/my/chromedriver
// ADB setup wireless ---> adb tcpip 5555 ----> adb connect <IP of CELL PHONE> ----> adb kill-server