package pages;

import org.openqa.selenium.By;

import static helper.Utility.driver;

public class WebPage {


    By SignUp_Button = By.id("signin2");
    By sign_username = By.id("sign-username");
    By sign_password = By.id("sign-password");
    By signUp_button2 = By.cssSelector("button[onclick='register()']");
    By login_button = By.id("login2");
    By login_button2 = By.cssSelector("button[onclick='logIn()']");
    By user_dashboard = By.id("nameofuser");
    By login_username = By.id("loginusername");
    By login_password = By.id("loginpassword");
    By product1 = By.xpath("//a[normalize-space()='Samsung galaxy s6']");
    By add_to_cart = By.xpath("(//*[text()='Add to cart'])");
    By cart_page = By.id("cartur");
    By item_in_may_cart = By.xpath("//tr[@class='success']//td//img");
    By placeOrder_button = By.cssSelector(".btn.btn-success");
    By checkout_page = By.id("orderModalLabel");
    By input_name = By.id("name");
    By input_country = By.id("country");
    By input_city = By.id("city");
    By input_creditCard = By.id("card");
    By input_month = By.id("month");
    By input_year = By.id("year");
    By purchase_button = By.cssSelector("button[onclick='purchaseOrder()']");
    By confirmation_message = By.cssSelector(".sa-placeholder");
    By detail_product = By.cssSelector(".product-content.product-wrap.clearfix.product-deatil");
    By remove_button = By.xpath("//a[normalize-space()='Delete']");
    By page_wrapper = By.cssSelector("#page-wrapper");
    By category = By.xpath("(//*[text()='Monitors'])");
    By result_category = By.cssSelector("img[src='imgs/apple_cinema.jpg']");
    By total = By.id("totalp");
    By contact_button = By.xpath("(//*[text()='Contact'])");
    By email1 = By.id("recipient-email");
    By name1 = By.id("recipient-name");
    By message = By.id("message-text");
    By sendMessage_button = By.xpath("(//*[text()='Send message'])");


    public void userOpenWebHomePage(){
        driver.get("https://www.demoblaze.com/");
    }

    public void userClickSignUpButton(){
        driver.findElement(SignUp_Button).click();
    }

    public void userInputUsername(String username){
        driver.findElement(sign_username).sendKeys(username);
    }

    public void userInputPassword(String password){
        driver.findElement(sign_password).sendKeys(password);
    }

    public void userSubmitRegistrationForm(){
        driver.findElement(signUp_button2).click();
    }

    public void userClickLoginButton(){
        driver.findElement(login_button).click();
    }

    public void userSubmitTheLoginForm(){
        driver.findElement(login_button2).click();
    }

    public void shouldBeRedirectedToTheUserDashboard(){
        driver.findElement(user_dashboard).isDisplayed();
    }

    public void userInputLoginUsername(String username2){
        driver.findElement(login_username).sendKeys(username2);
    }

    public void userInputLoginPassword(String password2){
        driver.findElement(login_password).sendKeys(password2);
    }

    public void userNavigateToAProductPage(){
        driver.findElement(product1).click();
    }

    public void userClickOnTheAddToProductButton(){
        driver.findElement(add_to_cart).click();
    }

    public void userNavigateToTheCartPage(){
        driver.findElement(cart_page).click();
    }

    public void userShouldSeeTheProductsThatHaveBeenAddedToMyCart(){
      driver.findElement(item_in_may_cart).isDisplayed();
    }

    public void userClickPlaceOrderButton(){
        driver.findElement(placeOrder_button).click();
    }

    public void userShouldBeRedirectedToTheCheckoutPage(){
        driver.findElement(checkout_page).isDisplayed();
    }

    public void userFilledInShippingDetailsSuchAsName(String name){
        driver.findElement(input_name).sendKeys(name);
    }

    public void userInputCountry(String country){
        driver.findElement(input_country).sendKeys(country);
    }

    public void userInputCity(String city){
        driver.findElement(input_city).sendKeys(city);
    }

    public void userInputCreditCard(String card){
        driver.findElement(input_creditCard).sendKeys(card);
    }

    public void userInputMonth(String month){
        driver.findElement(input_month).sendKeys(month);
    }

    public void userInputYear(String year){
        driver.findElement(input_year).sendKeys(year);
    }

    public void userClickOnThePurchaseButton(){
        driver.findElement(purchase_button).click();
    }

    public void userShouldSeeAConfirmationMessageForMyPurchase(){
        driver.findElement(confirmation_message).isDisplayed();
    }

    public void userShouldSeeDetailedInformationAboutTheProductIncludingDescriptionPriceAndImages(){
        driver.findElement(detail_product).isDisplayed();
    }

    public void userClickTheRemoveButtonForASpecificProduct(){
        driver.findElement(remove_button).click();
    }

    public void theProductShouldBeRemovedFromMyCart(){
        driver.findElement(page_wrapper).isDisplayed();
    }

    public void userSearchesByMonitorCategory(){
        driver.findElement(category).click();
    }

    public void userShouldSeeSearchResultsThatMatchTheSelectedCategory(){
        driver.findElement(result_category).isDisplayed();
    }

    public void iHaveToSeeThePurchaseSubtotalOfAllTheProductsInMyCart(){
        driver.findElement(total).isDisplayed();
    }

    public void userClickContactButton(){
        driver.findElement(contact_button).click();
    }

    public void userFillsInContactEmail(String email){
        driver.findElement(email1).sendKeys(email);
    }

    public void userFillsInContactName(String name){
        driver.findElement(name1).sendKeys(name);
    }

    public void userFillsInMessage(String msg){
        driver.findElement(message).sendKeys(msg);
    }

    public void userClickSendMessageButton(){
        driver.findElement(sendMessage_button).click();
    }

}
