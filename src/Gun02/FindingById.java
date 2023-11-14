package Gun02;

import Utulity.MyFunction;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindingById {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.jotform.com/form-templates/feedback-form");
        driver.manage().window().maximize();

        WebElement name = driver.findElement(By.id("first_8"));
        name.sendKeys("Sedat");

        WebElement lastName= driver.findElement(By.id("last_8"));
        lastName.sendKeys("aksoy");
        

        WebElement labelFirstName=driver.findElement(By.id("sublabel_8_first"));
        System.out.println("labelFirstName.getText() = " + labelFirstName.getText());
        
        WebElement labelLastName= driver.findElement(By.id("sublabel_8_last"));
        System.out.println("labelLastName.getText() = " + labelLastName.getText());


        MyFunction.Bekle(10);
        driver.quit();



    }
}
