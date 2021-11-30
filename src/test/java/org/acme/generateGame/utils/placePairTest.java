package org.acme.generateGame.utils;
import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.jupiter.api.Assertions.assertTrue;

@QuarkusTest
public class placePairTest {
    PlacePair placePair = new PlacePair();

    @Test
    public void generateRandomNumber() {
        int number = placePair.generateRandomNumber(10);
        assertTrue(number <= 10);
    }
}
