package pages;

import helper.EndPoint;
import helper.Utility;
import io.restassured.module.jsv.JsonSchemaValidator;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import java.io.File;
import java.util.List;
import java.util.Objects;

import static helper.Models.*;
import static org.assertj.core.api.Assertions.assertThat;

public class ApiPage {


    String set_URL, global_ID;
    Response res;
    public void prepareUrlFor(String url){
        switch (url){
            case "GET_LIST_USERS":
                set_URL = EndPoint.GET_LIST_USERS;
                break;
            case "CREATE_NEW_USERS":
                set_URL = EndPoint.CREATE_NEW_USERS;
                break;
            case "GET_LIST_by_ID":
                set_URL = EndPoint.GET_LIST_by_ID;
                break;
            case "DELETE_USERS":
                set_URL = EndPoint.DELETE_USERS;
                break;
            case "UPDATE_USER":
                set_URL = EndPoint.UPDATE_USER;
                break;
            case "GET_LIST_OF_TAGS":
                set_URL = EndPoint.GET_LIST_OF_TAGS;
                break;
            default:
                System.out.println("input right url");
        }
    }


    public void hitApiGetListUsers(){
        res = getListUsers(set_URL);
    }

    public void validationStatusCodeIsEquals(int status_code){
        assertThat(res.statusCode()).isEqualTo(status_code);
    }


    public void validationResponseBodyGetListUsers(){

        List<Object> id = res.jsonPath().getList("data.id");
        List<Object> title = res.jsonPath().getList("data.title");
        List<Object> firstName = res.jsonPath().getList("data.firstName");
        List<Object> lastName = res.jsonPath().getList("data.lastName");
        List<Object> picture = res.jsonPath().getList("data.picture");

        assertThat(id.get(0)).isNotNull();
        assertThat(title.get(0)).isIn("ms", "miss", "mr", "mrs");
        assertThat(firstName.get(0)).isNotNull();
        assertThat(lastName.get(0)).isNotNull();
        assertThat(picture.get(0)).isNotNull();

    }


    public void validationResponseJsonWithJsonSchema(String filename){
        File JSONFile = Utility.getJSONSchemaFile(filename);
        res.then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(JSONFile));
    }

    public void hitApiCreateUser(){
        res = createNewUser(set_URL);
    }

    public void validationResponseBodyPostCreateUser(){

        JsonPath jsonpath = res.jsonPath();
        String id = jsonpath.get("id");
        String title = jsonpath.get("title");
        String firstName = jsonpath.get("firstName");
        String lastName  = jsonpath.get("lastName");
        String picture = jsonpath.get("picture");
        String email = jsonpath.get("email");

        assertThat(id).isNotNull();
        assertThat(title).isIn("ms", "mr", "miss", "mrs");
        assertThat(firstName).isNotNull();
        assertThat(lastName).isNotNull();
        assertThat(picture).isNotNull();
        assertThat(email).isNotNull();

        global_ID = id;
    }


    public void validationResponseBodyGetListUserById(){

        JsonPath jsonPath = res.jsonPath();
        String id = jsonPath.get("id");
        String title = jsonPath.get("title");
        String firstName = jsonPath.get("firstName");
        String lastName = jsonPath.get("lastName");
        String picture = jsonPath.get("picture");
        String email = jsonPath.get("email");

        assertThat(id).isNotNull();
        assertThat(title).isIn("mr", "miss", "ms", "mrs");
        assertThat(firstName).isNotNull();
        assertThat(lastName).isNotNull();
        assertThat(picture).isNotNull();
        assertThat(email).isNotNull();



    }

    public void hitApiDeleteUser(){
        res = deleteUser(set_URL, global_ID);
    }

    public void hitApiUpdateData(){
        res = updateUser(set_URL, global_ID);
    }

    public void validationResponseBodyUpdateUser(){
        JsonPath jsonPath = res.jsonPath();
        String id = jsonPath.get("id");
        String title = jsonPath.get("title");
        String firstName = jsonPath.get("firstName");
        String lastName = jsonPath.get("lastName");
        String picture = jsonPath.get("picture");
        String email = jsonPath.get("email");

        assertThat(id).isNotNull();
        assertThat(title).isIn("mr", "miss", "ms", "mrs");
        assertThat(firstName).isNotNull();
        assertThat(lastName).isNotNull();
        assertThat(picture).isNotNull();
        assertThat(email).isNotNull();
    }

}
