package Gun03;

import Utulity.BaseDriver;
import Utulity.MyFunction;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SenaryoXpath extends BaseDriver {

    @Test
    public void Test1(){

        driver.navigate().to("https://www.saucedemo.com/");


        // Login işlemleri
        WebElement userName= driver.findElement(By.xpath("//*[@id='user-name']"));
        userName.sendKeys("standard_user");
        MyFunction.Bekle(2);

        WebElement password=driver.findElement(By.xpath("//input[@id='password']"));
        password.sendKeys("secret_sauce");
        MyFunction.Bekle(2);

        WebElement loginButton=driver.findElement(By.xpath("//*[@id='login-button']"));
        loginButton.click();
        MyFunction.Bekle(2);




      // 1.Ürün
        WebElement slBackPack= driver.findElement(By.xpath("//*[text()='Sauce Labs Backpack']"));
        slBackPack.click();
        MyFunction.Bekle(2);

        WebElement addToCart= driver.findElement(By.xpath("//button[text()='Add to cart']"));
        addToCart.click();
        MyFunction.Bekle(2);

       WebElement backToProductBtn=driver.findElement(By.xpath("//*[@id='back-to-products']"));
       backToProductBtn.click();
       MyFunction.Bekle(2);

        // 2. Ürün
        WebElement boltTshirt=driver.findElement(By.xpath("//*[text()='Sauce Labs Bolt T-Shirt']"));
        boltTshirt.click();
        MyFunction.Bekle(2);

        WebElement addToCart2=driver.findElement(By.xpath("//button[text()='Add to cart']"));
        addToCart2.click();
        MyFunction.Bekle(2);

        WebElement sepet=driver.findElement(By.xpath("//*[@id='shopping_cart_container']"));
        sepet.click();
        MyFunction.Bekle(2);

        WebElement checkOutBtn=driver.findElement(By.xpath("//*[@id='checkout']"));
        checkOutBtn.click();
        MyFunction.Bekle(2);

        // information Form
        WebElement informationFname=driver.findElement(By.xpath("//*[@id='first-name']"));
        informationFname.sendKeys("Mahmut");
        MyFunction.Bekle(2);

        WebElement informationLname = driver.findElement(By.xpath("//*[@id='last-name']"));
        informationLname.sendKeys("tuncer");
        MyFunction.Bekle(2);

        WebElement zipCode=driver.findElement(By.xpath("//*[@id='postal-code']"));
        zipCode.sendKeys("123456");
        MyFunction.Bekle(2);

        WebElement continueBtn=driver.findElement(By.xpath("//*[@id='continue']"));
        continueBtn.click();
        MyFunction.Bekle(2);

        // ücretler Bölümü


        double toplam=0;
        List<WebElement> ucretler=driver.findElements(By.xpath("//*[@class='inventory_item_price']"));
        for (WebElement e : ucretler){
            //System.out.println("ucretler " +e.getText());
            toplam+=Double.parseDouble(e.getText().substring(1));  // veya replace("$","") hem topladım hem dolardan ayırdım
        }

        System.out.println("toplam = " + toplam);


        WebElement webAltToplam = driver.findElement(By.xpath("//div[@class='summary_subtotal_label']"));
        //System.out.println("webAltToplam = " + webAltToplam.getText());
        double altToplam=Double.parseDouble(webAltToplam.getText().substring(13)); // çıktısı Item total: $45.98 // dolar işareti yok
        System.out.println("altToplam = " + altToplam);


        Assert.assertTrue("fiYatlarin  Toplamı esit degil = ", (toplam==altToplam));




        driverBekleKapat();



    }
}
