package com.userCenter.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserCenterService {

    @Autowired
    private UserCenterService userCenterService;

    public String getUserList() {
    return userCenterService.getUserList();
    }
}
