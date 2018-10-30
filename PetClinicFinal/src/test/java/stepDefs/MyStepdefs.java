package stepDefs;

import PetClinic.BHD.*;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MyStepdefs {
    private WebDriver webDriver;
    private BaseClass baseClass;


    @Given("^User has acces to MainPage$")
    public void userHasAccesToMainPage() throws Throwable {
        baseClass = new BaseClass();
        webDriver = baseClass.initial();
    }

    @When("^User clicks on HomePage button$")
    public void userClicksOnHomePageButton() throws Throwable {
        MenuPetClinic menuPetClinic = new MenuPetClinic(webDriver);
        menuPetClinic.elements();
        menuPetClinic.clickHome();
    }

    @Then("^Validate if animal picture is displayed$")
    public void validateIfAnimalPictureIsDisplayed() throws Throwable {
        MainPagePetClinic mainPagePetClinic = new MainPagePetClinic(webDriver);
        mainPagePetClinic.Elements();
        mainPagePetClinic.isImageDisplayed();
        baseClass.teardown();           //inchide browserul
    }

    @When("^User clicks on add new Veterinarian$")
    public void userClicksOnAddNewVeterinarian() throws Throwable {
        MenuPetClinic menuPetClinic = new MenuPetClinic(webDriver);
        menuPetClinic.elements();
        menuPetClinic.clickVeteranians();
        menuPetClinic.clickAddNewVet();
    }

    @And("^User adds a new Veterinarian$")
    public void userAddsANewVeterinarian() throws Throwable {
        NewVet newVet = new NewVet(webDriver);
        newVet.elements();
        newVet.addNewVet();
        newVet.saveButton();
    }

    @When("^User displays all Veterinarians$")
    public void userDisplaysAllVeterinarians() throws Throwable {
        MenuPetClinic menuPetClinic = new MenuPetClinic(webDriver);
        menuPetClinic.elements();
        menuPetClinic.clickVeteranians();
        menuPetClinic.clickAllVets();
    }

    @Then("^Validate if new added veteranian exists$")
    public void validateIfNewAddedVeteranianExists() throws Throwable {
        Veterinarians veterinarians = new Veterinarians(webDriver);
        veterinarians.elements();
        veterinarians.doesVetExists("Dan Pavel");
        baseClass.teardown();

    }

    @And("^User adds invalid FirstName as Veterinarian$")
    public void userAddsInvalidFirstNameAsVeterinarian() throws Throwable {
        NewVet newVet = new NewVet(webDriver);
        newVet.elements();
        newVet.addInvalidName();
    }

    @Then("^Validate if error message appears$")
    public void validateIfErrorMessageAppears() throws Throwable {
        NewVet newVet = new NewVet(webDriver);
        newVet.checkErrorMessage();
    }

    @And("^Save Button should be inactive$")
    public void saveButtonShouldBeInactive() throws Throwable {
        NewVet newVet = new NewVet(webDriver);
        newVet.isSaveEnabled();
        baseClass.teardown();
    }

    @When("^User clicks on add new Owner$")
    public void userClicksOnAddNewOwner() throws Throwable {
        MenuPetClinic menuPetClinic = new MenuPetClinic(webDriver);
        menuPetClinic.elements();
        menuPetClinic.clickOwners();
        menuPetClinic.clickAddOwners();
    }

    @Then("^User adds a new owner$")
    public void userAddsANewOwner() throws Throwable {
        NewOwner newOwner = new NewOwner(webDriver);
        newOwner.elements();
        newOwner.addNewValidOwner();
        newOwner.clickSubmitButton();
        Thread.sleep(2000);
        baseClass.teardown();
    }

    @When("^User displays all Owners$")
    public void userDisplaysAllOwners() throws Throwable {
        MenuPetClinic menuPetClinic = new MenuPetClinic(webDriver);
        menuPetClinic.elements();
        menuPetClinic.clickOwners();
        menuPetClinic.clickAllOwners();
    }

    @Then("^Validate the new Owner has been added$")
    public void validateTheNewOwnerHasBeenAdded() throws Throwable {
        Owners owners = new Owners(webDriver);
        owners.elements();
        owners.doesOwnerExists("Alexandu Popescu");
        baseClass.teardown();
    }

    @And("^User adds Invalid data as Phone$")
    public void userAddsInvalidDataAsPhone() throws Throwable {
        NewOwner newOwner = new NewOwner(webDriver);
        newOwner.elements();
        newOwner.addInvalidPhone();
    }

    @Then("^Validate if error message id displayed$")
    public void validateIfErrorMessageIdDisplayed() throws Throwable {
        NewOwner newOwner = new NewOwner(webDriver);
        newOwner.elements();
        newOwner.checkErrorMessage();
    }

    @And("^Submit buton should be inactive$")
    public void submitButonShouldBeInactive() throws Throwable {
        NewOwner newOwner = new NewOwner(webDriver);
        newOwner.elements();
        newOwner.isSubmitEnabled();
    }

    @And("^User should return to main page$")
    public void userShouldReturnToMainPage() throws Throwable {
        NewOwner newOwner = new NewOwner(webDriver);
        newOwner.elements();
        newOwner.clickReturn();
        baseClass.teardown();
    }

    @And("^User deletes a new Veterinarian$")
    public void userDeletesANewVeterinarian() throws Throwable {
        Veterinarians veterinarians = new Veterinarians(webDriver);
        veterinarians.elements();
        veterinarians.deleteVet("Dan Pavel");
    }

    @Then("^Validate new veterinarian has been deleted$")
    public void validateNewVeterinarianHasBeenDeleted() throws Throwable {
        Veterinarians veterinarians = new Veterinarians(webDriver);
        veterinarians.elements();
        Assert.assertFalse(veterinarians.doesVetExists("Dan Pavel"));
        baseClass.teardown();
    }


    @When("^User clicks on new owner$")
    public void userClicksOnNewOwner() throws Throwable {
        Owners owners = new Owners(webDriver);
        owners.elements();
        owners.clickOnNewOwner();
    }

    @Then("^Validate the new veteranian was added$")
    public void validateTheNewVetWasAdded() throws Throwable {
        Veterinarians vets = new Veterinarians(webDriver);
        vets.elements();
        Assert.assertTrue(vets.doesVetExists("Dan Pavel"));
        baseClass.teardown();
    }

    @Then("^Owner information is displayed$")
    public void ownerInformationIsDisplayed() throws Throwable {
        OwnerInformation ownerInformation = new OwnerInformation(webDriver);
        ownerInformation.elements();
        Assert.assertTrue(ownerInformation.infoIsDisplayed());
        baseClass.teardown();

    }
}
