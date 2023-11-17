package Gun03;

import Utulity.BaseDriver;
import Utulity.MyFunction;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Select_Class extends BaseDriver {

    @Test
    public void Test()
    {
        driver.get("https://www.amazon.com.tr/");

        WebElement webMenu=driver.findElement(By.id("searchDropdownBox"));

        Select ddMenu = new Select(webMenu);

        //ddMenu.selectByVisibleText("Books");
        //ddMenu.selectByIndex(5); index 0 dan başlıyor.
        ddMenu.selectByValue("search-alias=stripbooks");
        MyFunction.Bekle(1);

        WebElement searchBtn=driver.findElement(By.id("nav-search-submit-button"));
        searchBtn.click();

        WebElement element = driver.findElement(By.xpath("//h1[text()='Kitap']"));
        Assert.assertTrue(element.getText().contains("Kitap"));





        driverBekleKapat();







    }
}
