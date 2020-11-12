package anwyszomi.controller;

import anwyszomi.domain.Article;
import anwyszomi.domain.Response;
import anwyszomi.services.*;
import anwyszomi.supplier.ApiResponder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class BBCNewsController {

    @Autowired
    AllArticlesService everything;

    @Autowired
    TopHeadlinesService topHeadlines;

    @Autowired
    ApiResponder responder;

    @Autowired
    PocketService pocketService;

    @GetMapping("/showBBC")
    private Response all()  {
        return everything.findAll();
    }

    @GetMapping("/showTop")
    private Response  top() {
        return topHeadlines.findAll();
    }

    @GetMapping("/art")
    private Response articleList(String title){
        return responder.articlesByTitle( title );
    }

    @GetMapping("/top")
    private List<Article> topArticle() {
        return topHeadlines.findAll().getArticles();
    }


    @PostMapping("/articles")
    private void articles(){
        pocketService.add(everything.articleList());
    }
//    @GetMapping("/articleByTitle")
//    public List<Article> articleByTitle(String title){
//        return everything.articleByTitle( title );
//    }

}
