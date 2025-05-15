package services;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import entities.User;
import jakarta.persistence.EntityNotFoundException;
import repositories.UserRepository;
import services.interfaces.UserService;

@Service
public class UserServiceImp implements UserService {

    @Autowired
    PasswordEncoder passwordEncoder;
    
    @Autowired
    private UserRepository userRepository;

    @Override
    public User createUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public void deleteUser(Long id) {
        this.userRepository.deleteById(id);
        
    }

    @Override
    public List<User> getAllUsers() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public User getUserByEmail(String email) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public User getUserById(Long id) {
        // TODO Auto-generated method stub
        return userRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("User not found by id"));
    }

    @Override
    public User getUserByUsername(String username) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public User updateUser(Long id, User userUpdated) {
       User user = userRepository.findById(id)
       .orElseThrow(() -> new EntityNotFoundException("User not found by id"));
       String newPassword = passwordEncoder.encode(userUpdated.getPasswordHash()); 
       user.setUsername(userUpdated.getUsername());
       user.setEmail(userUpdated.getEmail());
       user.setPasswordHash(newPassword);
       user.setRole(userUpdated.getRole());
        return userRepository.save(user);
    }
    
}
