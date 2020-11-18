package anwyszomi.services;

import anwyszomi.domain.User;
import anwyszomi.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.ws.ServiceMode;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepository userRepository;

    public void addUser(User user){
        userRepository.save(user);
    }

    public void deleteUser(Long id){
        userRepository.delete(id);
    }

    public List<User> getAllUsers(){
        return userRepository.findAll();
    }
}
