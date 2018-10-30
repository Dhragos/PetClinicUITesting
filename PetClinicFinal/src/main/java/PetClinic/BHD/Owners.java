package PetClinic.BHD;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Owners {
    private List<WebElement> owners;
    WebDriver webDriver;

    public Owners(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public void elements() {
        owners = webDriver.findElements(By.xpath("//tbody//tr//td[1]"));
    }

    public boolean doesOwnerExists(String ownerName) {          //verifica daca un elem din lista e ceea ce am creat.
        for (WebElement own : owners) {
            if (own.getText().equals(ownerName)) {
                return true;
            }
        }
        return false;
    }

    public void clickOnNewOwner() {
        webDriver.findElement(By.xpath("(//*[contains(text(), 'Alexandru Popescu')])[1]")).click();

        }
    }






//    public void deleteOwner(String ownerName){
//        for (int i = 0; i < owners.size(); i++){
//            if (owners.get(i).getText().equals(ownerName)){
//
//            }
//        }


