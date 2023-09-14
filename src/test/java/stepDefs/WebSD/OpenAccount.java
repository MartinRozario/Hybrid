package stepDefs.WebSD;

import POM.Web.AccountElements;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static POM.Web.AccountElements.acceptAlertUsingJs;
import static stepDefs.WebSD.UserDataInput.driver;

public class OpenAccount {

    AccountElements web2;
    @Given("User goto Open Account tab")
    public void userGotoOpenAccountTab() throws InterruptedException {
        web2 = new AccountElements(driver);
        web2.AAButton();
    }

    @When("User click Customer dropdown")
    public void userClickCustomerDropdown() throws InterruptedException {
        web2.CustomerDropdown();
    }

    @And("Select created account")
    public void selectCreatedAccount() throws InterruptedException {
        web2.CustID();
    }

    @And("User click Currency dropdown")
    public void userClickCurrencyDropdown() throws InterruptedException{
        web2.CurrencyDropdown();
    }

    @And("Select a Currency")
    public void selectACurrency() throws InterruptedException {
        web2.Currency();
    }

    @Then("User click on Process button")
    public void userClickOnProcessButton() throws InterruptedException {
        web2.Submit();
    }

    @Then("Handle popup")
    public void handlePopup() {
        acceptAlertUsingJs();
    }
}
