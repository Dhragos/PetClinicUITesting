package PetClinic.BHD;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPagePetClinic {

    WebElement welcomeText;
    WebElement imageAnimals;

    WebDriver webDriver;

    public MainPagePetClinic(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public void Elements(){
        welcomeText = webDriver.findElement(By.xpath("//h2"));
        imageAnimals = webDriver.findElement(By.className("img-responsive"));
     }
     public void isImageDisplayed(){
        imageAnimals.isDisplayed();
     }
}