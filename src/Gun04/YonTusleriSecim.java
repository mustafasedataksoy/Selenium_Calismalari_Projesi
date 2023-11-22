package Gun04;

import Utulity.BaseDriver;
import Utulity.MyFunction;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.security.Key;

public class YonTusleriSecim extends BaseDriver {

    // kutucuğa git, içine tıklat, b harfine bas, aşağı yön tuşuna bas, enter a bas.

    @Test

    public void Test1()
    {
        driver.get("https://demoqa.com/auto-complete");

        WebElement element = driver.findElement(By.id("autoCompleteSingleInput"));

        Actions aksiyonlar = new Actions(driver);

        Action aksiyon=aksiyonlar.moveToElement(element)
                .click()
                .sendKeys("b")
                .build();
        aksiyon.perform();
        MyFunction.Bekle(2);

        aksiyon=aksiyonlar
                .sendKeys(Keys.DOWN)
                .sendKeys(Keys.ENTER)
                .build();
        aksiyon.perform();

        driverBekleKapat();


    }
}
