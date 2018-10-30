package PetClinic.BHD;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MenuPetClinic {

    WebElement home;
    WebElement owners;
    WebElement addOwners;
    WebElement allOwners;
    WebElement veterinarians;
    WebElement addVet;
    WebElement allVets;
    WebElement petTypes;
    WebElement specialties;


    WebDriver webDriver;

    public MenuPetClinic(WebDriver webDriver) {
        this.webDriver = webDriver;
        //elements();
    }

    public void elements() {
        home = webDriver.findElement(By.xpath("//a[@href='/petclinic/welcome']"));
        owners = webDriver.findElement(By.xpath("//a[text()='Owners']"));
        allOwners = webDriver.findElement(By.xpath("//a[@href='/petclinic/owners']"));
        addOwners = webDriver.findElement(By.xpath("//a[@href='/petclinic/owners/add']"));
        veterinarians = webDriver.findElement(By.xpath("//a[text()='Veterinarians']"));
        addVet = webDriver.findElement(By.xpath("//a[@href='/petclinic/vets/add']"));
        allVets = webDriver.findElement(By.xpath("//a[@href='/petclinic/vets']"));
        petTypes = webDriver.findElement(By.xpath("//span[contains(text(),'Pet Types')]"));
        specialties = webDriver.findElement(By.xpath("//span[contains(text(),'Specialties')]"));

    }
    public void clickOwners(){
        owners.click();
    }

    public void clickAllOwners() {
        allOwners.click();
    }

    public void clickAddOwners() {
        addOwners.click();
    }

    public void clickVeteranians() {
        veterinarians.click();
    }
    public void clickAddNewVet() {
            addVet.click();
    }
    public void clickAllVets() {
            allVets.click();
    }

    public void clickPets() {
        petTypes.click();
    }

    public void clickSpecialties() {
        specialties.click();
    }
    public void clickHome(){
        home.click();
    }

}
