package FlightBasics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Table {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
        WebElement table = driver.findElement(By.id("product"));
        List<WebElement> rows = table.findElements(By.tagName("tr"));
        List<WebElement> columns = table.findElements(By.tagName("th"));
        System.out.println("rows = " + rows.size());
        System.out.println("columns = " + columns.size());
        System.out.println(rows.get(2).getText());


    }
}