package pl.edu.ath.core.service;

import pl.edu.ath.core.model.Favorites;

import java.util.List;

public interface FavoritesService {

    Favorites findOneById(String id);
    void save(Favorites favorites);
    void update(Favorites favorites);
    void delete(Favorites favorites);
    List<Favorites> findAll();
}
