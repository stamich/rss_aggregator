package pl.edu.ath.core.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pl.edu.ath.core.model.News;
import pl.edu.ath.core.repository.NewsRepository;

import java.time.LocalDate;
import java.util.List;

@Service
@Transactional
public class NewsServiceImpl implements NewsService {

    @Autowired
    private NewsRepository repository;

    public News findOneById(String id) {
        return repository.findOneById(id);
    }

    public News findOneByTitle(String title) {
        return repository.findOneByTitle(title);
    }

    public News findOneByDate(LocalDate date) {
        return repository.findOneByDate(date);
    }

    public News findOneByDateAndTitle(LocalDate date, String title) {
        return repository.findOneByDateAndTitle(date, title);
    }

    @Override
    public void save(News news) {
        repository.save(news);
    }

    @Override
    public void update(News news) {
        News entity = findOneById(news.getId());
        if (entity != null){
            entity.setId(news.getId());
            entity.setTitle(news.getTitle());
            entity.setContent(news.getContent());
            entity.setDate(news.getDate());
            entity.setUrl(news.getUrl());
        }
    }

    @Override
    public void delete(News news) {
        repository.delete(news);
    }

    @Override
    public void deleteById(String id) {
        repository.deleteById(id);
    }

    @Override
    public List<News> findAll() {
        return repository.findAll();
    }
}
