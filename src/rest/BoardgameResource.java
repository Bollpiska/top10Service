package rest;

import java.util.List;

import javax.ejb.Stateless;
import javax.enterprise.inject.Default;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import domain.Game;
import service.Top10Service;

@Stateless
@Path("/boardgames")
public class BoardgameResource {

    @Inject
    @Default
    Top10Service service;

    @GET
    @Produces("application/json")
    public List<Game> getTop10Games() {
        return service.getTop10RatedGames();

    }

}
