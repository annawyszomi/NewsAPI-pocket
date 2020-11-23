package anwyszomi.services;

import anwyszomi.domain.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface UserService {
    void add(User user);
    void delete(Long id);
    Page<User> findAll(Pageable pageable);
    Optional<User> update(User user);
    Optional<User> findById(Long id);
   List<User> findByCriteria(String criteria, String searchItem);
}
