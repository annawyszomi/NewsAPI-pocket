package anwyszomi.domain;

import lombok.Data;
import lombok.Getter;

import javax.persistence.*;
import java.util.*;

@Data
@Getter
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
    @ManyToMany
    private List<User> users = new ArrayList<>();

}
