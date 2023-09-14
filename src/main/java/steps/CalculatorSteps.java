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
import org.springframework.util.Assert;

public class CalculatorSteps {

    private AndroidDriver<AndroidElement> driver;

    private String operador1, operador2;

    private CalculatorObject calculatorObject;

    @Before
    public void setUp(){
        driver = AndroidDriverManager.getDriver();
    }

    @Given("usuario tiene \"([^\"]*)\" numero y el numero \"([^\"]*)\"")
    public void tashaHasTwoNumbers(String numero1, String numero2) throws Exception{
            operador1 = numero1;
            operador2 = numero2;
    }

    @When("usuario realiza la operacion de \"([^\"]*)\"")
    public void tashaMakesAnOperation(String operation){
            calculatorObject = new CalculatorObject(driver);
            calculatorObject.touchNumberOne();
            calculatorObject.touchOperation(operation);
            calculatorObject.touchNumberThree();
            calculatorObject.touchIgual();

    }

    @Then("resultado de la operacion sera \"([^\"]*)\"")
    public void tashaVerifyTheResult(String result){
       if (calculatorObject.getResultado().contains(result)){
           System.out.println("PINTAREMOS LA CASA DE LA BEBA");
       }else {
           System.out.println("NO HAY CHCOLATADA");
       }
    }


    @After
    public void tearDown() {

        driver = null;

    }

}
