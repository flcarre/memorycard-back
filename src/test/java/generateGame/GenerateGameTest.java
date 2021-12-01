package generateGame;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class GenerateGameTest {

    @Test
    public void GenerateGame() {
        given()
                .when().get("newGame")
                    .then()
                    .statusCode(200)
                    .body("aa", is("bb"));

    }
}
