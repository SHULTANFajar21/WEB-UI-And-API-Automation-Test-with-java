@web
Feature: test automation Web UI

  @web
  Scenario: user can register an account
    Given user open web homePage
    And user click sign up button
    And user input username "tuying"
    And user input password "secret_sauce"
    When user submit registration form
    Then user should see a success message confirming my registration

  @web
  Scenario: user login with valid username and password
    Given user open web homePage
    And user click login button
    And user input login username "tuying"
    And user input login password "secret_sauce"
    When user submit the login form
    Then should be redirected to the user dashboard

  @web
  Scenario: user login with invalid username and password
    Given user open web homePage
    And user click login button
    And user input login username "tuyin"
    And user input login password "secret_sauc"
    When user submit the login form
    Then user can't login

  @web
  Scenario: user login without filling in the registered username and password
    Given user open web homePage
    And user click login button
    When user submit the login form
    Then user can't login

  @web
  Scenario: verify that the entered password does not contain visible letters/numbers
    Given user open web homePage
    And user click login button
    And user input login username "tuying"
    And user input login password "secret_sauce"
    When user submit the login form
    Then user enters the password, the password is hidden (not visible)

  @web
  Scenario: User can add a product to their cart
    Given user open web homePage
    And user navigate to a product page
    And user click on the add to product button
    And the product should be added to my cart
    When user navigate to the cart page
    Then user should see the products that have been added to my cart

  @web
  Scenario:  user can proceed to checkout
    Given user open web homePage
    And user navigate to a product page
    And user click on the add to product button
    And the product should be added to my cart
    And user navigate to the cart page
    And user should see the products that have been added to my cart
    When user click place Order Button
    Then user should be redirected to the checkout page

  @web
  Scenario: user can complete a purchase
    Given user open web homePage
    And user navigate to a product page
    And user click on the add to product button
    And the product should be added to my cart
    And user navigate to the cart page
    And user should see the products that have been added to my cart
    And user click place Order Button
    And user should be redirected to the checkout page
    And user filled in shipping details, such as name "widi"
    And user input country "rungkang"
    And user input city "brebes"
    And user input credit card "12345678"
    And user input month "desember"
    And user input year "2017"
    When user click on the purchase button
    Then user should see a confirmation message for my purchase

  @web
  Scenario: user completes the purchase without filling in shipping details
    Given user open web homePage
    And user navigate to a product page
    And user click on the add to product button
    And the product should be added to my cart
    And user navigate to the cart page
    And user should see the products that have been added to my cart
    And user click place Order Button
    And user should be redirected to the checkout page
    When user click on the purchase button
    Then user cannot complete the purchase

  @web
  Scenario: user can view product detail
    Given  user open web homePage
    When user navigate to a product page
    Then user should see detailed information about the product including description, price, and images

  @web
  Scenario: user can remove a product form their cart
    Given user open web homePage
    And user navigate to a product page
    And user click on the add to product button
    And the product should be added to my cart
    And user navigate to the cart page
    And user should see the products that have been added to my cart
    When user click the remove button for a specific product
    Then the product should be removed from my cart

  @web
  Scenario: User can search for products in the categories provided
    Given user open web homePage
    When user searches by monitor category
    Then user should see search results that match the selected category

  @web
  Scenario: User can view purchase subtotals on the cart page
    Given user open web homePage
    And user navigate to a product page
    And user click on the add to product button
    And the product should be added to my cart
    And user navigate to the cart page
    When user should see the products that have been added to my cart
    Then I have to see the purchase subtotal of all the products in my cart

  @web
  Scenario: Users can contact customer service
    Given user open web homePage
    And user click contact button
    And user fills in contact email "smf@gmail.com"
    And user fills in contact name "maulana"
    And user fills in message "Thank you for providing a website for learning"
    When user click send message button
    Then user must successfully send the message

  @web
  Scenario: Users register without filling in personal data
    Given user open web homePage
    And user click sign up button
    When user submit registration form
    Then user cannot complete registration because he did not fill in the data



