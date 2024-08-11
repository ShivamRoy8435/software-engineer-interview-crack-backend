package com.learning_hub.service.services.user;

import com.learning_hub.entity.user.UserEntity;
import com.learning_hub.requestdto.user.UserRequestDto;

public interface IUser {

    public UserEntity createUser(UserRequestDto userRequestDto);
}
