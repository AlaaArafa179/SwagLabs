import Login_Credentials.Login;
import Login_Credentials.Logout;
import net.bytebuddy.build.Plugin;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;

public class Testingvalidlogin {

    @BeforeMethod
public static void open(){
        Login.Open();
    }
    @Test (priority = 1 , dataProvider = "test_data")
    public static void validlogin(String username , String password){
        String Username = username;
        String Password = password;
        Login.login(username , password);
    }
    @Test(priority = 2, dataProvider = "test_data2")
    public static void invalidlogin(String username , String password){
        String Username = username;
        String Password = password;
        Login.login(username , password);

    }

    @DataProvider
    public String[][] test_data()
    {
        return new String[][] //return table
                {
                        //username password
                        {"standard_user" , "secret_sauce"},

                };

    }
    @DataProvider
    public String[][] test_data2()
    {
        return new String[][] //return table
                {
                        //username password
                        {"standarduser" , "secret_sauce"},
                };

    }
    @AfterMethod
    public static void logout(){
        //class name . function name in class
        Logout.logout();
    }

}
