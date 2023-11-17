package Gun04;

import Utulity.BaseDriver;
import Utulity.MyFunction;
import org.junit.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;


public class ActionsSiniflari extends BaseDriver {


    @Test
    public void Test()
    {
        driver.get("https://demoga.com/buttons");

        WebElement element = driver.findElement(By.xpath("//button[text()='Click Me']"));
        //element.click(): normal click

        Actions aksiyonlar = new Actions(driver);

        Action aksiyon= aksiyonlar.moveToElement(element).click().build();
        MyFunction.Bekle(2);
        aksiyon.perform();

        //  aksiyonlar.moveToElement(element).click().build().perform(); KISA HALİ BÖYLE
        driverBekleKapat();
    }





}
