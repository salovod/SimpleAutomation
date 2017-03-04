package pages;

import com.codeborne.selenide.SelenideElement;
import ru.yandex.qatools.allure.annotations.Parameter;
import ru.yandex.qatools.allure.annotations.Step;
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
    @Parameter("My Param")
    String passwordData = checkData("password");

    private String checkData(String data) {
        return introData.getProperty(data);
    }

    @Step
    private void fillUsername() {
        username.val(checkData("username"));
        makeScreenshot();
    }

    @Step
    private void fillPassword() {
        password.val(passwordData);
        makeScreenshot();
    }

    @Step
    private void clickOnLoginButton() {
        loginButton.click();
        makeScreenshot();
    }

    @Step
    public void loginToAccount() {
        fillUsername();
        fillPassword();
        clickOnLoginButton();
    }
}
