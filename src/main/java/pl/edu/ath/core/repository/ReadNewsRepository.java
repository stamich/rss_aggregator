package pl.edu.ath.core.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import pl.edu.ath.core.model.ReadNews;

public interface ReadNewsRepository extends MongoRepository<ReadNews, String> {

    @Query("{'_id': ?0}")
    ReadNews findOneById(String id);
}
