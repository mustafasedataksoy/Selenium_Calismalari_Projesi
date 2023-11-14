package Gun01;


import Utulity.MyFunction;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class MainApp {
   public static void main(String[] args) throws InterruptedException {

       System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
               WebDriver driver = new ChromeDriver();
               driver.get("https://www.techno.study/");
               driver.manage().window().maximize();

               MyFunction.Bekle(5);
               driver.quit();








    }

}
