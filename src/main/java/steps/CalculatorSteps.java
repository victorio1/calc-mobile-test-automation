package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CalculatorSteps {


    @Given("el usuario tiene \"([^\"]*)\" numero and \"([^\"]*)\"")
    public void tashaHasTwoNumbers(Integer number1, Integer number2){

    }

    @When("el usuario realiza la operacion de \"([^\"]*)\"")
    public void tashaMakesAnOperation(String operation){

    }

    @Then("el resultado de la operacion sera \"([^\"]*)\"")
    public void tashaVerifyTheResult(Integer result){

    }

}
