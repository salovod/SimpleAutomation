package tests;

import org.junit.Test;
import preparation.DriverConfiguration;

import static com.codeborne.selenide.Selenide.$;

/**
 * Created by Sacred on 18.02.2017.
 */
public class FirstTest extends DriverConfiguration {

    @Test
    public void firstTest() {
        $("").click();
    }

    //TODO make login -> OP && EC
}
