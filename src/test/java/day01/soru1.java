package day01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class soru1 {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("Webdriver.chrome.driver","chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // 1- https://testotomasyonu.com/addremove/ adresine gidin

        driver.get("https://testotomasyonu.com/addremove/");


        // 2- Add Element butonuna basin

        driver.findElement(By.xpath("//button[@id='sub-btn']")).click();

        // 3- Delete butonu’nun gorunur oldugunu test edin

        WebElement deleteElementi=driver.findElement(By.xpath("//button[@class='remove-btn']"));
       if (deleteElementi.isDisplayed()){
           System.out.println("Delete butonu görünürlüğü testi PASSED");
       }else System.out.println("Delete butonu görünürlüğü testi Failed");

        // 4- Delete tusuna basin

        deleteElementi.click();

        // 5- “Add/Remove Elements” yazisinin gorunur oldugunu test edin

        WebElement AddRemoveElementi=driver.findElement(By.xpath("//*[.='Add/Remove Elements']"));
        if (AddRemoveElementi.isDisplayed()){
            System.out.println("Add/Remove yazısı görünürlüğü testi PASSED");
        }else System.out.println("Add/Remove yazısı görünürlüğü testi Failed");



        Thread.sleep(3000);
        driver.quit();

    }


}
