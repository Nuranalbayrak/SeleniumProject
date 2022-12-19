package day02_DriversMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03_LocatersGetMethodlari {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //Amazon sayfasina gidelim
        driver.get("http://www.amazon.com");
        //Search bolumune locate edip, Iphone aratalim
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone", Keys.ENTER);
        //Arama sonuc yazisinda iphone yazisini locate edip,konsola yazdiralim.
        WebElement aramaSonucYazisi=driver.findElement(By.className("sg-col-inner"));
        System.out.println(aramaSonucYazisi.getText());

        //sayfayi kapatalim
        driver.close();
    }
}
