package stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.WebPage;

public class WebStepDef {

    WebPage webPage;

    public WebStepDef(){
        this.webPage = new WebPage();
    }

    @Given("user open web homePage")
    public void userOpenWebHomePage() {
        webPage.userOpenWebHomePage();
    }

    @And("user click sign up button")
    public void userClickSignUpButton() {
        webPage.userClickSignUpButton();
    }

    @And("user input username {string}")
    public void userInputUsername(String username) {
        webPage.userInputUsername(username);
    }

    @And("user input password {string}")
    public void userInputPassword(String password) {
        webPage.userInputPassword(password);
    }

    @When("user submit registration form")
    public void userSubmitRegistrationForm() {
        webPage.userSubmitRegistrationForm();
    }

    @Then("user should see a success message confirming my registration")
    public void userShouldSeeASuccessMessageConfirmingMyRegistration() {

    }

    @And("user click login button")
    public void userClickLoginButton() {
        webPage.userClickLoginButton();
    }

    @When("user submit the login form")
    public void userSubmitTheLoginForm() {
        webPage.userSubmitTheLoginForm();
    }

    @Then("should be redirected to the user dashboard")
    public void shouldBeRedirectedToTheUserDashboard() {
        webPage.shouldBeRedirectedToTheUserDashboard();
    }

    @And("user input login username {string}")
    public void userInputLoginUsername(String username2) {
        webPage.userInputLoginUsername(username2);
    }

    @And("user input login password {string}")
    public void userInputLoginPassword(String password2) {
        webPage.userInputLoginPassword(password2);
    }

    @Then("user can't login")
    public void userCanTLogin() {
        
    }

    @Then("user enters the password, the password is hidden \\(not visible)")
    public void userEntersThePasswordThePasswordIsHiddenNotVisible() {
        
    }

    @When("user navigate to a product page")
    public void userNavigateToAProductPage() {
        webPage.userNavigateToAProductPage();
    }

    @When("user click on the add to product button")
    public void userClickOnTheAddToProductButton() {
        webPage.userClickOnTheAddToProductButton();
    }

    @Then("the product should be added to my cart")
    public void theProductShouldBeAddedToMyCart() {
    }

    @When("user navigate to the cart page")
    public void userNavigateToTheCartPage() {
        webPage.userNavigateToTheCartPage();
    }

    @Then("user should see the products that have been added to my cart")
    public void userShouldSeeTheProductsThatHaveBeenAddedToMyCart() {
        webPage.userShouldSeeTheProductsThatHaveBeenAddedToMyCart();
    }

    @When("user click place Order Button")
    public void userClickPlaceOrderButton() {
        webPage.userClickPlaceOrderButton();
    }

    @Then("user should be redirected to the checkout page")
    public void userShouldBeRedirectedToTheCheckoutPage() {
        webPage.userShouldBeRedirectedToTheCheckoutPage();
    }

    @And("user filled in shipping details, such as name {string}")
    public void userFilledInShippingDetailsSuchAsName(String name) {
        webPage.userFilledInShippingDetailsSuchAsName(name);
    }

    @And("user input country {string}")
    public void userInputCountry(String country) {
        webPage.userInputCountry(country);
    }

    @And("user input city {string}")
    public void userInputCity(String city) {
        webPage.userInputCity(city);
    }

    @And("user input credit card {string}")
    public void userInputCreditCard(String card) {
        webPage.userInputCreditCard(card);
    }

    @And("user input month {string}")
    public void userInputMonth(String month) {
        webPage.userInputMonth(month);
    }

    @And("user input year {string}")
    public void userInputYear(String year) {
        webPage.userInputYear(year);
    }

    @When("user click on the purchase button")
    public void userClickOnThePurchaseButton() {
        webPage.userClickOnThePurchaseButton();
    }

    @Then("user should see a confirmation message for my purchase")
    public void userShouldSeeAConfirmationMessageForMyPurchase() {
        webPage.userShouldSeeAConfirmationMessageForMyPurchase();
    }

    @Then("user cannot complete the purchase")
    public void userCannotCompleteThePurchase() {
    }

    @Then("user should see detailed information about the product including description, price, and images")
    public void userShouldSeeDetailedInformationAboutTheProductIncludingDescriptionPriceAndImages() {
        webPage.userShouldSeeDetailedInformationAboutTheProductIncludingDescriptionPriceAndImages();
    }

    @When("user click the remove button for a specific product")
    public void userClickTheRemoveButtonForASpecificProduct() {
        webPage.userClickTheRemoveButtonForASpecificProduct();
    }

    @Then("the product should be removed from my cart")
    public void theProductShouldBeRemovedFromMyCart() {
        webPage.theProductShouldBeRemovedFromMyCart();
    }

    @When("user searches by monitor category")
    public void userSearchesByMonitorCategory() {
        webPage.userSearchesByMonitorCategory();
    }

    @Then("user should see search results that match the selected category")
    public void userShouldSeeSearchResultsThatMatchTheSelectedCategory() {
        webPage.userShouldSeeSearchResultsThatMatchTheSelectedCategory();
    }

    @Then("I have to see the purchase subtotal of all the products in my cart")
    public void iHaveToSeeThePurchaseSubtotalOfAllTheProductsInMyCart() {
        webPage.iHaveToSeeThePurchaseSubtotalOfAllTheProductsInMyCart();
    }

    @And("user click contact button")
    public void userClickContactButton() {
        webPage.userClickContactButton();
    }

    @And("user fills in contact email {string}")
    public void userFillsInContactEmail(String email) {
        webPage.userFillsInContactEmail(email);
    }

    @And("user fills in contact name {string}")
    public void userFillsInContactName(String name) {
        webPage.userFillsInContactName(name);
    }

    @And("user fills in message {string}")
    public void userFillsInMessage(String msg) {
        webPage.userFillsInMessage(msg);
    }

    @When("user click send message button")
    public void userClickSendMessageButton() {
        webPage.userClickSendMessageButton();
    }

    @Then("user must successfully send the message")
    public void userMustSuccessfullySendTheMessage() {
    }

    @Then("user cannot complete registration because he did not fill in the data")
    public void userCannotCompleteRegistrationBecauseHeDidNotFillInTheData() {
    }
}
