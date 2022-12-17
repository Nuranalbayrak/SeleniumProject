package day01_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day01_ClassWork {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        //    Amazon sayfasina gidelim. https://www.amazon.com/
        driver.get("https://www.amazon.com");

        //    Sayfa basligini(title) yazdirin
        System.out.println("driver.getTitle() = " + driver.getTitle());

        //    Sayfa basliginin “Amazon” icerdigini test edin
        String actualTittle=driver.getTitle();
        if (actualTittle.contains("amazon")){
            System.out.println("Tittle test PASSED");
        }else System.out.println("Tittle testi FAILED");

        //    Sayfa adresini(url) yazdirin
        System.out.println("Sayfa url'i = " + driver.getCurrentUrl());

        //    Sayfa url’inin “amazon” icerdigini test edin.
        String  actualUrl= driver.getCurrentUrl();
        if (actualUrl.contains("amazon")){
            System.out.println("url adresi  PASSED");
        }else System.out.println("url adresi FAILED");

        //    Sayfa handle degerini yazdirin\
        System.out.println("driver.getWindowHandle() = " + driver.getWindowHandle());

        //    Sayfa HTML kodlarinda “Gateway” kelimesi gectigini test edin
        String sayfaKod= driver.getPageSource();
        if (sayfaKod.contains("Gateway")){
            System.out.println("Test PASSED");
        }else System.out.println("Test FAILED");

        //    Sayfayi kapatin.
        driver.close();//sayfayi kapatmak icin kullandik


    }
}
