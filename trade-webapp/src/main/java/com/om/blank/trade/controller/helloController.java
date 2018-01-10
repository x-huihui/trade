package com.om.blank.trade.controller;

import com.om.blank.trade.dao.HelloMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by KeKe on 2017/11/26.
 */
public class helloController {
    public static void main(String[] args) {
        try {
            String resource = "mybatis.xml";
            InputStream inputStream = null;
            inputStream = Resources.getResourceAsStream(resource);
            SqlSessionFactory sqlSessionFactory =
                    new SqlSessionFactoryBuilder().build(inputStream);
            SqlSession sqlSession = sqlSessionFactory.openSession();
            HelloMapper mapper = sqlSession.getMapper(HelloMapper.class);
            System.out.print(mapper.hello());
        } catch (IOException e) {
            e.printStackTrace();
        }
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
