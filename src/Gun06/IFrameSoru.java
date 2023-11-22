package Gun06;

import Utulity.BaseDriver;
import Utulity.MyFunction;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class IFrameSoru extends BaseDriver {
    @Test
    public void Test1()
    {
        driver.get("https://chercher.tech/practice/frames");

        driver.switchTo().frame(0);

        MyFunction.Bekle(2);
        WebElement input = driver.findElement(By.cssSelector("#topic + input"));
        input.sendKeys("Türkiye");

        driver.switchTo().frame(0);
        MyFunction.Bekle(2);
        WebElement chcBox= driver.findElement(By.cssSelector("input[id='a']"));
        chcBox.click();

        driver.switchTo().defaultContent();

        driver.switchTo().frame(1);


        MyFunction.Bekle(2);
        WebElement webMenu= driver.findElement(By.id("animals"));
        Select dropDownMenu=new Select(webMenu);
        dropDownMenu.selectByValue("avatar");














        driverBekleKapat();
    }
}
