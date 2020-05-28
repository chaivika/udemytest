package Junittesting;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Hello1 {
    @Test(dataProvider ="dataabc")
    public void hello1(String username,String password)
    {
        System.out.println("hello 1");
        System.out.println(username);
        System.out.println(password);
    }
@Parameters({"URL"})
    @Test
    public void hello11(String urlname)
    {
        System.out.println("hello 11111");
        System.out.println(urlname);
    }
   @DataProvider
   public Object[][] dataabc(){

        Object[][] abc=new Object[3][2];
        abc[0][0]="user1";
       abc[0][1]="pwd1";
       abc[1][0]="user2";
       abc[1][1]="pwd2";
       abc[2][0]="user3";
       abc[2][1]="pwd3";
       return abc;
   }



}
