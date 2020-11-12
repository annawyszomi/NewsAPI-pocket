package anwyszomi.services;

import anwyszomi.domain.Article;
import anwyszomi.repositories.PocketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PocketServiceImpl implements PocketService {

    @Autowired
    PocketRepository repository;

    @Override
    public void add(Article article) {
        repository.save( article );

    }

//    @Override
//    public void add(List<Article> articles) {
//        repository.save(repository.findAll());
//    }

    @Override
    public List <Article> findAll() {
        return repository.findAll();
    }

    @Override
    public void remove(Long id) {
        repository.delete(id);
    }

    @Override
    public Article findOne(Long id) {
        return repository.getOne( id );
    }
}
