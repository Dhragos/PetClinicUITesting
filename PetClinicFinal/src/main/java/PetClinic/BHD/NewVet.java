package PetClinic.BHD;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class NewVet {
    WebElement firstName;
    WebElement lastName;
    WebElement saveVet;
    Select type;
    WebElement errorMessage;

    WebDriver webDriver;

    public NewVet(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public void elements() {
        firstName = webDriver.findElement(By.id("firstName"));
        lastName = webDriver.findElement(By.id("lastName"));
        type = new Select(webDriver.findElement(By.id("specialties")));
        saveVet = webDriver.findElement(By.xpath("//button[@type='submit']"));
    }

    public void addNewVet() {
        firstName.sendKeys("Dan");
        lastName.sendKeys("Pavel");
        type.selectByVisibleText("surgery");
    }

    public void saveButton() {
        saveVet.click();
    }

    public void addInvalidName() {
        firstName.sendKeys("D");
    }

    public boolean checkErrorMessage() {
        errorMessage = webDriver.findElement(By.xpath("//span[@class='help-block']"));
        if (errorMessage.isDisplayed()) {
            return true;
        }
        return false;
    }

    public boolean isSaveEnabled() {
        if (saveVet.isEnabled()) {
            return false;
        }
        return true;
    }
}




