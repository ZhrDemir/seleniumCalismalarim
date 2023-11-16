package ReusableMethod;

import day02.WebElementi_sf41;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class ReusableMethod {

    public static List<String> stringListeDondur(List<WebElement>elementList){
        List<String> stringListesi = new ArrayList<>();
        for (WebElement each:elementList
             ) {
            stringListesi.add(each.getText());
        }return stringListesi;
    }
}
