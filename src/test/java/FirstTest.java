import org.testng.annotations.Test;
import pages.LoginPage;
import pages.Resources;
import pages.buy.Building;
import pages.buy.Soldiers;
import pages.common.Header;
import pages.enums.SOLDERTYPE;
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
//        building.clickOnWall();
        Thread.sleep(3000);

    }

    @Test
    public void fistSolders() throws InterruptedException {
        LoginPage loginPage = new LoginPage();
        loginPage.loginToAccount();
        Soldiers soldiers = new Soldiers();
        soldiers.navigateToBarak();
        soldiers.createSolders(SOLDERTYPE.LEGIONARE,1);
//        building.clickOnWall();
        Thread.sleep(3000);

    }

    //TODO make login -> OP && EC
}
