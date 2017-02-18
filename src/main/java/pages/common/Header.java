package pages.common;

import rules.PageRules;

import static com.codeborne.selenide.Selenide.$;

/**
 * Created by Sacred on 18.02.2017.
 */
public class Header extends PageRules {

    private String headerElement = "#n";


    public void selectHeader(String locator) {
        int number;
        switch (locator) {
            case "resource":
                number = 1;
                $(headerElement + number).click();
        }
    }
}
