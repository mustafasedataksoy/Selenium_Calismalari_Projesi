package Gun04;
import Utulity.BaseDriver;
import Utulity.MyFunction;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class AlertPart2 extends BaseDriver {

    @Test
    public void Test1() {
        driver.get("http://demo.seleniumeasy.com/javascript-alert-box-demo.html");

        WebElement clickMe1 = driver.findElement(By.cssSelector("button[onclick='myConfirmFunction()']"));
        clickMe1.click();

        MyFunction.Bekle(2);
        driver.switchTo().alert().dismiss(); // Alert kutucuğuna geçildi ve CANCEL(iptal) butonun basıldı.

        MyFunction.Bekle(2);
        driverBekleKapat();
    }

}