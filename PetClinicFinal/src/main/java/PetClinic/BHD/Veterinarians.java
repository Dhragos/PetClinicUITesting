package PetClinic.BHD;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Veterinarians {
    private List<WebElement> veterinarians;
    private List<WebElement> deleteButton;

    WebDriver webDriver;

    public Veterinarians(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public void elements() {
        veterinarians = webDriver.findElements(By.xpath("//table/tbody/tr/td[1]"));
        //editButton = webDriver.findElements(By.xpath("//table/tbody/tr/td[3]/button[1]"));
        deleteButton = webDriver.findElements(By.xpath("//tbody//td[3]//button[2]"));
    }

    public boolean doesVetExists(String vetExist) {          //verifica daca un elem din lista exista.
        for (WebElement vets : veterinarians) {
            if (vets.getText().equals(vetExist)) {
                return true;
            }
        }
        return false;
    }

    public void deleteVet(String vetName) {
        for (int i = 0; i < veterinarians.size(); i++) {
            if (veterinarians.get(i).getText().equals(vetName)) {
                deleteButton.get(i).click();
            }
        }
    }

    public boolean doesVetNotExist(String vetNotExists) {
        for (WebElement vets : veterinarians) {
            if (vets.getText().equals(vetNotExists)) {
                    return true;
            }
        }
        return false;
    }
}
