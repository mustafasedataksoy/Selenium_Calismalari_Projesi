package Utulity;


import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

import java.time.Duration;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BaseDriver {

    public static WebDriver driver;

    static{
        KalanOncekileriKapat();

//        Logger logger = Logger.getLogger("");
//        logger.setLevel(Level.SEVERE); // Sadece Errorları göster
//        System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY,"true");// Chrome sessiz çalışşsın consolda yazmasın.

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        driver = new ChromeDriver();
       // driver.manage().window().setPosition(new Point(-1650,130));

        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        Duration dr=Duration.ofSeconds(30);
        driver.manage().timeouts().pageLoadTimeout(dr);

       driver.manage().timeouts().implicitlyWait(dr);

    }



    public static void KalanOncekileriKapat()
    {
        try{
            Runtime.getRuntime().exec("taskkill /F /M chromedriver.exe /T");
        }catch (Exception ex){

    }
    }

    public static void driverBekleKapat()
    {
        MyFunction.Bekle(3);
        driver.quit();

    }




}
