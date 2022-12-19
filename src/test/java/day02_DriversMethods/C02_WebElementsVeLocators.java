package day02_DriversMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C02_WebElementsVeLocators {
    public static void main(String[] args) {
        System.setProperty("webdriver.driver.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //Amazon sayfasina gidelim
        driver.get("https://www.amazon.com");
        //Search bolumunu locate edelim
        //WebElement aramaKutusu=driver.findElement(By.id("twotabsearchtextbox"));
        WebElement aramaKutusu=driver.findElement(By.name("field-keywords"));

        //Search bolumunde iphone aratalim.
       aramaKutusu.sendKeys("Iphone", Keys.ENTER);

       /*
            Eger bir web elementi (Web sayfasindaki her bir buton ya da text/yazi) locate (konumunu belirleme) etmek istersek
       once manuel olarak web sayfasini acip sayfa uzerinde sag click yapip incele'ye tiklariz.
        karsimiza HTML kodlarindan locaterlardan essiz olani seceriz.
        Genellikle id Attribute u kullanilir. Sectigimiz attribute degerini findelement() metodu icine findelement(By.id("attribute degeri"))
        seklinde yazariz
        */

        //Amazon sayfasindaki <input> ve <a> taglarinin sayisini yazdiriniz
        List<WebElement> inputTags=driver.findElements(By.tagName("input"));
        System.out.println("Input Tag Sayisi=="+inputTags.size());
        List<WebElement> aTag=driver.findElements(By.tagName("a"));
        System.out.println("A tags sayisi=="+aTag.size());





    }
}
