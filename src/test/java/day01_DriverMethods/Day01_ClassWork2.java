package day01_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Day01_ClassWork2 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //ChromeDriver kullanarak, facebook sayfasina gidin ve sayfa basliginin (title) “facebook”
        //oldugunu dogrulayin (verify), degilse dogru basligi yazdirin.
        driver.get("https://www.facebook.com");
        String baslik = driver.getTitle();
        if (baslik.equals("facebook")) {
            System.out.println("Tittle Testi PASSED");
        } else System.out.println("Tittle Testi FAILED");
        System.out.println("Sayfa Basligi = " + baslik);

        //Sayfa URL’inin “facebook” kelimesi icerdigini dogrulayin, icermiyorsa “actual” URL’i
        //yazdirin.
        String actualUrl = driver.getCurrentUrl();
        if (actualUrl.contains("facebook")) {
            System.out.println("Url Test PASSED");
        } else System.out.println("Url Test FAILED" + actualUrl);

        //https://www.walmart.com/ sayfasina gidin.
        driver.get("https://www.walmart.com");

        //Sayfa basliginin “Walmart.com” icerdigini dogrulayin.
        String baslik1 = driver.getTitle();
        if (baslik1.contains("Walmart.com")) {
            System.out.println("Baslik Test PASSED");
        } else System.out.println("Baslik Test FAILED");

        //Tekrar “facebook” sayfasina donun
        driver.navigate().back();

        //Sayfayi yenileyin
        driver.navigate().refresh();
        // Browser’i kapatin
        driver.close();
    }
}
