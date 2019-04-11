package pl.edu.ath.core.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pl.edu.ath.core.model.Favorites;
import pl.edu.ath.core.repository.FavoritesRepository;

import java.util.List;

@Service
@Transactional
public class FavoritesServiceImpl implements FavoritesService {

    @Autowired
    private FavoritesRepository repository;

    public Favorites findOneById(String id) {
        return repository.findOneById(id);
    }

    public void save(Favorites favorites) {
        repository.save(favorites);
    }

    public void update(Favorites favorites) {
        Favorites entity = repository.findOneById(favorites.getId());
        if (entity != null){
            entity.setId(favorites.getId());
            entity.setUserId(favorites.getUserId());
        }
    }

    public void delete(Favorites favorites) {
        repository.delete(favorites);
    }

    public List<Favorites> findAll() {
        return repository.findAll();
    }
}
