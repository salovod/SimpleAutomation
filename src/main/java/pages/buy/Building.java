package pages.buy;

import com.codeborne.selenide.SelenideElement;
import pages.enums.Buildings;

import static com.codeborne.selenide.Selenide.*;

/**
 * Created by Sacred on 18.03.2017.
 */
public class Building implements Buildings {

    private SelenideElement wall = $$("#clickareas > area:nth-child(22)").get(0);
    private SelenideElement upgradeBuildingButton = $(".section1 > [type='button']");

    public void navigateToWallPage() {
        open(V1_WALL);
    }

    public void setBuildWall() {
        upgradeBuildingButton.click();
    }
}
