package day04_Maven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_Tekrar {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        // Amazon sayfasına gidiniz
        driver.get("https://www.amazon.com");
        // Arama kutusunu locate ediniz
       WebElement aramaKuitusu=driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']"));
        /*
        <input type="text" id="twotabsearchtextbox" value="" name="field-keywords"
         autocomplete="off" placeholder="" class="nav-input nav-progressive-attribute" dir="auto" tabindex="0" aria-label="Ara" spellcheck="false">
         */
        // Arama kutusunun tagName'inin input olduğunu test ediniz
        String actualTagName=aramaKuitusu.getTagName();
        String expectedTagName="input";
        if (actualTagName.equals(expectedTagName)){
            System.out.println("TagName Testo PASSED");
        }else System.out.println("TagName Testo FAILED");

        // Arama kutusunun name atributu'nun değerinin field-keywords olduğunu test ediniz
        String actualAttributeName=aramaKuitusu.getAttribute("name");
        String expectedAttributeName="field-keywords";
        if (actualAttributeName.equals(expectedAttributeName)){
            System.out.println("Attribute testi PASSED");
        } else System.out.println("Attribute testi FAILED");
        // Sayfayı kapatınız
        driver.close();
    }
}
