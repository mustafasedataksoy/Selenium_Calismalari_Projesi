package Gun02;

import Utulity.MyFunction;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindingByIdNotFoundException {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.jotform.com/form-templates/feedback-form");
        driver.manage().window().maximize();


        try {
            WebElement element =driver.findElement(By.id("sedat"));// locator yalnış olduğun için hata verdi.
            System.out.println("labelFirstName.getText() = " + element.getText());

        }catch (Exception ex){
            System.out.println("Eleman Bulunamadı"+ ex.getMessage());
        }

        MyFunction.Bekle(10);
        driver.quit();

    }
}
