package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import objects.CalculatorObject;

public class CalculatorSteps {

    private AndroidDriver<AndroidElement> driver;

    private String numero1;

    private CalculatorObject calculatorObject;


    @Given("el usuario tiene \"([^\"]*)\" numero and \"([^\"]*)\"")
    public void tashaHasTwoNumbers(Integer number1, Integer number2){
            calculatorObject = new CalculatorObject(driver);
            calculatorObject.touchNumber1();
    }

    @When("el usuario realiza la operacion de \"([^\"]*)\"")
    public void tashaMakesAnOperation(String operation){

    }

    @Then("el resultado de la operacion sera \"([^\"]*)\"")
    public void tashaVerifyTheResult(Integer result){

    }

}
