package Gun04;

import Utulity.BaseDriver;
import Utulity.MyFunction;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class ActionHoverOverTest extends BaseDriver {

//    Jewellery -> Neckless -> Bib Neckless click
//    tıklatma işleminden sonra URL de
//    bib-necklaces kelimesinin geçtiğini doğrulayın.

    @Test
    public void Test1()
    {
        driver.get("https://www.etsy.com/");

        // 1- isDisplay ve isEnable gibi kontroller, element HTML nin içinde var fakat görünür değil.
        // durumunda kullanılır.
        // 2- BAZI durumlarda element HTML nini içinde hiç yoktur.

        List<WebElement> cookiesAccept=driver.findElements(By.cssSelector("[data-gdpr-single-choice-accept='true']"));
        // elementi bulamazsa imlicitly wait devreye girer ve verilen süre kadar bulmaya çalışır
        if (cookiesAccept.size() > 0) // varsa
            cookiesAccept.get(0).click(); // kapat

        WebElement mucevher = driver.findElement(By.id("catnav-primary-link-10855"));
        WebElement kolye = driver.findElement(By.id("side-nav-category-link-10873"));
        WebElement bibKolye = driver.findElement(By.id("catnav-l3-10881"));

        Actions aksiyonlar=new Actions(driver);

        aksiyonlar.moveToElement(mucevher).build().perform();
        MyFunction.Bekle(2);
        aksiyonlar.moveToElement(kolye).build().perform();
        MyFunction.Bekle(2);
        aksiyonlar.moveToElement(bibKolye).build().perform();
        MyFunction.Bekle(2);

        bibKolye.click();

        Assert.assertTrue( driver.getCurrentUrl().contains("bib"));


        driverBekleKapat();
    }
}
