@api
Feature: test automation rest api

  @api
  Scenario: test get list user normal
    Given prepare url for "GET_LIST_USERS"
    And hit api get list users
    And validation status code is equals 200
    When validation response body get list users
    Then validation response json with jsonSchema "get_list_users_normal.json"

  @api
  Scenario: test post create new user
    Given prepare url for "CREATE_NEW_USERS"
    And hit api create user
    And validation status code is equals 200
    When validation response body post create user
    Then validation response json with jsonSchema "post_create_new_user.json"

  @api
  Scenario: test get list user by id
    Given prepare url for "GET_LIST_by_ID"
    And hit api get list users
    And validation status code is equals 200
   When validation response body get list user by id
    Then validation response json with jsonSchema "get_list_user_by_id.json"


  @api
  Scenario: Test delete user normal
    Given prepare url for "CREATE_NEW_USERS"
    And hit api create user
    And validation status code is equals 200
    When validation response body post create user
    When prepare url for "DELETE_USERS"
    When hit api delete user
    Then validation status code is equals 200


  @api
  Scenario: test update user
    Given prepare url for "CREATE_NEW_USERS"
    And hit api create user
    And validation status code is equals 200
    When validation response body post create user
    When prepare url for "UPDATE_USER"
    When hit api update data
    When validation status code is equals 200
    Then validation response body update user


   @api
  Scenario: test get list of tag
    Given prepare url for "GET_LIST_OF_TAGS"
    And hit api get list users
    Then validation status code is equals 200






