package FlightBasics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dynamicassign {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
        driver.findElement(By.id("checkBoxOption2")).click();
        String name= driver.findElement(By.id("checkBoxOption2")).getAttribute("value");
        System.out.println(name);
        new Select(driver.findElement(By.id("dropdown-class-example"))).selectByValue(name);
        driver.findElement(By.id("name")).sendKeys(name);
        driver.findElement(By.id("alertbtn")).click();
        System.out.println(driver.switchTo().alert().getText());
        //Assert.assertTrue(driver.switchTo().alert().getText().contains(name));
        Assert.assertEquals("Hello "+name+", share this practice page and share your knowledge",driver.switchTo().alert().getText());

    }
}