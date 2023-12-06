package com.pld.service;

import com.pld.dto.UserLoginDTO;
import com.pld.entity.User;

public interface UserService {

    /**
     * 微信登录
     * @param userLoginDTO
     * @return
     */
    User wxLogin(UserLoginDTO userLoginDTO);
}