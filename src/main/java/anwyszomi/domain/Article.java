package anwyszomi.domain;

import javax.persistence.*;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Objects;

@Entity
public class Article {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne
    private Source source;
    private String author;
    private String title;
    private String description;
    private String url;
    private String urlToImage;
    private String publishedAt;
//    @ManyToOne
//    private User user;
//    @ManyToOne
//    private Pocket pocket;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Source getSource() {
        return source;
    }

    public void setSource(Source source) {
        this.source = source;
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

    public Calendar dateOfPublishing() {

        String dateString = publishedAt;
        int year = Integer.parseInt( publishedAt.substring( 0, 4 ) );
        int month = Integer.parseInt( publishedAt.substring( 5, 7 ) );
        int day = Integer.parseInt( publishedAt.substring( 8, 10 ) );

        return new GregorianCalendar( year, month - 1, day );

    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Article article = (Article) o;
        return Objects.equals( id, article.id ) &&
                Objects.equals( author, article.author ) &&
                Objects.equals( title, article.title ) &&
                Objects.equals( description, article.description ) &&
                Objects.equals( url, article.url ) &&
                Objects.equals( urlToImage, article.urlToImage ) &&
                Objects.equals( publishedAt, article.publishedAt );
    }

    @Override
    public int hashCode() {

        return Objects.hash( id, author, title, description, url, urlToImage, publishedAt );
    }

    @Override
    public String toString() {
        return
// "id= " + id +"\n"+
                "author=" + author + "\t" +
                        "title=" + title + "\n" +
                        "description=" + description + "\n" +
                        "url=" + url + "\n" +
                        "urlToImage=" + urlToImage + "\n" +
                        "publishedAt=" + publishedAt + "\n";
    }
}
