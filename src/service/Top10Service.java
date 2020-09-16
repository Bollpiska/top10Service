package service;

import java.util.List;

import javax.ejb.Local;

import domain.Game;

@Local
public interface Top10Service {

    public List<Game> getTop10RatedGames();

}
