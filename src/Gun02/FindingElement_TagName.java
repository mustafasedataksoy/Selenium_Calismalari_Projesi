package Gun02;

import Utulity.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


import java.util.List;

public class FindingElement_TagName extends BaseDriver {

      public static void main(String[] args) {

          // driverBaslat();


          List<WebElement> linkler = driver.findElements(By.tagName("a")); // Sayfadaki tüm linkleri console a yazdırır.
          
          for (WebElement e :linkler){
              if (e.getText().equals(""));// kırık link ekranda gözüken kısmı yok.

              System.out.println("link.getAttribute(href) = " + e.getAttribute("href"));
              System.out.println("link.getAttribute(title) = " + e.getAttribute("title"));
              System.out.println("link.getAttribute(rel) = " + e.getAttribute("rel"));
          }




          driverBekleKapat();


    }
}
