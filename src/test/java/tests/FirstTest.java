package tests;

import org.testng.annotations.Test;
import pages.LoginPage;
import pages.common.Header;
import preparation.DriverConfiguration;

/**
 * Created by Sacred on 18.02.2017.
 */
public class FirstTest extends DriverConfiguration {


    @Test
    public void firstTest() throws InterruptedException {
        LoginPage loginPage = new LoginPage();
        loginPage.loginToAccount();
        Header header = new Header();
        header.selectHeader("");
        Thread.sleep(3000);
    }

    //TODO make login -> OP && EC
}
