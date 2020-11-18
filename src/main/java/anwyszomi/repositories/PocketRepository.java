package anwyszomi.repositories;

import anwyszomi.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PocketRepository extends JpaRepository <Article, Long> {
}
