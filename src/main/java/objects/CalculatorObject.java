package objects;


import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
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
    @AndroidFindBy(id="digit_1")
    private AndroidElement number1;

    @AndroidFindBy(id="digit_3")
    private AndroidElement number3;

    // Colocamos locators de operaciones
    @AndroidFindBy(id = "op_add")
    private AndroidElement btnMas;

    @AndroidFindBy(id = "op_sub")
    private AndroidElement btnMenos;

    @AndroidFindBy(id = "op_mul")
    private AndroidElement btnPor;

    @AndroidFindBy(id = "op_div")
    private AndroidElement btnEntre;

    @AndroidFindBy(id = "eq")
    private AndroidElement btnIgual;

    @AndroidFindBy(id = "result")
    private AndroidElement lblResult;

    public void touchNumberOne(){
        wait.until(ExpectedConditions.visibilityOf(number1)).click();
    }

    public void touchNumberThree(){
        wait.until(ExpectedConditions.visibilityOf(number3)).click();
    }

    public void touchDigit(String digit){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("digit_" + digit))).click();
    }

    public void touchOperation(String operation){
        switch (operation) {
            case "addition":
                wait.until(ExpectedConditions.visibilityOf(btnMas)).click();
                break;
            case "multiplication":
                wait.until(ExpectedConditions.visibilityOf(btnPor)).click();
                break;
            case "subtraction":
            wait.until(ExpectedConditions.visibilityOf(btnMenos)).click();
                break;
            case "division":
                wait.until(ExpectedConditions.visibilityOf(btnEntre)).click();
                break;
        }
    }

    public void touchIgual(){
        wait.until(ExpectedConditions.visibilityOf(btnIgual)).click();
    }

    public String getResultado(){
        return wait.until(ExpectedConditions.visibilityOf(lblResult)).getText();
    }

}
