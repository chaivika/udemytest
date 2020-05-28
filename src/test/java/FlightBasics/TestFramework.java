package FlightBasics;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class TestFramework {
    @Test
    public void myName() {
        System.out.println("name");
    }
    @Test
    public void ayName2() {
        System.out.println("name22");
    }
    @AfterMethod
    public void myClass() {
        System.out.println("class");
    }

}
