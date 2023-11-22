package Gun05;

import Utulity.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class WaitGiris extends BaseDriver {

    @Test
    public void Test1()
    {
        driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");

        WebElement button= driver.findElement(By.xpath("//*[text()='Click me to start timer']"));
        button.click();


        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        WebElement txtElement= driver.findElement(By.xpath("//p[text()='WebDriver']"));




        driverBekleKapat();


    }
}
