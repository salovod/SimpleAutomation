package rules;

import org.junit.Rule;
import org.junit.rules.ErrorCollector;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import ru.yandex.qatools.allure.annotations.Attachment;

import static com.codeborne.selenide.Selenide.getFocusedElement;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;
import static org.hamcrest.core.IsEqual.equalTo;

/**
 * Created by Sacred on 18.02.2017.
 */
public class PageRules {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";
    public static final String ANSI_BLACK_BACKGROUND = "\u001B[40m";
    public static final String ANSI_RED_BACKGROUND = "\u001B[41m";
    public static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
    public static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
    public static final String ANSI_BLUE_BACKGROUND = "\u001B[44m";
    public static final String ANSI_PURPLE_BACKGROUND = "\u001B[45m";
    public static final String ANSI_CYAN_BACKGROUND = "\u001B[46m";
    public static final String ANSI_WHITE_BACKGROUND = "\u001B[47m";

    @Rule
    protected ErrorCollector collector = new ErrorCollector();

    @Attachment(value = "Check {method}", type = "image/png")
    private byte[] screenRule() {
        return ((TakesScreenshot) getWebDriver()).getScreenshotAs(OutputType.BYTES);
    }

    @Rule
    private void markSelected() {
        if (getWebDriver() instanceof JavascriptExecutor) {
            WebElement elem = getFocusedElement();
            ((JavascriptExecutor) getWebDriver()).executeScript("arguments[0].style.border='1px solid red'", elem);
        }
    }

    protected void makeScreenshot() {
        markSelected();
        screenRule();
    }

    protected void justVerify(String actual, String expected) {
        StackTraceElement getStackTrace = Thread.currentThread().getStackTrace()[2];
        String className = getStackTrace.getClassName();
        String methodName = getStackTrace.getMethodName();
        String simpleClassName = className.substring(className.lastIndexOf('.') + 1);
        collector.checkThat(actual,
                equalTo(expected));
        if (!actual.trim().equals(expected.trim())) {
            System.out.println(ANSI_PURPLE + "~~~~~~~~~~~~~" + simpleClassName + "---------->" + methodName + "~~~~~~~~~~~~~");
            System.out.println(ANSI_RED + "On Site: " + "\n" + actual);
            System.out.println(ANSI_GREEN + "Expected: \n" + expected + ANSI_RESET);
        }
    }

    protected void justVerify(String actual, String expected, String collectionElement) {
        collector.checkThat(actual,
                equalTo(expected));
        if (!actual.trim().equals(expected.trim())) {
            System.out.println("--------------------" + collectionElement + "--------------------");
            System.out.println(ANSI_PURPLE + Thread.currentThread().getStackTrace()[2].getMethodName());
            System.out.println(ANSI_RED + "On Site: " + "\n" + actual);
            System.out.println(ANSI_GREEN + "Expected: \n" + expected + ANSI_RESET);
            System.out.println("--------------------" + "--------------------");
        }
    }

    protected void containsAttribute(String actual, String expected) {
        collector.checkThat(actual,
                equalTo(expected));
        if (!actual.trim().contains(expected.trim())) {
            System.out.println(ANSI_PURPLE + Thread.currentThread().getStackTrace()[2].getMethodName());
            System.out.println(ANSI_RED + "On Site: " + "\n" + actual);
            System.out.println(ANSI_GREEN + "Expected: \n" + expected + ANSI_RESET);
        }
    }

}
