package service;

import java.util.List;

import javax.ejb.Stateless;
import javax.enterprise.inject.Default;
import javax.inject.Inject;

import dao.DataAccess;
import domain.Game;

@Default
@Stateless
public class Top10ServiceImpl implements Top10Service {

    @Inject
    private DataAccess dao;

    @Override
    public List<Game> getTop10RatedGames() {
        return dao.findTop10RatedGames();
    }

}
