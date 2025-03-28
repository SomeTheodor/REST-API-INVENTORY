package services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import entities.User;
import repositories.UserRepository;

@Service
public class UserService implements IUserService {

    @Autowired
    private UserRepository repository;

    @Transactional(readOnly = true)
    @Override
    public List<User> findAll() {
        return (List<User>) repository.findAll();
    }
    @Transactional(readOnly = true)
    @Override
    public Optional<User> findById(Long id) {
        return repository.findById(id);
    }
    @Transactional
    @Override
    public User save(User user) {
        return repository.save(user);
    }
    @Transactional
    @Override
    public Optional<User> delete(Long id) {
        Optional<User> userOptional = repository.findById(id);
        userOptional.ifPresent(userDb -> {
            repository.delete(userDb);
        });
        return userOptional;
    }
    @Transactional
    @Override
    public Optional<User> update(Long id, User user) {
        Optional<User> userOptional = repository.findById(id);
        
        return userOptional;
    }
}
