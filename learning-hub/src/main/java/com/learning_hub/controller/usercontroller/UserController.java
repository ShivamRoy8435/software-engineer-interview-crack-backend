package com.learning_hub.controller.usercontroller;

import com.learning_hub.entity.user.UserEntity;
import com.learning_hub.service.services.user.IUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/user")
public class UserController {
    private final IUser iUser ;
@Autowired
    public UserController(IUser iUser) {
        this.iUser = iUser;
    }

    @GetMapping
    public List<UserEntity> getAllUsers() {
        return iUser.getAllUsers();
    }

    @GetMapping("/{id}")
    public ResponseEntity<UserEntity> getUserById(@PathVariable Long id) {
        return iUser.getUserById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public UserEntity createUser(@RequestBody UserEntity user) {
        return iUser.saveUser(user);
    }

    @PutMapping("/{id}")
    public ResponseEntity<UserEntity> updateUser(@PathVariable Long id, @RequestBody UserEntity userDetails) {
        return iUser.getUserById(id)
                .map(user -> {
                    user.setUName(userDetails.getUName());
                    user.setUMobileNo(userDetails.getUMobileNo());
                    return ResponseEntity.ok(iUser.saveUser(user));
                })
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteUser(@PathVariable Long id) {
        iUser.deleteUser(id);
        return ResponseEntity.ok().build();
    }





}
