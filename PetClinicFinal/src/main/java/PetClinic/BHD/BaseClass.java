package PetClinic.BHD;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BaseClass {
   private WebDriver webDriver;

    public WebDriver initial() {
        webDriver = new ChromeDriver();
        webDriver.get("http://bhdtest.endava.com/petclinic/welcome");
        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        return webDriver;
    }

    public void teardown() {
        webDriver.quit();
    }
}
