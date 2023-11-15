package Gun02;

import Utulity.BaseDriver;
import Utulity.MyFunction;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Navigating extends BaseDriver {

    public static void main(String[] args) {

        driver.navigate().to("https://testpages.eviltester.com/styled/index.html");

        WebElement element = driver.findElement(By.linkText("Alerts (JavaScript)"));
        element.click();

        System.out.println(driver.getCurrentUrl()); //  on an bulunduğum URL yi yazdırıyorum.

        MyFunction.Bekle(3);
        driver.navigate().back();

        System.out.println(driver.getCurrentUrl());

        MyFunction.Bekle(3);
        driver.navigate().forward();

        MyFunction.Bekle(3);
        driver.navigate().back();

        System.out.println(driver.getCurrentUrl());


        driverBekleKapat();
    }




}
