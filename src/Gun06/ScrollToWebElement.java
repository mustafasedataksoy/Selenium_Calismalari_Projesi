package Gun06;


import Utulity.BaseDriver;
import Utulity.MyFunction;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.time.Duration;

public class ScrollToWebElement extends BaseDriver {

    @Test
    public void Test1() {
        driver.get("https://triplebyte.com/");
        MyFunction.Bekle(5);

        JavascriptExecutor js= (JavascriptExecutor) driver;

        WebElement element=driver.findElement(By.xpath("(//*[text()='Get a demo'])[5]"));
        //scroll u bir elemente kadar, yani o pencere içide gözükene kadar nasıl kaydırırım
        js.executeScript("arguments[0].scrollIntoView(true);", element);

        MyFunction.Bekle(3);
        //js.executeScript("arguments[0].click();", element);   // 1.Yöntem

        //2.Yöntem
        js.executeScript("window.scrollBy(0,-500);"); // sayfanın kaydırma sonrası tekrar yüklnnmesi için tetikleme
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(element));
        element.click();

        MyFunction.Bekle(3);
        driverBekleKapat();
    }
}
