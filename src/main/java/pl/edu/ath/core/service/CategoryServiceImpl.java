package pl.edu.ath.core.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pl.edu.ath.core.model.Category;
import pl.edu.ath.core.repository.CategoryRepository;

import java.util.List;

@Service
@Transactional
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryRepository repository;

    public Category findOneById(String id) {
        return repository.findOneById(id);
    }

    public Category findOneByName(String name) {
        return repository.findOneByName(name);
    }

    public void save(Category category) {
        repository.save(category);
    }

    public void update(Category category) {
        Category entity = repository.findOneById(category.getId());
        if (entity != null){
            entity.setId(category.getId());
            entity.setName(category.getName());
            entity.setColor(category.getColor());
        }
    }

    public void delete(Category category) {
        repository.delete(category);
    }

    public List<Category> findAll() {
        return repository.findAll();
    }
}
