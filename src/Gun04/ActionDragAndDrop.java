package Gun04;

import Utulity.BaseDriver;
import Utulity.MyFunction;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionDragAndDrop extends BaseDriver {

    @Test
    public void Test()
    {
        driver.get("http://dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");

        WebElement oslo=driver.findElement(By.id("box1"));
        WebElement norvec=driver.findElement(By.id("box101"));

        MyFunction.Bekle(2);
        //1.yöntem
        Actions aksiyonlar=new Actions(driver);
        Action aksiyon=aksiyonlar.dragAndDrop(oslo, norvec).build();
        aksiyon.perform();

        //2.Yöntem
        WebElement seul=driver.findElement(By.id("box5"));
        WebElement kore=driver.findElement(By.id("box105"));

        aksiyon = aksiyonlar.clickAndHold(seul).build();
        aksiyon.perform();  // sürüklenecek elementi mousla tuttum aldım.
        //new Actions(driver).clickAndHold(seul).build().perform();   //kısa yol


        aksiyon = aksiyonlar.moveToElement(kore).release().build();
        aksiyon.perform();  // hedef e götür(moveToElement) ve bırak(release)
        //new Actions(driver).moveToElement(kore).release().build().perform();  //kısa hali


        MyFunction.Bekle(2);




        driverBekleKapat();
    }
}
