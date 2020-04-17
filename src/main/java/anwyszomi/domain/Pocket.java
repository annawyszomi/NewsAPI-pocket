package anwyszomi.domain;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Pocket {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String author;
    private String title;
    private String description;
    private String url;
    private String urlToImage;
    private String publishedAt;
    @OneToMany(mappedBy = "pocket", cascade = CascadeType.ALL)
    private Set <Article> articles = new HashSet <>();
    @OneToOne
    private User user;

    @Override
    public String toString() {
        return "Pocket{" +
                "id=" + id +
                ", articles=" + articles +
                ", user=" + user +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUrlToImage() {
        return urlToImage;
    }

    public void setUrlToImage(String urlToImage) {
        this.urlToImage = urlToImage;
    }

    public String getPublishedAt() {
        return publishedAt;
    }

    public void setPublishedAt(String publishedAt) {
        this.publishedAt = publishedAt;
    }

    public Set <Article> getArticles() {
        return articles;
    }

    public void setArticles(Set <Article> articles) {
        this.articles = articles;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
