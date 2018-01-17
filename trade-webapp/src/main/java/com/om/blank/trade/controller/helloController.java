package com.om.blank.trade.controller;

import com.om.blank.trade.mapper.userMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by KeKe on 2017/11/26.
 */
@Controller
@RequestMapping("/hello/")
public class helloController {

    @Autowired
    private userMapper u;

    @GetMapping("/c")
    @ResponseBody
    public String helloc(Model model) {

        Logger logger = LoggerFactory.getLogger(helloController.class);
        logger.info(u.selectByPrimaryKey(1L).toString());
        return "hello c";
    }
}
