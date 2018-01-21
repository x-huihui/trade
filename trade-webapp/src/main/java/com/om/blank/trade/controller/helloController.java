package com.om.blank.trade.controller;


/**
 * Created by KeKe on 2017/11/26.
 */

import com.om.blank.trade.mybatis.mapper.UserMapper;
import com.om.blank.trade.mybatis.model.UserExample;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/hello/")
public class helloController {

    @Autowired
    private UserMapper u;

    private static Logger LOGGER = LoggerFactory.getLogger(helloController.class);

    @GetMapping("/c")
    @ResponseBody
    public String helloc(@RequestParam("account") String account, @RequestParam("password") String password) {
        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken usernamePasswordToken = new UsernamePasswordToken();
        usernamePasswordToken.setUsername(account);
        usernamePasswordToken.setPassword(password.toCharArray());
        subject.login(usernamePasswordToken);
        LOGGER.info("hello c");
        return "hello c";
    }
}
