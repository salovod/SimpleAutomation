package pages.villages;

import com.codeborne.selenide.ElementsCollection;
import rules.PageRules;

import static com.codeborne.selenide.Selenide.$$;

/**
 * Created by Sacred on 18.02.2017.
 */
public class VillagePage extends PageRules {


    private int returnAmountOfResourceFactories(String resource) {
        ElementsCollection getResource = $$("[alt*='" + resource + "'");
        int resourceSize = getResource.size();
        return resourceSize;
    }

    public int getAmountOfFarms() {
        return returnAmountOfResourceFactories("Ферма");
    }

    public int getAmountOfWood() {

        return returnAmountOfResourceFactories("Лесопилка");
    }

    public int getAmountOfIron() {
        return returnAmountOfResourceFactories("Железный");
    }

    public int getAmountOfCrop() {
        return returnAmountOfResourceFactories("Глиняный");
    }

    public int[] getAllAmount() {
        return new int[]{getAmountOfFarms(),getAmountOfWood(),getAmountOfIron(),getAmountOfCrop()};
    }
}
