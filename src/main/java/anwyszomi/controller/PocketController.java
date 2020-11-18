package anwyszomi.controller;

import anwyszomi.domain.Article;
import anwyszomi.repositories.PocketRepository;
import anwyszomi.services.PocketServiceImpl;
import anwyszomi.supplier.ApiResponder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class PocketController {
    @Autowired
    PocketServiceImpl service;

    @Autowired
    ApiResponder responder;

    @Autowired
    PocketRepository repository;


    @RequestMapping("/save")
    public Article saveAnArticle(@RequestBody Article article){
        return repository.save(article);

    }

//    @PostMapping("/")
//    public void getArticle(){
//       return service.add();
//    }
//    @GetMapping("/addToPocket")
//    public String addToPocket(Model model, @RequestParam Article article) {
//        model.addAttribute( "pocket", new Pocket() );
//        service.add( article );
//        List<Article> articleList = service.findAll();
//        model.addAttribute( "pocketList", articleList );
//        return "pocket";
//    }
//
//    @GetMapping("/pocket")
//    public String showPocket(Model model) {
//        model.addAttribute( "pocket", service.findAll() );
//        return "pocket";
//    }
}
