package services;

import java.util.List;
import java.util.Optional;

import entities.User;

public interface IUserService {
    
    List<User> findAll();
    Optional<User> findById(Long Id);
    User save(User user); //creates the user
    Optional<User> update(Long id, User user);
    Optional<User> delete(Long id);
} 
