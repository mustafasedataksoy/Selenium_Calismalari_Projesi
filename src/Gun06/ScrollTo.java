package Gun06;

import Utulity.BaseDriver;
import Utulity.MyFunction;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;

public class ScrollTo extends BaseDriver {
    @Test
    public void Test1()
    {
        driver.get("https://triplebyte.com/");

        MyFunction.Bekle(2);
        // JavaScript komutlarını çalıştırmak için önce js değişkeni tanımlandı.
        JavascriptExecutor js= (JavascriptExecutor) driver;

        js.executeScript("window.scrollBy(0, 3000);");
        // (0,3000) -> (x,y) Sayfayı sağa x kadar ve aşağı y kaydırır
        // 3000 px kadar aşağı kaydıracak.

        MyFunction.Bekle(2);
        js.executeScript("window.scrollBy(0, -3000);"); // - yani yukari

        // scrollTo : Verilen pixele gider. (direk verilene gider)
        // scrollBy : Verilen kadar daha ileri gider.  (append)

        MyFunction.Bekle(5);






        driverBekleKapat();
    }
}
