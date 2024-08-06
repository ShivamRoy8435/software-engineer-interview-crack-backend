package com.learning_hub.controller.usercontroller;

import com.learning_hub.requestdto.user.UserAuthReqDto;
import com.learning_hub.requestdto.user.UserRequestDto;
import com.learning_hub.service.services.user.IUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user/")
public class UserController {

    @Autowired
    IUser iUser;
    @PostMapping("login")
    public void authentication(@RequestBody UserAuthReqDto userAuthReqDto) {

    }
    @PostMapping("createUser")
    public void createUser(@RequestBody UserRequestDto userRequestDto) {
        iUser.createUser(userRequestDto);
    }

}
