package FlightBasics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.joda.time.Seconds;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static java.util.Arrays.asList;

public class Basics {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
        Thread.sleep(3000);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        //String[] items = {"Cucumber", "Carrot", "Capsicum"};

        ArrayList<String> al=new ArrayList<String>();
        al.add("Cucumber");
        al.add("Carrot");
        List<WebElement> products = driver.findElements(By.xpath("//h4[@class='product-name']"));

        for (int i = 0; i < products.size(); i++) {
            String[] name = products.get(i).getText().split("-");
            String formattedName = name[0].trim();
            int  count=0;
           // List itemsList = Arrays.asList(items);
            if (al.contains(formattedName)) {
                count++;
                driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
                if(count == al.size())
                    break;

            }
        }


    }
}