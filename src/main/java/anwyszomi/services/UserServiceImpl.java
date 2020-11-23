package anwyszomi.services;

import anwyszomi.domain.User;
import anwyszomi.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import javax.xml.ws.ServiceMode;
import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepository userRepository;

    @Autowired
    PasswordEncoder passwordEncoder;

    @Override
    public Optional<User> findById(Long id) {
        return userRepository.findById(id);
    }
    public Page<User> findAll(Pageable pageable){
        return userRepository.findAll(pageable);
    }

    public void add(User user){
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        userRepository.save(user);
    }

    public void delete(Long id){
        userRepository.deleteById(id);
    }

    @Override
    public Optional<User> update(User user) {
     Optional<User> userOpt = userRepository.findById(user.getId());

     if(userOpt.isPresent()) {
         User existingUser = userOpt. get();
         if (user.getFirstName() != null) {
             existingUser.setFirstName(user.getFirstName());
         }
         if(user.getLastName()!=null){
             existingUser.setLastName(user.getLastName());
         }
         if(user.getLogin()!=null){
             existingUser.setLogin(user.getLogin());
         }
         if(user.getPassword()!=null){
             existingUser.setPassword(passwordEncoder.encode(user.getPassword()));
         }
         if(user.getGender()!=null){
             existingUser.setGender(user.getGender());
         }
         userRepository.save(existingUser);
         return Optional.of(existingUser);
     }
        return Optional.empty();

    }


}
