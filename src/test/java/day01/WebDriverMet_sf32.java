package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class WebDriverMet_sf32 {
    public static void main(String[] args) throws InterruptedException {

        //1.ayarlar
        System.setProperty("Webdriver.chrome.driver","chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //2.Title
        driver.get("https://www.youtube.com");
        String expectedTitle = "youtube";
        String actualTitle = driver.getTitle();

        if (actualTitle.contains(expectedTitle)){
            System.out.println("Title testi PASSED");
        }else {
            System.out.println("Title testi FAİLED");
            System.out.println("Title : " + actualTitle);
        }
        //3.URL
        driver.get("https://www.youtube.com");
        String expectedUrl = "youtube";
        String actualUrl = driver.getCurrentUrl();

        if (actualUrl.contains(expectedUrl)){
            System.out.println("Url testi PASSED");
        }else {
            System.out.println("Url testi FAİLED");
            System.out.println("Url : " + actualUrl);
        }
        //4. amazona gidin

        driver.navigate().to("https://www.amazon.com/");
        Thread.sleep(2000);

        //5. youtube geri
        driver.navigate().back();
        Thread.sleep(2000);

        //6. yenile
        driver.navigate().refresh();

        //7. amazona dön
        driver.navigate().to("https://www.amazon.com");
        Thread.sleep(2000);

        //8. tam sayfa
        driver.manage().window().maximize();
        Thread.sleep(2000);

        //9. Amazon doğrula


        String expectedTitle2 = "Amazon";
        String actualTitle2 = driver.getTitle();

        if (actualTitle2.contains(expectedTitle2)){
            System.out.println("Title testi PASSED");
        }else {
            System.out.println("Title testi FAİLED");
            System.out.println("Title : " + actualTitle2);
        }
        //10.Url
        String expectedUrl2 = "https://www.amazon.com/";
        String actualUrl2 = driver.getCurrentUrl();

        if (actualUrl2.contains(expectedUrl2)){
            System.out.println("Url testi PASSED");
        }else {
            System.out.println("Url testi FAİLED");
            System.out.println("Url : " + actualUrl2);
        }

        driver.quit();


    }
}
