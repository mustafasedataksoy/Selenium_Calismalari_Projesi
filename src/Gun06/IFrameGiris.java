package Gun06;

import Utulity.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class IFrameGiris extends BaseDriver {


    @Test
    public void Test1()
    {
        driver.get("https://chercher.tech/practice/frames");

        driver.switchTo().frame(0);
        WebElement input = driver.findElement(By.cssSelector("#topic + input"));
        input.sendKeys("Türkiye");

         // driver.switchTo().frame(0);
         // driver.switchTo().parentFrame();  // bir önceki sayfaya geri dönerim.
        // driver.switchTo().defaultContent();  hangi sayfada olursam olayım direk ilk sayfaya gider.




        driverBekleKapat();




    }
}
