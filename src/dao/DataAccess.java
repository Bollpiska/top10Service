package dao;

import java.util.List;

import javax.ejb.Local;

import domain.Game;

@Local
public interface DataAccess {

    public List<Game> findTop10RatedGames();

}
