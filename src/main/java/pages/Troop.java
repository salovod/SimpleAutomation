package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

/**
 * Created by Oleh on 18.02.2017.
 */
public class Troop {

    private int health;
    private int healthInt;
    private SelenideElement heroHealth = $(".heroHealthBarBox ");


    public Integer getHeroHealth() {
        String tempHealth = $(heroHealth).$(".bar").getAttribute("style").replaceAll("[^0-9]", "");
        health = Integer.parseInt(tempHealth);
        return health;
    }


}
