package day02;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.security.Key;
import java.time.Duration;
import java.util.List;

public class Locators_sf50 {
    public static void main(String[] args) throws InterruptedException {
        //1.ayarlar

        System.setProperty("WebDriver.chrome.driver","chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //2.https://www.automationexercise.com/ adresine git
        driver.get("https://www.automationexercise.com/");
        Thread.sleep(2000);

        //3.147 link bulunduğunu test et

        int expectedlinkSayisi = 147;
        List<WebElement> actualLinkSayisi = driver.findElements(By.tagName("a"));

        if (expectedlinkSayisi==actualLinkSayisi.size()){
            System.out.println("Link sayısı testi PASSED");
        }else {
            System.out.println("Link testi FAİLED");
        }

        //4.Products linkine tıkla

        driver.findElement(By.partialLinkText("Products")).click();

        //5. special offer yazısının göründüğünü test et

        WebElement offerYazisi = driver.findElement(By.id("sale_image"));
        if (offerYazisi.isDisplayed()){
            System.out.println("Offer yazısı görünür testi PASSED");
        }else  System.out.println("Offer yazısı görünür testi Failed");

        Thread.sleep(2000);
        driver.quit();

    }
}
