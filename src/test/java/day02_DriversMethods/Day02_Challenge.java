package day02_DriversMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Day02_Challenge {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //2- https://www.amazon.com/ adresine gidin
        driver.get("https://www.amazon.com");
        //3- Browseri tam sayfa yapin
        driver.manage().window().fullscreen();
        //4-Sayfayi “refresh” yapin
        driver.navigate().refresh();
        //5-”Salesforce Apex Questions Bank” icin arama yapiniz
       driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Salesforce Apex Questions Bank", Keys.ENTER);
        //6- Kac sonuc bulundugunu yaziniz
        WebElement aramaSonucYazisi=driver.findElement(By.className("sg-col-inner"));
        List<String> myList = new ArrayList<String>(Arrays.asList(aramaSonucYazisi.getText().split(" ")));
        System.out.println("AramaSonucYazisi.getText() = " + aramaSonucYazisi.getText());
        System.out.println("Amount of Result : "+myList.get(0));
        Thread.sleep(3000);
        driver.quit();


    }
}
