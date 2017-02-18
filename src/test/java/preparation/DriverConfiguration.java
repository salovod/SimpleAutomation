package preparation;


import com.codeborne.selenide.Configuration;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.FirefoxDriverManager;
import org.testng.annotations.BeforeMethod;

import static com.codeborne.selenide.Selenide.open;


/**
 * Created by Sacred on 18.02.2017.
 */
public class DriverConfiguration {

    private final int timeOut = 15000;
    private final String browserName = "chrome";

    @BeforeMethod
    public void before() {
        ChromeDriverManager.getInstance().setup();
        FirefoxDriverManager.getInstance().setup();
        Configuration.startMaximized = true;
        Configuration.browser = browserName;
        Configuration.timeout = timeOut;
        open("http://ts2.travian.ru/?lang=ru");
    }

}
