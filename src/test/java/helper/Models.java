package helper;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.JSONObject;

import static helper.Utility.generateRandomEmail;

public class Models {

    public static RequestSpecification request;


    public static void setUpHeaders(){
        request = RestAssured.given()
                .header("Content-type", "application/json")
                .header("Accept", "application/json")
                .header("app-id", "661f6b5aa22352eb46532ec3");
    }

    public static Response getListUsers(String endpoint){
        setUpHeaders();
        return request.when().get(endpoint);
    }

    public static Response createNewUser(String endpoint){

        String title = "mr";
        String firstName = "shultan";
        String lastName = "fajar";
        String picture = "https://tresubresdobles.com/wp-content/uploads/2019/07/skft-67293d24439b84f3ce1ae556d35f10db.jpg";
        String email = generateRandomEmail();
        JSONObject payload = new JSONObject();
        payload.put("title", title);
        payload.put("firstName", firstName);
        payload.put("lastName", lastName);
        payload.put("picture", picture);
        payload.put("email", email);

        setUpHeaders();
        return request.body(payload.toString()).when().post(endpoint);

    }


    public static Response deleteUser(String endpoint, String user_id){
        setUpHeaders();

        String finalEndpoint = endpoint + "/" + user_id;
        return request.when().delete(finalEndpoint);
    }

    public static Response updateUser(String endpoint, String user_id){
        setUpHeaders();

        String title = "mr";
        String firstName = "widi";
        String lastName = "yarto";
        String picture = "https://tresubresdobles.com/wp-content/uploads/2019/07/skft-67293d24439b84f3ce1ae556d35f10db.jpg";
        JSONObject payload = new JSONObject();
        payload.put("title", title);
        payload.put("firstName", firstName);
        payload.put("lastName",lastName);
        payload.put("picture", picture);

        String finalEndpoint = endpoint + "/" + user_id;
        return request.body(payload.toString()).when().put(finalEndpoint);
    }
}
