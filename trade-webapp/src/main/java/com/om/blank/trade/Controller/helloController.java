package com.om.blank.trade.Controller;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by KeKe on 2017/11/26.
 */
public class helloController {
    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger(helloController.class);
        logger.info("hello world");
    }
    public static void hello(String userName, String password) {
        Logger logger = LoggerFactory.getLogger(helloController.class);
        logger.info("hello world");
        UsernamePasswordToken usernamePasswordToken = new UsernamePasswordToken(userName, password);
        usernamePasswordToken.getPrincipal();
        usernamePasswordToken.getCredentials();
        Subject subject = SecurityUtils.getSubject();
        subject.login(usernamePasswordToken);
    }
}
