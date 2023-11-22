package Gun06;


import Utulity.BaseDriver;
import Utulity.MyFunction;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;


public class ScrollToBottomOfThePage extends BaseDriver {

    @Test
    public void Test1() {
        driver.get("https://triplebyte.com/");

        JavascriptExecutor js=(JavascriptExecutor) driver;

        MyFunction.Bekle(2);
        js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
        // sayafa sonuna kadar kaydır

        MyFunction.Bekle(2);
        js.executeScript("window.scrollTo(0, 0);");
        // sayfa başına git

        driverBekleKapat();
    }
}
