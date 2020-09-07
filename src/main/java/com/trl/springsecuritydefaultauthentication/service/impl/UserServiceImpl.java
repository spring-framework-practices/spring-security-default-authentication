package com.trl.springsecuritydefaultauthentication.service.impl;

import com.trl.springsecuritydefaultauthentication.controller.dto.UserDTO;
import com.trl.springsecuritydefaultauthentication.service.UserService;

import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Override
    public UserDTO getUser(Long id) {
        return null;
    }
}
