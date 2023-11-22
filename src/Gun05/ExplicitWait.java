package Gun05;

import Utulity.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ExplicitWait extends BaseDriver {
    @Test
    public void Test1()
    {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");

        WebElement button= driver.findElement(By.xpath("//*[text()='Click me to start timer']"));
        button.click();

        WebDriverWait bekle = new WebDriverWait(driver,Duration.ofSeconds(13));
        bekle.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//p[text()='WebDriver']")));


        //WebElement txtElement= driver.findElement(By.xpath("//p[text()='WebDriver']"));


        driverBekleKapat();
    }
}
