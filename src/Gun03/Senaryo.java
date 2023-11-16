package Gun03;

import Utulity.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Senaryo extends BaseDriver {

    public static void main(String[] args) {

        driver.get("https://formsmarts.com/form/yu?mode=h5");


        WebElement business=driver.findElement(By.cssSelector("[for='u_Wuo_4586_0'] >input"));
        business.click();

        WebElement selectOption= driver.findElement(By.cssSelector("#u_Wuo_4588 >*:nth-child(4) "));
        selectOption.click();

        WebElement Everyday=driver.findElement(By.cssSelector("[for='u_Wuo_89585_0'] >input"));
        Everyday.click();

        WebElement Good = driver.findElement(By.cssSelector("#u_Wuo_4589_lbl +label > input"));
        Good.click();

        WebElement selectOption2=driver.findElement(By.cssSelector("#u_Wuo_4597 >*:nth-child(4)"));
        selectOption2.click();


        driverBekleKapat();

    }
}
