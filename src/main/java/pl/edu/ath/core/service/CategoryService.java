package pl.edu.ath.core.service;

import pl.edu.ath.core.model.Category;

import java.util.List;

public interface CategoryService {

    Category findOneById(String id);
    Category findOneByName(String name);
    void save(Category category);
    void update(Category category);
    void delete(Category category);
    List<Category> findAll();
}
