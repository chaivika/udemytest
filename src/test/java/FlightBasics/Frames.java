package FlightBasics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com");
        driver.findElement(By.xpath("//a[text()='Nested Frames']")).click();

        //byname
//        driver.switchTo().frame("frame-top");
//        driver.switchTo().frame("frame-middle");
//        System.out.println(driver.findElement(By.xpath("//div[@id='content']")).getText());
        //byid

        driver.switchTo().frame(0);
        driver.switchTo().frame(1);
        System.out.println(driver.findElement(By.xpath("//div[@id='content']")).getText());
        driver.switchTo().parentFrame();
        driver.switchTo().parentFrame();
        driver.switchTo().frame(1);
        System.out.println(driver.findElement(By.cssSelector("body")).getText());


    }
}
