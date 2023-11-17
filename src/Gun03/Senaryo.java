package Gun03;

import Utulity.BaseDriver;
import Utulity.MyFunction;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Senaryo extends BaseDriver {

    public static void main(String[] args) {

        driver.get("https://formsmarts.com/form/yu?mode=h5");


        MyFunction.Bekle(2);
        WebElement business=driver.findElement(By.cssSelector("input[type='radio'][value='Business']"));
        business.click();


        MyFunction.Bekle(2);
        WebElement selectOption= driver.findElement(By.cssSelector("select[id$='_4588']"));
        selectOption.click();

        MyFunction.Bekle(2);
        WebElement options=driver.findElement(By.cssSelector("option[value='Online Advertising']"));
        options.click();


        MyFunction.Bekle(2);
        WebElement Everyday=driver.findElement(By.cssSelector("[type='radio'][value='Every Day']"));
        Everyday.click();

        MyFunction.Bekle(2);
        WebElement Good = driver.findElement(By.cssSelector("[type='radio'][value='Good']"));
        Good.click();

        MyFunction.Bekle(2);
        WebElement selectoption2=driver.findElement(By.cssSelector("select[id$='_4597']"));
        selectoption2.click();

        MyFunction.Bekle(2);
        WebElement options2=driver.findElement(By.cssSelector("select[id$='_4597'] > :nth-child(4)"));
        options2.click();

        Good.click();



        driverBekleKapat();

    }
}
