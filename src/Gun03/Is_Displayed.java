package Gun03;

import Utulity.BaseDriver;
import Utulity.MyFunction;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Is_Displayed extends BaseDriver {

    @Test
    public void Test() {
        driver.get("https://tr-tr.facebook.com/");
        driver.manage().deleteAllCookies();

        WebElement nexAccountBtn = driver.findElement(By.cssSelector("[id^='u_0_0']"));
        nexAccountBtn.click();
        MyFunction.Bekle(1);


        WebElement firstName = driver.findElement(By.name("firstname"));
        firstName.sendKeys("mahmut");
        MyFunction.Bekle(1);

        WebElement lastName = driver.findElement(By.name("lastname"));
        lastName.sendKeys("tuncer");

        WebElement reMail=driver.findElement(By.cssSelector("input[name='reg_email_confirmation__']"));
        //System.out.println("reMail.isDisplayed() = " + reMail.isDisplayed());
        Assert.assertFalse(reMail.isDisplayed());

        MyFunction.Bekle(1);
        WebElement emailBox=driver.findElement(By.name("reg_email__"));
        emailBox.sendKeys("mahmut@hotmail.com");

        reMail=driver.findElement(By.cssSelector("input[name='reg_email_confirmation__']"));
        //System.out.println("emailBox.isDisplayed() = " + emailBox.isDisplayed());
        Assert.assertTrue(reMail.isDisplayed());


        driverBekleKapat();

    }
}