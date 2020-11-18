package anwyszomi.domain;

import lombok.Data;

import java.util.List;

@Data
public class Response {

//    private String status;
//    private Integer totalResults;
    private List<Article> articles;

}
