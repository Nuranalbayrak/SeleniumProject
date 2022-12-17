package day01_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day01_DriverMethods {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();//bos bir browser actik

        driver.get("https://www.amazon.com"); // ilk olarak gitmek istedigimiz sayfayi belirtiriz.

        System.out.println("Sayfa Basligi"+" "+driver.getTitle());//sayfanin basligini aldik

        System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl());//sayfanin url'ini aldik

       // System.out.println("driver.getPageSource() = " + driver.getPageSource()); acilan sayfanin kaynak kodlarini getirir

        System.out.println("driver.getWindowHandle() = " + driver.getWindowHandle());//Bize o window'a ait hash degerini verir.
                                                                                    // Biz bu hash degerlerini bir string'e atayip pencereler arasi gecis yapabiliriz



    }
}
