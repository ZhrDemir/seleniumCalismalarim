package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class WebDriverMethodlarisf24 {
    public static void main(String[] args) throws InterruptedException {

        //1.Ayarlar
        System.setProperty("Webdriver.chrome.driver","chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        //2.Amazon sf gidelim https://www.amazon.com/
        driver.get("https://www.amazon.com/");
        Thread.sleep(2000);

        //4.Sayf baslığını yazdır Title
        System.out.println(driver.getTitle());

        //5.Sayfa başlığının "Amazon içerdiğini test edin

        String expextedTitleIcerik = "Amazon";
        String actualTitle = driver.getTitle();

        if (actualTitle.contains(expextedTitleIcerik)){
            System.out.println("Title testi PASSED");
        }else {
            System.out.println("Title testi FAİLED");
            System.out.println("Actual Title : " + actualTitle);
        }
        //6.Url yazdırın
        System.out.println(driver.getCurrentUrl());

        //7.Url nin "amazon" içerdiğini test edin
        String expectedUrl = "amazon";
        String actualUrl = driver.getCurrentUrl();

        if (actualUrl.contains(expectedUrl)){
            System.out.println("URL testi PASSED");
        }else {
            System.out.println("URL testi FAİLED");

            System.out.println("Actual URL : " + actualUrl);
        }
        //8.handle değerini bulun
        System.out.println(driver.getWindowHandle());

        //9.html kodlarında "alisveris" kelimesi gectigini test edin.
        String expectedHtml = "alisveris";
        String actualHtml = driver.getPageSource();

        if (actualHtml.contains(expectedHtml)){
            System.out.println("HTML testi PASSED");
        }else {
            System.out.println("HTML testi FAİLED");

            //System.out.println("Actual HTML : " + actualHtml);
        }

        //Sayfayı kapatın
        Thread.sleep(3000);
        driver.quit();
    }
}
