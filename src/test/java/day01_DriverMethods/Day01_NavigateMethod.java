package day01_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day01_NavigateMethod {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        //Amazon sayfasina gidelim
        driver.navigate().to("https://amazon.com");

        //techpro sayfasina gidelim
        Thread.sleep(3000);//gecis arasi bekletiyoruz gormek icin
        driver.navigate().to("https://techproeducation.com");

        //tekrar amazon sayfasina gidelim
        Thread.sleep(3000);
        driver.navigate().back();//amazon sayfasina geri doner

        //Tekrar techpro sayfasina gidelim
        Thread.sleep(3000);
        driver.navigate().forward();//techproya gider

        //Son sayfada sayfayi yenileyelim
        Thread.sleep(3000);
        driver.navigate().refresh();

        //Ve sayfayi kapatalim.
        driver.close();






    }
}
