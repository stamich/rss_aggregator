package pl.edu.ath.core.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import pl.edu.ath.core.model.Favorites;

public interface FavoritesRepository extends MongoRepository<Favorites, String> {

    @Query("{'_id': ?0}")
    Favorites findOneById(String id);
}
