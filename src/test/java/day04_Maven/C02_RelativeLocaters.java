package day04_Maven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class C02_RelativeLocaters {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //1https://www.diemol.com/selenium-4-demo/relative-locators-demo.html adresine gidin
        driver.get("https://www.diemol.com/selenium-4-demo/relative-locators-demo.html");
        //Sayfadaki  Berlin’i WE'ini relative locator ile tiklayalim.
        WebElement nycWeElement = driver.findElement(By.xpath("//*[@id='pid3_thumb']"));
        WebElement byAreaWebElement = driver.findElement(By.cssSelector("img[id='pid8_thumb']"));
        WebElement BerlinWebElement = driver.findElement(with(By.tagName("li")).below(nycWeElement).toLeftOf(byAreaWebElement));
        BerlinWebElement.click();





    }
}
