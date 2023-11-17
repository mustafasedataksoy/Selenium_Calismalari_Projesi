package Gun03;

import Utulity.BaseDriver;
import Utulity.MyFunction;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ElemaninStatusu extends BaseDriver {

    public static void main(String[] args) {

        driver.get("https://samples.gwtproject.org/samples/Showcase/Showcase.html#!CwCheckBox");

        WebElement tuesday=driver.findElement(By.id("gwt-debug-cwCheckBox-Tuesday-input"));

        System.out.println("tuesday.isDisplayed() = " + tuesday.isDisplayed());
        System.out.println("tuesday.isSelected() = " + tuesday.isSelected());
        System.out.println("tuesday.isEnabled() = " + tuesday.isEnabled());

        MyFunction.Bekle(2);
        tuesday.click();









        driverBekleKapat();



    }
}
