package pl.edu.ath.core.service;

import pl.edu.ath.core.model.News;

import java.time.LocalDate;
import java.util.List;

public interface NewsService {

    News findOneById(String id);
    News findOneByTitle(String title);
    News findOneByDate(LocalDate date);
    News findOneByDateAndTitle(LocalDate date, String title);
    void save(News news);
    void update(News news);
    void delete(News news);
    void deleteById(String id);
    List<News> findAll();
}
