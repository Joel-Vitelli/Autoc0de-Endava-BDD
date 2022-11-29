package com.autoc0de.steps;

import com.autoc0de.pages.ExamplePage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;

public class ExampleSteps {
    /*
    ** PAGE INSTANCE **
     */

    ExamplePage examplePage = new ExamplePage();


    @Given("the user is on the home screen of ToolsQA")
    public void theUserIsOnTheHomeScreenOfToolsQA() {
        examplePage.navigateToMainURL();
    }

    @When("the user completes the data")
    public void theUserCompletesTheData(DataTable listData) {
        examplePage.loadData(listData);
    }

    @And("the user clicks the \"Submit\" button")
    public void theUserClicksTheButton() {
        examplePage.clickSumbitBtn();
    }

    @Then("^the user verifies that the message (.*) appears$")
    public void theUserVerifiesThatTheMessageAppears(String messaje) {
        examplePage.verifyMessaje(messaje);
    }
}
