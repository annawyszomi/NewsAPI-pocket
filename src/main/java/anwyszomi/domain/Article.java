package anwyszomi.domain;



import javax.persistence.*;
import java.util.*;


@Entity
public class Article {

    @Id
    @GeneratedValue
    private Long id;
    @OneToOne
    private Source source;
    private String author;
    private String title;
    private String description;
    private String url;
    private String urlToImage;
    private String publishedAt;
    @ManyToMany
    private List<User> users = new ArrayList<>();

    public Long getId() {
        return id;
    }

    public Source getSource() {
        return source;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getUrl() {
        return url;
    }

    public String getUrlToImage() {
        return urlToImage;
    }

    public String getPublishedAt() {
        return publishedAt;
    }

    public List<User> getUsers() {
        return users;
    }
}
