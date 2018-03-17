package com.om.blank.trade.service;

import com.om.blank.trade.mybatis.mapper.UserMapper;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PublicService {

    public void login(String account, String password){
        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken usernamePasswordToken = new UsernamePasswordToken();
        usernamePasswordToken.setUsername(account);
        usernamePasswordToken.setPassword(password.toCharArray());
        subject.login(usernamePasswordToken);
    }
}
