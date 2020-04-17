package anwyszomi.supplier;

import anwyszomi.domain.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ApiResponder {

    private Environment environment;
    private String apiKey;

    @Autowired
    public ApiResponder(Environment environment) {
        this.environment = environment;
        this.apiKey = environment.getProperty( "news.key" );
    }

    private static final String urlAllArticleInBBCNews = "https://newsapi.org/v2/everything?sources=bbc-news&apiKey=";
//    private static final String apiKey = "&apiKey=451749a4ddfe4621b2a606b3593d4fbc";
    private static final RestTemplate restTemplate = new RestTemplate();

    private static final String urlAllArticle = "https://newsapi.org/v2/everything";

    private static final String urlTopHeadlinesBBCNews = "https://newsapi.org/v2/top-headlines?sources=bbc-news&apiKey=";

    public Response responseOfAllArticleInBBCNews() {
        Response obj = restTemplate.getForObject( urlAllArticleInBBCNews + apiKey, Response.class );
        return obj;

    }

    public Response responseOfTopHeadlinesBBCNews() {
        Response obj = restTemplate.getForObject( urlTopHeadlinesBBCNews + apiKey, Response.class );
        return obj;
    }

    public Response articlesByTitle(String title) {
        String url = urlAllArticle + "?q=" + title + apiKey;
        Response articles = restTemplate.getForObject( url, Response.class );
        return articles;
    }

}
