package Gun06;

import Utulity.BaseDriver;
import Utulity.MyFunction;
import org.junit.Test;

import java.awt.*;
import java.awt.event.KeyEvent;

public class RobotGiris extends BaseDriver {

    @Test
    public void Test1() throws AWTException {
        driver.get("http://demo.guru99.com/test/upload/");

        Robot rbt = new Robot();

        /*   Accept All için */
        for(int i=0;i<6;i++) {
            rbt.keyPress(KeyEvent.VK_TAB);
            rbt.keyRelease(KeyEvent.VK_TAB);
            MyFunction.Bekle(1);
        }

        rbt.keyPress(KeyEvent.VK_ENTER);
        rbt.keyRelease(KeyEvent.VK_ENTER);
        /*****************************/

        for(int i=0;i<22;i++) {
            rbt.keyPress(KeyEvent.VK_TAB);
            rbt.keyRelease(KeyEvent.VK_TAB);
            MyFunction.Bekle(1);
        }

        rbt.keyPress(KeyEvent.VK_ENTER);
        rbt.keyRelease(KeyEvent.VK_ENTER); // şu anda windows popup açıldı


        for (int i =0; i<4; i++) {
            rbt.keyPress(KeyEvent.VK_TAB);
            rbt.keyRelease(KeyEvent.VK_TAB);
            MyFunction.Bekle(1);
        }
        rbt.keyPress(KeyEvent.VK_ENTER);
        rbt.keyRelease(KeyEvent.VK_ENTER);

        driverBekleKapat();
    }

}
