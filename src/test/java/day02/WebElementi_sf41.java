package day02;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.security.Key;
import java.time.Duration;

public class WebElementi_sf41 {
    public static void main(String[] args) throws InterruptedException {

        //1.ayarlar
        System.setProperty("Webdriver.chrome.driver","chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //2.https://www.google.com adresine git
        driver.get("https://www.google.com");

        //3.google arama kutusu locate et
        WebElement aramaKutusu = driver.findElement(By.id("APjFqb"));

        //4.arama kutusuna "Nutella" yazdırın
        aramaKutusu.sendKeys("Nutella" + Keys.ENTER);

        Thread.sleep(2000);
        driver.quit();








    }
}
