package anwyszomi.domain;

import lombok.Data;

import javax.persistence.*;

@Data
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
}
