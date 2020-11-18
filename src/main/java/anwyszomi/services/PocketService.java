package anwyszomi.services;

import anwyszomi.domain.Article;

import java.util.List;

public interface PocketService {
    void add(Article article);
//    void add(List<Article> articles);
    List<Article> findAll();
    void remove(Long id);
    Article findOne(Long id);


}
