package preparation;


import org.testng.annotations.BeforeMethod;

import javax.security.auth.login.Configuration;

/**
 * Created by Sacred on 18.02.2017.
 */
public class DriverConfiguration {

    private final int timeOut = 15000;
    private final String browserName = "chrome";
    protected SignUp signUp = new SignUp();

    @BeforeMethod
    public void before() {
        ChromeDriverManager.getInstance().setup();
        FirefoxDriverManager.getInstance().setup();
        Configuration.startMaximized = true;
        Configuration.browser = browserName;
        Configuration.timeout = timeOut;
        open(ENV);
    }

}
