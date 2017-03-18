import org.testng.annotations.Test;
import pages.LoginPage;
import pages.Resources;
import pages.buy.Building;
import pages.common.Header;
import pages.villages.VillagePage;
import preparation.DriverConfiguration;

/**
 * Created by Sacred on 18.02.2017.
 */
public class FirstTest extends DriverConfiguration {

    Resources resources = new Resources();
    VillagePage villagePage = new VillagePage();
    Building building = new Building();

    @Test
    public void firstTest() throws InterruptedException {
        LoginPage loginPage = new LoginPage();
        loginPage.loginToAccount();
        Header header = new Header();
        header.selectHeader("resource");
    }


    @Test
    public void firstgTest() throws InterruptedException {
        LoginPage loginPage = new LoginPage();
        loginPage.loginToAccount();
        Header header = new Header();
        header.selectHeader("village");
        building.clickOnWall();
        Thread.sleep(3000);

    }

    //TODO make login -> OP && EC
}
