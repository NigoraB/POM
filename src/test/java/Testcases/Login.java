package Testcases;

import DriverPkg.DriverWrapper;
import org.testng.annotations.Test;

public class Login extends DriverWrapper {

    // user is able to login using valid credentials

    // user is not able to login using invalid credentials

    // user is getting error with blank username/password

    @Test
    public void login1() {
        System.out.println("Login 1");
    }

    @Test
    public void login2() {
        System.out.println("Login 2");
    }

}
