package com.om.blank.trade.util;

import com.om.blank.trade.mybatis.base.BaseExample;
import com.om.blank.trade.mybatis.base.BaseMapper;
import com.om.blank.trade.mybatis.mapper.UserMapper;
import com.om.blank.trade.mybatis.model.User;
import org.apache.shiro.authc.*;
import org.apache.shiro.realm.AuthenticatingRealm;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class MysqlRealm extends AuthenticatingRealm {

    @Autowired
    UserMapper userMapper;

    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        UsernamePasswordToken usernamePasswordToken = (UsernamePasswordToken) authenticationToken;
        BaseExample example = userMapper.getExample();
        example.or().andPropertyEqualTo("account",usernamePasswordToken.getUsername());
        List<User> users = userMapper.selectByExample(example);
        User user;
        if (users != null && users.size() > 0){
            user = users.get(0);
        } else {
            throw new AuthenticationException();
        }
        SimpleAuthenticationInfo simpleAccount = new SimpleAuthenticationInfo(user.getAccount(), user.getPassword(), "MysqlRealm");
        return simpleAccount;
    }
}
