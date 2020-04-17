package anwyszomi.domain;


import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class User {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Length(min = 1, message = "Login cannot be empty")
    @Column(unique = true)
    private String login;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private Set <Article> articles = new HashSet <>();

    @OneToOne
    private Pocket pocket;

    public User(String login, Set <Article> articles) {
        this.login = login;
        this.articles = articles;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }


    public Set <Article> getArticles() {
        return articles;
    }

    public void setArticles(Set <Article> articles) {
        this.articles = articles;
    }


}
