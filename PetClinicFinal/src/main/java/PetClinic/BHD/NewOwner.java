package PetClinic.BHD;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NewOwner {
    WebElement firstName;
    WebElement lastName;
    WebElement address;
    WebElement city;
    WebElement telephone;
    WebElement submit;
    WebDriver webDriver;
    WebElement errorMessage;
    WebElement backButton;

    public NewOwner(WebDriver webDriver) {
        this.webDriver = webDriver;
    }
    public void elements(){
        firstName = webDriver.findElement(By.id("firstName"));
        lastName = webDriver.findElement(By.id("lastName"));
        address = webDriver.findElement(By.id("address"));
        city = webDriver.findElement(By.id("city"));
        telephone = webDriver.findElement(By.id("telephone"));
        submit = webDriver.findElement(By.xpath("//button[@type='submit']"));
        backButton = webDriver.findElement(By.xpath("//button[@type='button']"));
    }
    public void addNewValidOwner(){
        firstName.sendKeys("Alexandru");
        lastName.sendKeys("Popescu");
        address.sendKeys("Cantemir nr.5");
        city.sendKeys("Bucuresti");
        telephone.sendKeys("0736248006");
    }
    public void addInvalidPhone(){
        firstName.sendKeys("Alexandru");
        lastName.sendKeys("Popescu");
        address.sendKeys("Cantemir nr.5");
        city.sendKeys("Bucuresti");
        telephone.sendKeys("sdfs");


    }
    public void clickSubmitButton(){
        submit.click();
    }
    public boolean checkErrorMessage(){
        errorMessage = webDriver.findElement(By.className("help-block"));
        if (errorMessage.isDisplayed()){
            return true;
        }
        return false;
    }
    public boolean isSubmitEnabled() {
        if (submit.isEnabled()) {
            return false;
        }
        return true;
    }
    public void clickReturn(){
        backButton.click();
    }

}

