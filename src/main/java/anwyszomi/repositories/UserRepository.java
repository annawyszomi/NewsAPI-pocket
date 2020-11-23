package anwyszomi.repositories;

import anwyszomi.domain.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    List<User> findByLogin(String login);
    List<User> findByFirstName(String firstName);
    List<User> findByLastName(String lastName);

}
