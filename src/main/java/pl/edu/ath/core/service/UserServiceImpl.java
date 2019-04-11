package pl.edu.ath.core.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pl.edu.ath.core.model.User;
import pl.edu.ath.core.repository.UserRepository;

import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository repository;

    public User findOneById(String id) {
        return repository.findOneById(id);
    }

    public User findOneByNickName(String nickName) {
        return repository.findOneByNickName(nickName);
    }

    public User findOneByEmail(String email) {
        return repository.findOneByEmail(email);
    }

    public void save(User user){
        repository.save(user);
    }

    public void update(User user){
        User entity = repository.findOneById(user.getId());
        if (entity != null){
            entity.setNickName(user.getNickName());
            entity.setEmail(user.getEmail());
            entity.setRoles(user.getRoles());
        }
//        repository.save(user);
    }

    public void delete(User user){
        repository.delete(user);
    }

    @Override
    public void deleteById(String id) {
        repository.deleteById(id);
    }

    public List<User> findAll(){
        return repository.findAll();
    }
}
