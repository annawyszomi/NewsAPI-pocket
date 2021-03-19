package anwyszomi.repositories;

import anwyszomi.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PocketRepository extends JpaRepository<Article, Long> {
}
