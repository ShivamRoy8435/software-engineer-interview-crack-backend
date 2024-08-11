package com.learning_hub.controller.usercontroller;

import com.learning_hub.entity.user.UserEntity;
import com.learning_hub.requestdto.user.UserAuthReqDto;
import com.learning_hub.requestdto.user.UserRequestDto;
import com.learning_hub.service.services.user.IUser;
import com.learning_hub.utility.JwtFilterUtility;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user/")
public class UserController {

    private final IUser iUser;
    private final JwtFilterUtility jwtFilterUtility;
    public UserController(IUser iUser, JwtFilterUtility jwtFilterUtility) {
        this.iUser = iUser;
        this.jwtFilterUtility = jwtFilterUtility;
    }

    @PostMapping("login")
    public String authentication(@RequestBody UserAuthReqDto userAuthReqDto) {

        return jwtFilterUtility.authenticateUser(userAuthReqDto);

    }
    @PostMapping("createUser")
    public UserEntity createUser(@RequestBody UserRequestDto userRequestDto) {
        return iUser.createUser(userRequestDto);
    }

}
