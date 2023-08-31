package steps;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import driver.AndroidDriverManager;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import objects.CalculatorObject;

public class CalculatorSteps {

    private AndroidDriver<AndroidElement> driver;

    private String numero1;

    private CalculatorObject calculatorObject;

    @Before
    public void setUp(){
        driver = AndroidDriverManager.getDriver();
    }

    @Given("el usuario tiene \"([^\"]*)\" numero and \"([^\"]*)\"")
    public void tashaHasTwoNumbers(String number1, String number2) throws Exception{
            calculatorObject = new CalculatorObject(driver);
            calculatorObject.touchNumber1();
        System.out.printf(number1);
        System.out.println(number2);
            Thread.sleep(10000);
    }

    @When("el usuario realiza la operacion de \"([^\"]*)\"")
    public void tashaMakesAnOperation(String operation){

    }

    @Then("el resultado de la operacion sera \"([^\"]*)\"")
    public void tashaVerifyTheResult(Integer result){

    }

    @After
    public void tearDown() {

        driver = null;

    }

}
