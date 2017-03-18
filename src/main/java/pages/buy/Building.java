package pages.buy;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$$;

/**
 * Created by Sacred on 18.03.2017.
 */
public class Building {

    private SelenideElement wall = $$("#clickareas > area:nth-child(22)").get(0);

    public void clickOnWall() {
        wall.click();
    }
}
