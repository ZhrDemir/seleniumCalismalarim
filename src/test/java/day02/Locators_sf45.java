package day02;

import ReusableMethod.ReusableMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class Locators_sf45 {
    public static void main(String[] args) {

        //1.ayarlar
        System.setProperty("WebDriver.chrome.driver","chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //2.https://www.automationexercise.com/ git
        driver.get("https://www.automationexercise.com/");

        //3.Category bolumundeki elementleri locate et
         List <WebElement> categoryElement =  driver.findElements(By.className("panel-title"));

         //4.3 element old test et
        int extecdetKategoriSayisi = 3;
        int actualKategoriSayisi = categoryElement.size();

        if (actualKategoriSayisi==extecdetKategoriSayisi){
            System.out.println("Test Passed");
        }else {
            System.out.println("Test Failed");
        }
        //5. categori isimleri yazdırın
        System.out.println(ReusableMethod.stringListeDondur(categoryElement));


        driver.quit();







    }
}
