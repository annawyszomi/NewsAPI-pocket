package anwyszomi.services;

import anwyszomi.domain.User;

import java.util.List;

public interface UserService {
    void addUser(User user);
    void deleteUser(Long id);
    List<User> getAllUsers();
}
