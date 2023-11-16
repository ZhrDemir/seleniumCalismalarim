package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class navigateMethodlari {
    public static void main(String[] args) throws InterruptedException {

        //1.düzenlemeler yapın
        System.setProperty("Webdriver.chrome.driver","chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //2.YouTube anasayfa git  https://www.youtube.com/
        driver.get("https://www.youtube.com/");
        Thread.sleep(2000);

        //3.Amazon sf gidin https://www.amazon.com/
        driver.get("https://www.amazon.com/");
        Thread.sleep(2000);

        //4.tekrar youtube sf dönelim
        driver.navigate().back();
        Thread.sleep(2000);

        //5.yeniden amazon sf gidin
        driver.navigate().forward();
        Thread.sleep(2000);

        //6.sf yenile
        driver.navigate().refresh();

        //7.kapat
        driver.quit();




    }
}
