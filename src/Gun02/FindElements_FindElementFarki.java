package Gun02;

import Utulity.MyFunction;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FindElements_FindElementFarki {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.jotform.com/form-templates/feedback-form");
        driver.manage().window().maximize();


        WebElement submitButton = driver.findElement(By.className("form-sub-label"));
        System.out.println("submitButton.getText() = " + submitButton.getText());

        List<WebElement> labellar = driver.findElements(By.className("form-sub-label"));
        System.out.println("labellar.size() = " + labellar.size());

        for (WebElement e : labellar){
            System.out.println("e.getText() = " + e.getText());
        }


         // aranılan eleman bulunamaz ise : FindElement NosuchElement hatası verir.
        // FindElements ise  değeri 0 olan list verir, yani hata vermez.
        MyFunction.Bekle(10);
        driver.quit();

    }
}
