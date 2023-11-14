package Gun02;

import Utulity.MyFunction;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindingByClassName {
    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.jotform.com/form-templates/feedback-form");
        driver.manage().window().maximize();


        WebElement submitButton = driver.findElement(By.className("form-submit-button"));
        System.out.println("submitButton.getText() = " + submitButton.getText());
        submitButton.click();






        MyFunction.Bekle(10);
        driver.quit();

    }
}
