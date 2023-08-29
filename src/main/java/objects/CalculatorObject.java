package objects;


import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CalculatorObject {

    private WebDriverWait wait;

    // I create my locator number 1
    @AndroidFindBy(id="com.android.calculator2:id/digit_1")
    private AndroidElement number1;

    public void touchNumber1(){
        wait.until(ExpectedConditions.visibilityOf(number1)).click();
    }

}
