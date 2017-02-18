package pages;

import com.codeborne.selenide.SelenideElement;
import rules.PageRules;
import utils.PropertiesReader;

import java.util.Properties;

import static com.codeborne.selenide.Selenide.$;

/**
 * Created by Sacred on 18.02.2017.
 */
public class LoginPage extends PageRules {

    private SelenideElement username = $("[name='name']");
    private SelenideElement password = $("[name='password']");
    private SelenideElement loginButton = $("#s1");

    private Properties introData = PropertiesReader.readProperties("pages/login.properties");

    private String checkData(String data) {
        return introData.getProperty(data);
    }

    private void fillUsername() {
        username.val(checkData("username"));
        makeScreenshot();
    }

    private void fillPassword() {
        password.val(checkData("password"));
        makeScreenshot();
    }

    private void clickOnLoginButton() {
        loginButton.click();
    }

    public void loginToAccount() {
        fillUsername();
        fillPassword();
        clickOnLoginButton();
    }
}
