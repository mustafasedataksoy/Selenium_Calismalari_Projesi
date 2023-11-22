package Gun05;

import Utulity.BaseDriver;
import net.bytebuddy.implementation.auxiliary.MethodCallProxy;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class FillingFormTask extends BaseDriver {

    @Test
    public void Test1()
    {
        driver.get("http://demo.seleniumeasy.com/ajax-form-submit-demo.html");

        WebElement nameBox=driver.findElement(By.cssSelector("input[type='Text']"));
        nameBox.sendKeys("Behçet");

        WebElement comBox=driver.findElement(By.cssSelector("[class='form-control'][id='description']"));
        comBox.sendKeys("merhaba dünya");

        WebElement submitBtn=driver.findElement(By.id("btn-submit"));
        submitBtn.click();

        WebDriverWait bekle = new WebDriverWait(driver,Duration.ofSeconds(30));
        bekle.until(ExpectedConditions.textToBe(By.xpath("//*[text()='Form submited Successfully!']"),"Form submited Successfully!"));

        WebElement msg=driver.findElement(By.xpath("//*[text()='Form submited Successfully!']"));
        //Assert.assertTrue("mesaj bulunamadı",msg.isDisplayed());
        Assert.assertEquals("Form submited Successfully!", msg.getText());


        driverBekleKapat();
    }

}
