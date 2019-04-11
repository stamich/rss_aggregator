package pl.edu.ath.core.controller;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import pl.edu.ath.core.model.News;
import pl.edu.ath.core.service.CategoryService;
import pl.edu.ath.core.service.FavoritesService;
import pl.edu.ath.core.service.NewsService;
import pl.edu.ath.core.service.UserService;

@Controller
public class MainController {

    private CategoryService categoryService;
    private FavoritesService favoritesService;
    private NewsService newsService;
    private UserService userService;

    @Autowired
    public MainController(CategoryService categoryService, FavoritesService favoritesService, NewsService newsService, UserService userService) {
        this.categoryService = categoryService;
        this.favoritesService = favoritesService;
        this.newsService = newsService;
        this.userService = userService;
    }

    @GetMapping(value = "/allNews", produces = "application/json")
    public ResponseEntity<?> allNews(){
        return (ResponseEntity) newsService.findAll();
    }

    @PostMapping(value = "/addNews", produces = "application/json")
    public ResponseEntity<?> addNews(@RequestBody News news){
        news.setId(news.getId());
        newsService.save(news);
        return ResponseEntity.ok(news);
    }

    @DeleteMapping(value = "/deleteNews", produces = "application/json")
    public ResponseEntity<?> deleteNews(@RequestParam String id){

        newsService.deleteById(id);
        return ResponseEntity.ok(id + ": Deleted");
    }
}
