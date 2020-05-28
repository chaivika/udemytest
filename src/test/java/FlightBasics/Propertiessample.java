package FlightBasics;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Propertiessample {
    public static void main(String[] args) throws IOException {
        Properties prop = new Properties();
        FileInputStream fis = new FileInputStream("/Users/chay/Desktop/Udemy/src/test/java/FlightBasics/input.properties");
        prop.load(fis);
        System.out.println(prop.getProperty("browser"));
        System.out.println(prop.getProperty("url"));

        prop.setProperty("browser","chrome");
    }
}