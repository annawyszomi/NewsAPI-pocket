package anwyszomi.services;

import anwyszomi.domain.Article;
import anwyszomi.domain.Response;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

public interface AllArticlesService {

    Response findAll();

    List<Article> articleList();

    List<Article> articleByTitle(String title);

    void add (String title);

    List<Article> articlesFromDb();
}
