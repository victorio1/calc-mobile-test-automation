package steps;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import driver.AndroidDriverManager;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import objects.SamsungCalculator;
import org.springframework.util.Assert;
import static org.testng.Assert.assertEquals;
public class SamsungCalculatorSteps {

    private AndroidDriver<AndroidElement> driver;

    private String operador1, operador2;

    private SamsungCalculator samsungCalculator;

    @Before
    public void setUp(){
        driver = AndroidDriverManager.getDriver();
    }

    @Given("yo quiero sumar \"([^\"]*)\" con el numero \"([^\"]*)\"")
    public void iHaveTwoNumbers(String numero1, String numero2) throws Exception{
        operador1 = numero1;
        operador2 = numero2;
    }

    @When("realizo la operacion de \"([^\"]*)\"")
    public void iTryToMakeAnOperation(String operation){
         samsungCalculator = new SamsungCalculator(driver);
         samsungCalculator.touchSamsungDigit(operador1);
         samsungCalculator.touchSamsungOperation(operation);
         samsungCalculator.touchSamsungDigit(operador2);
         samsungCalculator.touchSamsungIgual();
    }

    @Then("finalmente como resultado tendre \"([^\"]*)\"")
    public void iVerifyTheResult(String result){
        System.out.println(samsungCalculator.getSamsungResultado());
        String valueObtained = samsungCalculator.getSamsungResultado();
        String valueObtainedSucessfully = valueObtained.replace(" Calculation result","");
        Assert.hasText(result,valueObtainedSucessfully);
        assertEquals(result,valueObtainedSucessfully,"Test Fallido");
    }


    @After
    public void tearDown() {

        driver = null;

    }

}
