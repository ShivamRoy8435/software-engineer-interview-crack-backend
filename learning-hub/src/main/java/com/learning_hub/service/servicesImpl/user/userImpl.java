package com.learning_hub.service.servicesImpl.user;

import com.learning_hub.entity.user.UserEntity;
import com.learning_hub.repositories.user.UserRepository;
import com.learning_hub.requestdto.user.UserRequestDto;
import com.learning_hub.service.services.user.IUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class userImpl implements IUser {
    @Autowired
    UserRepository userRepository;

    @Override
    public void createUser(UserRequestDto userRequestDto) {
        UserEntity user = new UserEntity();
        user.setPassword(userRequestDto.getPassword());
        user.setUsername(userRequestDto.getUsername());
        userRepository.save(user);
    }
}
