package FlightBasics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class Dropdowndynamic {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");

        driver.findElement(By.id("autocomplete")).sendKeys("ind");
        Thread.sleep(2000);
        driver.findElement(By.id("autocomplete")).sendKeys(Keys.ARROW_DOWN);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        String text = (String) js.executeScript("return document.getElementById(\"autocomplete\").value;");
        System.out.println("text = " + text);
        int i=0;
        while(!text.equalsIgnoreCase("indonesia")) {
            i++;
            driver.findElement(By.id("autocomplete")).sendKeys(Keys.ARROW_DOWN);
            text = (String) js.executeScript("return document.getElementById(\"autocomplete\").value;");
            System.out.println("text1 = " + text);

            if (i > 10) {
                break;
            }
        }  System.out.println("found");

    }
}
