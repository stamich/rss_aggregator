package pl.edu.ath.core.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import pl.edu.ath.core.model.User;

public interface UserRepository extends MongoRepository<User, String> {

    @Query("{'_id': ?0}")
    User findOneById(String id);

    @Query("{'nickName' : ?0}")
    User findOneByNickName(String nickName);

    @Query("{'email' : ?0}")
    User findOneByEmail(String email);
}
