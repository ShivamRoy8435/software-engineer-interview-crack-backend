package com.learning_hub.service.services.user;

import com.learning_hub.entity.user.UserEntity;

import java.util.List;
import java.util.Optional;

public interface IUser {
    List<UserEntity> getAllUsers();
    Optional<UserEntity> getUserById(Long id);
    UserEntity saveUser(UserEntity user);
    void deleteUser(Long id);
}
