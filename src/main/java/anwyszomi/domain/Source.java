package anwyszomi.domain;

import javax.persistence.*;

@Entity
public class Source {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    private String name;
    @OneToOne
    private Article article;
//    private String description;
//    private String url;
//    private String category;
//    private String language;
//    private String country;


    public Article getArticle() {
        return article;
    }

    public void setArticle(Article article) {
        this.article = article;
    }

    public Source(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public Source() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Source{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
