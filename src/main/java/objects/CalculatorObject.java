package objects;


import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CalculatorObject {

    private AndroidDriver<AndroidElement> driver;

    private WebDriverWait wait;

    // Constructor

    public CalculatorObject(AndroidDriver<AndroidElement> driver){
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(this.driver), this);
        wait = new WebDriverWait(this.driver,20);
    }


    // I create my locator number 1
    @AndroidFindBy(id="com.android.calculator2:id/digit_1")
    private AndroidElement number1;

    public void touchNumber1(){
        wait.until(ExpectedConditions.visibilityOf(number1)).click();
    }

}
