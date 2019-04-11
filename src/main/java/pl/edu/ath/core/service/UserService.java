package pl.edu.ath.core.service;

import pl.edu.ath.core.model.User;

import java.util.List;

public interface UserService {

    User findOneById(String id);
    User findOneByNickName(String nickName);
    User findOneByEmail(String email);
    void save(User user);
    void update(User user);
    void delete(User user);
    void deleteById(String id);
    List<User> findAll();
}
