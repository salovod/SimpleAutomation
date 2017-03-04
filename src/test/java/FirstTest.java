import org.testng.annotations.Test;
import pages.LoginPage;
import pages.Resources;
import pages.common.Header;
import preparation.DriverConfiguration;

/**
 * Created by Sacred on 18.02.2017.
 */
public class FirstTest extends DriverConfiguration {

    Resources resources = new Resources();

    @Test
    public void firstTest() throws InterruptedException {
        LoginPage loginPage = new LoginPage();
        loginPage.loginToAccount();
        Header header = new Header();
        header.selectHeader("");
        Thread.sleep(3000);
    }


    @Test
    public void firstgTest() throws InterruptedException {
        LoginPage loginPage = new LoginPage();
        loginPage.loginToAccount();
        Header header = new Header();
        header.selectHeader("");
        Thread.sleep(3000);
        System.out.println(resources.getAvailableResource("wood"));
        System.out.println(resources.getAvailableResource("clay"));
        System.out.println(resources.getAvailableResource("iron"));
        System.out.println(resources.getAvailableResource("crop"));
    }

    //TODO make login -> OP && EC
}
