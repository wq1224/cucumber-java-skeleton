package io.cucumber.skeleton;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.zh_cn.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TradeStepDefinitions {
    int amount;
    String type;

    @假如("用户有一笔{int}元的交易")
    @Given("user has {int} amount of trade")
    public void input1(int amount){
        this.amount = amount;
        //System.out.println(Thread.currentThread().getName()+ ": amount: " + amount);
    }

    @当("用户使用{word}进行交易")
    @When("user choose {word}")
    public void input2(String type){
        if ("点击成交".equals(type)) this.type = MockTrader.TRADE_CLICK;
        else if ("询价成交".equals(type)) this.type = "NO_CLICK";
        else this.type = type;
        //System.out.println(Thread.currentThread().getName()+ ": word: " + type);
    }

    @那么("交易结果{word}")
    @Then("the result should be {word}")
    public void input3(String expectString){
        boolean actual = MockTrader.doTrade(type, amount);
        boolean expected = false;
        if("成功".equals(expectString)) expected = true;
        else if("失败".equals(expectString)) expected = false;
        else expected = Boolean.valueOf(expectString);
        assertEquals(expected,actual);
    }
}
