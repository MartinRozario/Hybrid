package stepDefs.WebSD;

import POM.Web.DeleteElements;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static stepDefs.WebSD.UserDataInput.driver;

public class Delete {
    DeleteElements web3;
    @Given("Click Customer Tab")
    public void clickCustomerTab() throws InterruptedException {
        web3 = new DeleteElements(driver);
        web3.CustomerTab();
    }

    @When("User input for search {string}")
    public void userInputForSearchName(String First) throws InterruptedException {
        web3.SearchCustomer(First);
    }

    @Then("User click on the Delete button")
    public void userClickOnTheDeleteButton() throws InterruptedException {
        web3.DeleteCust();
    }
    }
