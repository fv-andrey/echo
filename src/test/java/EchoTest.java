import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class EchoTest {

    @Test
    public void test() {
        given()
                .baseUri("https://postman-echo.com")
                .body("some date")

                .when()
                .post("/post")

                .then()
                .statusCode(200)
                .body("data", equalTo("some data"));
    }
}
