package com.om.blank.trade.controller;


/**
 * Created by KeKe on 2017/11/26.
 */

import com.om.blank.trade.service.PublicService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/public/")
public class PublicController {


    @Autowired
    private PublicService publicService;

    private static Logger LOGGER = LoggerFactory.getLogger(PublicController.class);

    @PostMapping("/user/login")
    @ResponseBody
    public String helloc(@RequestParam("account") String account, @RequestParam("password") String password) {
        publicService.login(account, password);
        LOGGER.info("当前登录用户:"+account);
        return "hello c";
    }
}
