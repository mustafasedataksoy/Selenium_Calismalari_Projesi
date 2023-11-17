package Gun03;

import Utulity.BaseDriver;
import Utulity.MyFunction;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class SenaryoFacebook extends BaseDriver {
    @Test
    public void Test()
    {
        driver.get("https://tr-tr.facebook.com/");
        driver.manage().deleteAllCookies();

        WebElement nexAccountBtn=driver.findElement(By.cssSelector("[id^='u_0_0']"));
        nexAccountBtn.click();
        MyFunction.Bekle(1);


        WebElement firstName=driver.findElement(By.name("firstname"));
        firstName.sendKeys("mahmut");
        MyFunction.Bekle(1);

        WebElement lastName=driver.findElement(By.name("lastname"));
        lastName.sendKeys("tuncer");
        MyFunction.Bekle(1);


        // Görünmediğinin kontrol edilecek yer.
        List <WebElement> secondEmail=driver.findElements(By.cssSelector("[id='reg_form_box'] > [class='hidden_elem']"));
        Assert.assertTrue("2. Email şu an gözüküyor mu",(secondEmail.size()==1));


        MyFunction.Bekle(1);
        WebElement emailBox=driver.findElement(By.name("reg_email__"));
        emailBox.sendKeys("mahmut@hotmail.com");

        secondEmail=driver.findElements(By.cssSelector("[id='reg_form_box'] > [class='hidden_elem']"));
        Assert.assertTrue("2.Email şuan gözüküyor mu",(secondEmail.size()==0));


        WebElement email2=driver.findElement(By.cssSelector("input[name='reg_email_confirmation__']"));
        email2.sendKeys("mahmut@hotmail.com");
        // Göründüğünün kontrol edileceği yer

        MyFunction.Bekle(1);
        WebElement day=driver.findElement(By.id("day"));
        Select dropDownDay = new Select(day);
        dropDownDay.selectByIndex(5);

        MyFunction.Bekle(1);
        WebElement month = driver.findElement(By.id("month"));
        Select dropDownMonth= new Select(month);
        dropDownMonth.selectByVisibleText("Nis");

        MyFunction.Bekle(1);
        WebElement year= driver.findElement(By.id("year"));
        Select dropDownYear=new Select(year);
        dropDownYear.selectByValue("1960");

        MyFunction.Bekle(1);
        WebElement cinsiyet=driver.findElement(By.cssSelector("[type='radio'][value='2']"));
        cinsiyet.click();


        // 2.Yöntem
//
        // görünmüyor
//        WebElement hiddenElement=driver.findElement(By.cssSelector("fullname_field+div+div"));
//        Assert.assertTrue("Email girmeden önce gizli durumu", hiddenElement.getAttribute("class").equals("hidden_elem"));


//        MyFunction.Bekle(1);
//        WebElement emailBox=driver.findElement(By.name("reg_email__"));
//        emailBox.sendKeys("mahmut@hotmail.com");

        // Görünmüyor
//        hiddenElement=driver.findElement(By.cssSelector("fullname_field+div+div"));
//        Assert.assertFalse("Email girdikten sonra gizli durumu",hiddenElement.getAttribute("class").equals("hidden_elem"));




        driverBekleKapat();


    }
}
