package day02;

import ReusableMethod.ReusableMethod;
import org.checkerframework.checker.units.qual.K;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class Locators_sf52 {
    public static void main(String[] args) throws InterruptedException {

        //1.ayarlar

        System.setProperty("WebDriver.chrome.driver","chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //2.https://www.testotomasyonu.com/ sf git
        driver.get("https://www.testotomasyonu.com/");

        //3.arama kutusuna "shoes " yazıp arat

        WebElement aramaKutusu = driver.findElement(By.xpath("//input[@class='search-input']"));
        aramaKutusu.sendKeys("shoes");
        aramaKutusu.submit();

        //4.sonuçların sayısını yaz
        List<WebElement> sonuclar = driver.findElements(By.className("prod-img"));
        System.out.println(sonuclar.size());

        //5.ilk urunun resmine tıkla
        sonuclar.get(1).click();
        Thread.sleep(2000);

        driver.quit();

    }
}
