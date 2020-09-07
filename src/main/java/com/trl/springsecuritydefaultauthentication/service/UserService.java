package com.trl.springsecuritydefaultauthentication.service;

import com.trl.springsecuritydefaultauthentication.controller.dto.UserDTO;

public interface UserService {

    UserDTO getUser(Long id);
}
