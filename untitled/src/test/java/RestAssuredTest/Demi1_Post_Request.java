package RestAssuredTest;

import io.restassured.http.ContentType;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

public class Demi1_Post_Request {
@Test
 public  void postTest(){
    baseURI = "https://reqres.in";

    JSONObject request = new JSONObject();
    request.put("name","Ntibi");
    request.put("job","Data Engineer");

            given().
                    contentType(ContentType.JSON).
                    accept(ContentType.JSON).
                    body(request.toJSONString()).
            when().
                post("/api/users").
            then().
                    statusCode(201);

 }


}
