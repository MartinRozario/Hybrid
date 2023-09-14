package stepDefs.APISD;

import Core.API.ApiCall;
import Core.API.DatabaseManager;
import Core.API.HeaderFormatHelper;
import Repository.localRepo.dbModel.GetApiDBModel;
import Repository.remoteRepo.responseRepo.UserGetApiResponseModel;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.messages.internal.com.google.gson.Gson;
import io.restassured.response.Response;

import java.sql.ResultSet;
import java.sql.SQLException;

import static Core.API.CoreContainHelper.base_url;

public class GetApiSD {
    String url;
    GetApiDBModel getApiDbModel;
    private Response responsegetApi;
    private final Gson gson = new Gson();

    @Given("user has the base api")
    public void userHasTheBaseApi() {
        url = base_url + "users";
    }

    @When("user call the {string} and {string}")
    public void userCallTheParameterAndParamsValue(String parameter, String paramValue) {
        url = url + parameter + "=" + paramValue;
        System.out.println(url);
        responsegetApi = ApiCall.getCall(HeaderFormatHelper.commonHeaders(), url);
        System.out.println(responsegetApi.body().asString());
    }

    @Then("it will return valid data")
    public void itWillReturnValidData() throws SQLException, ClassNotFoundException {
        getApiDbModel = new GetApiDBModel();
        System.out.println(url);
        UserGetApiResponseModel getApiResponseModel = gson.fromJson(responsegetApi.getBody().asString(), UserGetApiResponseModel.class);
        System.out.println(getApiResponseModel.getPage());
        System.out.println(getApiResponseModel.getData().get(0).getFirst_name());
        ResultSet rs = DatabaseManager.executeQueries("select * from test where id =" + 101 + " ");
        while (rs.next()) {


            getApiDbModel.setJob(rs.getString(3));

            getApiDbModel.setName(rs.getString(1));
            System.out.println(getApiDbModel.getId());
            System.out.println(getApiDbModel.getJob());
            System.out.println(getApiDbModel.getName());

            // System.out.println(rs.getString(2));
        }
    }
}
