package dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import domain.Game;

@Stateless
//@Default
public class DataAccessImpl implements DataAccess {

    @PersistenceContext
    private EntityManager em;

    @Override
    public List<Game> findTop10RatedGames() {
        Query q = em.createQuery("select game from Game game order by rating desc");
        List<Game> games = q.getResultList();

        return games;
    }

}
