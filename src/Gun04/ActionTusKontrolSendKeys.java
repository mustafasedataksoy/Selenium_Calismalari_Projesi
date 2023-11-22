package Gun04;

import Utulity.BaseDriver;
import Utulity.MyFunction;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionTusKontrolSendKeys extends BaseDriver {
    public static void main(String[] args) {


        driver.get("https://demoqa.com/auto-complete");

        WebElement element = driver.findElement(By.id("autoCompleteSingleContainer"));

        Actions aksiyonlar = new Actions(driver);

        Action aksiyon = aksiyonlar.moveToElement(element) // kutucuğa git
                        .click() // tıklat
                        .keyDown(Keys.SHIFT) // shifte bas
                        .sendKeys("a") // a ya bas
                        .keyUp(Keys.SHIFT) // shifti bırak
                        .sendKeys("hmet") // hmet yaz
                        .build();

        MyFunction.Bekle(2);
        aksiyon.perform();







        driverBekleKapat();
    }

}
