package FlightBasics;

import io.github.bonigarcia.wdm.WebDriverManager;
import javafx.animation.PauseTransitionBuilder;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class Windowhandle {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com");
        driver.findElement(By.xpath("//a[text()='Multiple Windows']")).click();
        driver.findElement(By.xpath("//a[text()='Click Here']")).click();

        ArrayList<String> list= new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(list.get(1));
        System.out.println(driver.findElement(By.xpath("/html/body/div/h3")).getText());
        driver.switchTo().window(list.get(0));
        System.out.println(driver.findElement(By.xpath("//*[@id=\"content\"]/div/h3")).getText());

//        Set<String> windows = driver.getWindowHandles();

       // System.out.println(windows);
//        Iterator<String> itr = windows.iterator();
//        String parentwin = itr.next();
//        String childwin = itr.next();
//        driver.switchTo().window(childwin);
//        System.out.println(driver.getTitle());
//        System.out.println(driver.findElement(By.xpath("/html/body/div/h3")).getText());
//        driver.switchTo().window(parentwin);
//        System.out.println(driver.getTitle());
//        System.out.println(driver.findElement(By.xpath("//*[@id=\"content\"]/div/h3")).getText());


    }


}
