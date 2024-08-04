package com.learning_hub.service.servicesImpl.user;

import com.learning_hub.entity.user.UserEntity;
import com.learning_hub.repositories.user.UserRepository;
import com.learning_hub.service.services.user.IUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class userImpl implements IUser {
   private final UserRepository userRepository;
@Autowired
    public userImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<UserEntity> getAllUsers() {
        return userRepository.findAll();
    }

@Override
    public Optional<UserEntity> getUserById(Long id) {
        return userRepository.findById(id);
    }

@Override
    public UserEntity saveUser(UserEntity user) {
        return userRepository.save(user);
    }

@Override
    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }
}
