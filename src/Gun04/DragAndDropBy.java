package Gun04;

import Utulity.BaseDriver;
import Utulity.MyFunction;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropBy extends BaseDriver {
    public static void main(String[] args) {

        driver.get("http://talkerscode.com/webtricks/demo/demo_price-range-slider-using-jquery-css-and-php.php");


        WebElement solSurgu=driver.findElement(By.xpath("//*[@id='slider-range']/span[1]"));
        // solSurgu.getSize().width;
        //2.sürgü   div[id='slider-range']>:nth-child(3)
        MyFunction.Bekle(2);

        Actions aksiyonlar= new Actions(driver);
        Action aksiyon= aksiyonlar.dragAndDropBy(solSurgu,100, 0).build();
        MyFunction.Bekle(2);

        aksiyon.perform();


        driverBekleKapat();

    }
}
