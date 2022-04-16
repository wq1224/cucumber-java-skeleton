package io.cucumber.skeleton;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.zh_cn.假如;
import io.cucumber.java.zh_cn.当;
import io.cucumber.java.zh_cn.那么;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StepDefinitions {
    String input;
    int output;

    @Given("I have a calculator")
    public void background(){
        System.out.println(Thread.currentThread().getName()+ ": In background");
    }

    @Given("/the input (.*)/")
    public void input1(String input){
        this.input = input;
        System.out.println(Thread.currentThread().getName()+ ": Input1: " + input);
    }

    @假如("有输入 {string}")
    @Given("the string input {string}")
    public void input2(String input){
        this.input = input;
        System.out.println(Thread.currentThread().getName()+ ": Input2: " + input);
    }

    @当("计算器运行")
    @When("the calculator is run")
    public void calculate() {
        output = Calculator.calculate(input);
        System.out.println(Thread.currentThread().getName()+ ": Computing: " + input);
    }

    @Then("^the output should be (\\d*)$")
    public void output1(int result) {
        assertEquals(result, output);
        System.out.println(Thread.currentThread().getName()+ ": Output1: " + output);
    }

    @那么("结果应该是 {int}")
    @Then("the result should be {int}")
    public void output2(int result) {
        assertEquals(result, output);
        System.out.println(Thread.currentThread().getName()+ ": Output2: " + output);
    }
}
