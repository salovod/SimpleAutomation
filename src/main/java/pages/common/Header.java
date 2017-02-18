package pages.common;

import rules.PageRules;

import static com.codeborne.selenide.Selenide.$;

/**
 * Created by Sacred on 18.02.2017.
 */
public class Header extends PageRules {

    private String headerElement = "#n";
    private int number;

    public void selectHeader(String locator) {

        switch (locator) {
            case "resource":
                number = 1;
                break;
            case "village":
                number = 2;
                break;
            case "map":
                number = 3;
                break;
            case "statistic":
                number = 4;
                break;
            case "reports":
                number = 5;
                break;
            case "messages":
                number = 6;
                break;
        }
        $(headerElement + number).click();
    }
}
