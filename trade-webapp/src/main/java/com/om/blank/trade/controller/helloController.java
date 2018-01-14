package com.om.blank.trade.controller;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by KeKe on 2017/11/26.
 */
@Controller
@RequestMapping("/hello")
public class helloController {
    @GetMapping("/c")
    @ResponseBody
    public String hello(Model model) {
        Logger logger = LoggerFactory.getLogger(helloController.class);
        logger.info("hello world");
        UsernamePasswordToken usernamePasswordToken = new UsernamePasswordToken("xiaoming", "xiaoming");
        usernamePasswordToken.getPrincipal();
        usernamePasswordToken.getCredentials();
        Subject subject = SecurityUtils.getSubject();
        subject.login(usernamePasswordToken);
        return "hello c";
    }
}
