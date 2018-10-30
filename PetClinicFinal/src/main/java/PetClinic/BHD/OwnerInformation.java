package PetClinic.BHD;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class OwnerInformation {

    WebElement ownerInfo;
    WebDriver webDriver;

    public OwnerInformation(WebDriver webDriver) {
        this.webDriver = webDriver;
    }
    public void elements(){
        ownerInfo = webDriver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-owner-detail[1]/div[1]/div[1]"));
    }
    public boolean infoIsDisplayed(){
        if (ownerInfo.isDisplayed()) {
            return true;
        }
        return false;
    }
}
