package Gun04;

import Utulity.BaseDriver;
import Utulity.MyFunction;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionRightClick extends BaseDriver {

    @Test

    public void Test()
    {
        driver.get("https://demoga.com/buttons");

        WebElement element = driver.findElement(By.id("rightClickBtn"));
        MyFunction.Bekle(2);

        Actions aksiyonlar= new Actions(driver);
        Action aksiyon = aksiyonlar.moveToElement(element).contextClick().build();
        aksiyon.perform();

        MyFunction.Bekle(2);

        driverBekleKapat();
    }
}
