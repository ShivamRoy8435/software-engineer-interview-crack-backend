package com.learning_hub.service.servicesImpl.user;

import com.learning_hub.entity.user.UserEntity;
import com.learning_hub.repositories.user.UserRepository;
import com.learning_hub.requestdto.user.UserRequestDto;
import com.learning_hub.service.services.user.IUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;


@Service
public class userImpl implements IUser {
    @Autowired
    UserRepository userRepository;
    @Autowired
    PasswordEncoder passwordEncoder = new BCryptPasswordEncoder(12);

    @Override
    public UserEntity createUser(UserRequestDto userRequestDto) {
        UserEntity user = new UserEntity();
        user.setUsername(userRequestDto.getUsername());
        user.setPassword(passwordEncoder.encode(userRequestDto.getPassword()));
        return userRepository.save(user);

    }
}
