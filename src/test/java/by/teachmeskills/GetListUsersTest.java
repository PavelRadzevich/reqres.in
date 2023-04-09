package by.teachmeskills;

import io.restassured.http.ContentType;
import org.apache.http.HttpStatus;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class GetListUsersTest {
    final String baseUrl = "";

    @Test
    public void GetUsers() {
        String page = given()
                .baseUri("https://reqres.in/")
                .basePath("api/users?page=3")
                .contentType(ContentType.JSON)
                .when().log().all()//.ifValidationFails(LogDetail.ALL,true).
                .get()
                .then().statusCode(HttpStatus.SC_OK)
                .log().all()//.ifValidationFails(LogDetail.ALL,true)
                .extract().body().jsonPath().getString("page");
        System.out.println(page);
    }
}
