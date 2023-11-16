package day01;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class manageMsf30 {
    public static void main(String[] args) throws InterruptedException {

        //1.ayarlar
        System.setProperty("Webdriver.chrome.driver","chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //2.amazona git
        driver.get("https://www.amazon.com/");

        //3.sf konumunu ve boyutunu yaz
        System.out.println("Konumu : " + driver.manage().window().getSize());
        System.out.println("Boyutu : " + driver.manage().window().getPosition());

        //4.sf konumu boyutu istediğimiz sekilde
        driver.manage().window().setPosition(new Point(8,8));
        driver.manage().window().setSize(new Dimension(1300,700));
        Thread.sleep(2000);

        //5.istediğim konum ve boyuta geldiğini test edin

        System.out.println("Konumu : " + driver.manage().window().getSize());
        System.out.println("Boyutu : " + driver.manage().window().getPosition());



        driver.quit();

    }
}
