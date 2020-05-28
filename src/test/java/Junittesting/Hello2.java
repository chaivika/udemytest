package Junittesting;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Hello2 {
    @BeforeMethod
    public void before()
    {
        System.out.println("Before method");
    }
    @Test
    public void hello2()
    {
        System.out.println("hello 2");
    }
    @Test
    public void hello22()
    {
        System.out.println("hello 222222");
    }
    @AfterMethod
    public void after()
    {
        System.out.println("after method");
    }
}
