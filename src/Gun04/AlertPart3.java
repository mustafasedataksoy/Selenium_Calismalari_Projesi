package Gun04;


import Utulity.BaseDriver;
import Utulity.MyFunction;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class AlertPart3 extends BaseDriver {
    // 3.Alerte tıklayınız, isminizi alert e yazınız, daha sonra OK ye basıp,
    // HTML sayfasında isminizin görüntülendiğini Assert ile kontrol ediniz.
    @Test
    public void Test1() {
        driver.get("http://demo.seleniumeasy.com/javascript-alert-box-demo.html");

        WebElement clickMe1 = driver.findElement(By.cssSelector("button[onclick='myPromptFunction()']"));
        clickMe1.click();

        MyFunction.Bekle(2);
        driver.switchTo().alert().sendKeys("ismet");
        driver.switchTo().alert().accept();
        MyFunction.Bekle(2);

        WebElement txtActual=driver.findElement(By.id("prompt-demo"));
        Assert.assertTrue("Beklenen yazı gözükmedi ",txtActual.getText().contains("ismet"));

        driverBekleKapat();
    }

}
