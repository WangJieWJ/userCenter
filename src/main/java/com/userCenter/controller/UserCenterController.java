package com.userCenter.controller;

import com.userCenter.dao.UserCenterDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Title:
 * Description:
 * Project: userCenter
 * Create Time:2017/10/29 16:09
 */
@RestController
public class UserCenterController {

    @Autowired
    private UserCenterDao userCenterDao;


    @RequestMapping(value = "/getData", method = RequestMethod.GET)
    public String getData() {

        return userCenterDao.getUserList();
    }
}
