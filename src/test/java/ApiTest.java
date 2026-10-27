import io.restassured.RestAssured;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class ApiTest {

    @Test
    void testGetEndpointReturnsOk() {
        RestAssured.baseURI = "https://httpbin.org";

        given()
            .header("Accept", "application/json")
        .when()
            .get("/get")
        .then()
            .statusCode(200)
            .body("url", equalTo("https://httpbin.org/get"));
    }
}