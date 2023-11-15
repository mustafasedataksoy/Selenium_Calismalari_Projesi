package Gun02;

import Utulity.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class GetCssValue extends BaseDriver {
    public static void main(String[] args) {

        driver.get("https://www.snapdeal.com/");

        WebElement inputValEnter = driver.findElement(By.id("inputValEnter"));

        System.out.println("inputValEnter.getAttribute(class) = " + inputValEnter.getAttribute("class"));
        System.out.println("inputValEnter.getCssValue(color) = " + inputValEnter.getCssValue("color"));
        System.out.println("inputValEnter.getCssValue(background) = " + inputValEnter.getCssValue("background"));
        System.out.println("inputValEnter.getCssValue(font-size) = " + inputValEnter.getCssValue("font-size"));


        driverBekleKapat();


    }
}
