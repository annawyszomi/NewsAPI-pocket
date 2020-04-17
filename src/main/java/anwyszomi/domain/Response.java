package anwyszomi.domain;

import java.util.List;

public class Response {

//    private String status;
//    private Integer totalResults;
    private List<Article> articles;

    public List <Article> getArticles() {
        return articles;
    }

    public void setArticles(List <Article> articles) {
        this.articles = articles;
    }

    @Override
    public String toString() {
        return  articles .toString();
    }
}
