package objects;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SamsungCalculator {

    private AndroidDriver<AndroidElement> driver;

    private WebDriverWait wait;

    // Constructor

    public SamsungCalculator(AndroidDriver<AndroidElement> driver){
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(this.driver), this);
        wait = new WebDriverWait(this.driver,20);
    }

    @AndroidFindBy(id = "calc_keypad_btn_add")
    private AndroidElement btnMas;

    @AndroidFindBy(id = "calc_keypad_btn_mul")
    private AndroidElement btnPor;

    @AndroidFindBy(id = "calc_keypad_btn_sub")
    private AndroidElement btnMenos;

    @AndroidFindBy(id = "calc_keypad_btn_div")
    private AndroidElement btnEntre;

    @AndroidFindBy(id = "calc_keypad_btn_equal")
    private AndroidElement btnIgual;

    @AndroidFindBy(id = "calc_edt_formula")
    private AndroidElement lblResult;

    public void touchSamsungDigits(String digit){
        if (digit.length() == 2){
            String firstDigit = digit.substring(0,1);
            String secondDigit = digit.substring(1);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("calc_keypad_btn_0" + firstDigit))).click();
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("calc_keypad_btn_0" + secondDigit))).click();
        } else if (digit.length() == 3) {
            String firstDigit = digit.substring(0,1);
            String secondDigit = digit.substring(1,2);
            String thirdDigit = digit.substring(2);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("calc_keypad_btn_0" + firstDigit))).click();
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("calc_keypad_btn_0" + secondDigit))).click();
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("calc_keypad_btn_0" + thirdDigit))).click();
        } else {
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("calc_keypad_btn_0" + digit))).click();
        }
    }

    public void touchSamsungOperation(String operation){
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

    public void touchSamsungIgual(){
        wait.until(ExpectedConditions.visibilityOf(btnIgual)).click();
    }

    public String getSamsungResultado(){
        return wait.until(ExpectedConditions.visibilityOf(lblResult)).getText();
    }

}
