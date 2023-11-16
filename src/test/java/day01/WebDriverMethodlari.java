package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class WebDriverMethodlari {
    public static void main(String[] args) throws InterruptedException {

        //1.ayarlar
        System.setProperty("Webdriver.chrome.driver","chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //2.facebook sf gidin title "facebook" old doğrulayın , değilse doğru baslığı yazdırın

        driver.get("https://www.facebook.com");
        String expectedTitle = "facebook";
        String actualTitle = driver.getTitle();

        if (actualTitle.contains(expectedTitle)){
            System.out.println("Title testi PASSED");
        }else {
            System.out.println("Title testi FAILED");
            System.out.println("Actual Title : " + actualTitle);
        }

        Thread.sleep(2000);
        //3.sayfa URL nin "facebook" kelimesi içerdiğini doğrulayın, içermiyorsa "actual" URL yazdır
        String expectedUrl = "facebook";
        String actualUrl = driver.getCurrentUrl();

        if (actualUrl.contains(expectedUrl)){
            System.out.println("Url testi PASSED");
        }else {
            System.out.println("Url testi FAILED");
            System.out.println("Actual Url : " + actualUrl);
        }

        //4.https://www.walmart.com/ sf gidin
        driver.get("https://www.walmart.com/");

        //5.sayfa baslığının "Walmart.com" içerdiğini doğrulayın
        String expectedTitle1 = "Walmart.com";
        String actualTitle1 = driver.getTitle();

        if (actualTitle1.contains(expectedTitle1)){
            System.out.println("Title testi PASSED");
        }else {
            System.out.println("Title testi FAILED");

        }
         //6. tekrar "facebook" sayfasına donun.
        driver.navigate().back();
        Thread.sleep(2000);

        //7. yenile
        driver.navigate().refresh();

        //8. max yapın
        driver.manage().window().maximize();

        driver.quit();


    }
}
