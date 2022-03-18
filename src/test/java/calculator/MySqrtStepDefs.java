package calculator;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class MySqrtStepDefs {
    private Calculator calculator;
    private int a;
    private int b;
    private float ans;


    @Before
    public void before() {
        this.calculator = new Calculator();
    }

    @Given("^Two input values are, (-?\\d+) and (-?\\d+)$")
    public void inputValues(int arg0, int arg1) {

        this.a = arg0;
        this.b = arg1;
    }

    @When("^Ali and Sepehr divide a to b and sqrt$")
    public void doFunc() {

        this.ans = this.calculator.sqrt(this.a, this.b);
    }

    @Then("^Ali and Sepehr expect the result ([-+]?([0-9]*\\.[0-9]+|[0-9]+))")
    public void assertion(float arg0, String ignore) {
        Assert.assertEquals(arg0, this.ans, 0.005);
    }
}
