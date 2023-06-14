package RestAssuredTest;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;


public class Demo1_Get_Request {
    @Test
//    public void getRequest(){
//
//        baseURI= "https://reqres.in";
//
//        given().
//                get("/api/users/2").
//                then().
//                    statusCode(200).
//                    body("data.email",equalTo("janet.weaver@reqres.in")).
//                    body("data.first_name",equalTo("Janet")).
//                    body("data.last_name",equalTo("Weaver"));
//
//
//
//    }

    @Parameters({"email","firstName","lastName"})
    public void getRequest(String email, String firstName,String lastName){
        baseURI= "https://reqres.in";

        given().
                get("/api/users/2").
                then().
                statusCode(200).
                body("data.email",equalTo("janet.weaver@reqres.in")).
                body("data.first_name",equalTo("Janet")).
                body("data.last_name",equalTo("Weaver"));



    }
}
