package generateGame;

import io.vertx.core.json.JsonObject;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("newGame")
public class GenerateGame {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public JsonObject newGame() {
        JsonObject game = new JsonObject();
        game.put("aa", "bb");

        return game;
    }
}
