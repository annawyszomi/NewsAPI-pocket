package anwyszomi.services;

import anwyszomi.domain.Article;
import anwyszomi.domain.Response;
import anwyszomi.supplier.ApiResponder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class AllArticlesServiceImpl implements AllArticlesService {

    @Autowired
    ApiResponder responder;

    @Override
    public Response findAll() {
        return responder.responseOfAllArticleInBBCNews();
    }

    public List <Article> articleList() {
        return responder.responseOfAllArticleInBBCNews().getArticles();
//        return responder.responseOfAllArticleInBBCNews().get

    }

    public List <Article> articleByTitle(String title) {
        List <Article> articlesByTitle = new ArrayList <>();
//        return responder.responseOfAllArticleInBBCNews().getArticles()
//                .stream()
//                .filter( f -> f.getTitle().contains( title ) ).collect( Collectors.toList() );

        return articlesByTitle;
    }




//    public List<Article> articleByDate(String date){
//        return responder.responseOfAllArticleInBBCNews().getArticles()
//                .stream()
////                .filter( f-> f.getPublishedAt().substring(  ) )
//    }


//    public List<Article> articlesByDateOfPublishing(Calendar publishedAt){
//        List <Article> articlesByDate = new ArrayList <>();
//
//        for (Article article : responder.responseOfAllArticleInBBCNews().getArticles()) {
//           article.dateOfPublishing().get(Calendar.DAY_OF_MONTH)==publishedAt.
//           )
//        }
//        return articlesByDate;
//    }
}