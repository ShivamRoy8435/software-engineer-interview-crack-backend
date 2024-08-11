package com.learning_hub.utility;

import com.learning_hub.entity.user.UserEntity;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import java.util.Collection;
import java.util.Collections;

/**
 * This class is used for setting the username password and set the authorities and set default check
 * Must implement UserDetails which is the class provide for UserDetailsService to set
 **/
public class UserPrinciple implements UserDetails {

    private final UserEntity user;
    public UserPrinciple(UserEntity user) {
        this.user = user;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return Collections.singleton(new SimpleGrantedAuthority("USER"));
    }

    @Override
    public String getPassword() {
        return user.getPassword();
    }

    @Override
    public String getUsername() {
        return user.getUsername();
    }

}
