package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class manageMethodlarisf29 {
    public static void main(String[] args) throws InterruptedException {

        //1.ayarlar
        System.setProperty("Webdriver.chrome.driver","chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //2.amazon sf gidin https://www.amazon.com/
        driver.get("https://www.amazon.com/");
        Thread.sleep(1000);

        //3.sf nın konumunu ve boyutlarını yaz
        System.out.println(driver.manage().window().getPosition());
        System.out.println(driver.manage().window().getSize());

        //4. sf simge durumuna getirin
        driver.manage().window().minimize();


        //5.sf 3 sn bekle max yap
        Thread.sleep(3000);
        driver.manage().window().maximize();

        //6.sf konumu ve boyutları max durumda yazdır
        System.out.println(driver.manage().window().getSize());
        System.out.println(driver.manage().window().getPosition());

        //7.fullscreen yap
        driver.manage().window().fullscreen();
        Thread.sleep(3000);

        //8.tekrar konumve boyut yazdır
        System.out.println(driver.manage().window().getPosition());
        System.out.println(driver.manage().window().getSize());

        driver.quit();

    }
}
