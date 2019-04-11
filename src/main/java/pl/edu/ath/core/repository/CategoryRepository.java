package pl.edu.ath.core.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import pl.edu.ath.core.model.Category;

public interface CategoryRepository extends MongoRepository<Category, String> {

    @Query("{'_id': ?0}")
    Category findOneById(String id);

    @Query("{'name' : ?0}")
    Category findOneByName(String name);
}
