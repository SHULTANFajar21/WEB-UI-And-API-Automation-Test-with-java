package stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ApiPage;

public class ApiStepDef {

    ApiPage apiPage;

    public ApiStepDef() {
        this.apiPage = new ApiPage();
    }

    @Given("prepare url for {string}")
    public void prepareUrlFor(String url) {
        apiPage.prepareUrlFor(url);
    }

    @And("hit api get list users")
    public void hitApiGetListUsers() {
        apiPage.hitApiGetListUsers();
    }

    @And("validation status code is equals {int}")
    public void validationStatusCodeIsEquals(int status_code) {
        apiPage.validationStatusCodeIsEquals(status_code);
    }

    @When("validation response body get list users")
    public void validationResponseBodyGetListUsers() {
        apiPage.validationResponseBodyGetListUsers();
    }

    @Then("validation response json with jsonSchema {string}")
    public void validationResponseJsonWithJsonSchema(String filename) {
        apiPage.validationResponseJsonWithJsonSchema(filename);
    }

    @And("hit api create user")
    public void hitApiCreateUser() {
        apiPage.hitApiCreateUser();
    }

    @When("validation response body post create user")
    public void validationResponseBodyPostCreateUser() {
        apiPage.validationResponseBodyPostCreateUser();
    }

    @When("validation response body get list user by id")
    public void validationResponseBodyGetListUserById() {
        apiPage.validationResponseBodyGetListUserById();
    }


    @When("hit api delete user")
    public void hitApiDeleteUser() {
        apiPage.hitApiDeleteUser();
    }

    @When("hit api update data")
    public void hitApiUpdateData() {
        apiPage.hitApiUpdateData();
    }

    @Then("validation response body update user")
    public void validationResponseBodyUpdateUser() {
        apiPage.validationResponseBodyUpdateUser();
    }


}
