package io.cucumber.skeleton;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.bs.A;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.nio.channels.InterruptedByTimeoutException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DataTableDefinitions {
    List<List<String>> data;
    @Given("input and result")
    public void inputDataTable(DataTable dataTable) {
        data = dataTable.rows(1).asLists();
    }

    @When("the calculator is running")
    public void compute() {
    }

    @Then("the calculator will output correct data")
    public void result() {
        data.stream().forEach(x -> {
            assertEquals(Integer.parseInt(x.get(1)), Calculator.calculate(x.get(0)));
        });
    }
}
