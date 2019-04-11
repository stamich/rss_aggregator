package pl.edu.ath.core.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import pl.edu.ath.core.model.News;

import java.time.LocalDate;

public interface NewsRepository extends MongoRepository<News, String> {

    @Query("{'_id': ?0}")
    News findOneById(String id);

    @Query("{'title': ?0}")
    News findOneByTitle(String title);

    @Query("{'date': ?0}")
    News findOneByDate(LocalDate date);

    @Query("{'date' : ?0, 'title' : ?1}")
    News findOneByDateAndTitle(LocalDate date, String title);
}
