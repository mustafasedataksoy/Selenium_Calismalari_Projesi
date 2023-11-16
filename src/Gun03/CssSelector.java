package Gun03;

import Utulity.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import org.junit.Assert;

public class CssSelector extends BaseDriver {
    public static void main(String [] args){

        driver.get("https://demo.seleniumeasy.com/basic-first-form-demo.html");

        String mesajim="Merhaba Selenium";
        WebElement inputText=driver.findElement(By.cssSelector("input[class='form-control'][id='user-message']"));
        inputText.sendKeys(mesajim);

        WebElement messageButton= driver.findElement(By.cssSelector("button[type='button'][onclick='showInput();']"));
        messageButton.click();

        WebElement msg=driver.findElement(By.cssSelector("span[id='display']"));

//        if (msg.getText().contains("Tester"))
//            System.out.println("Test Passed");
//        else
//            System.out.println("Test Failed");

        Assert.assertTrue(mesajim+"Mesaj Bulunamadı" ,msg.getText().contains(mesajim));// True ise birşey yapmaz
        // False ise beklenen olmamışssa hata verir.



        driverBekleKapat();



    }
}
