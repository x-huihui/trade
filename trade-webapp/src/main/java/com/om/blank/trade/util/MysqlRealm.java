package com.om.blank.trade.util;

import org.apache.shiro.authc.*;
import org.apache.shiro.realm.AuthenticatingRealm;

public class MysqlRealm extends AuthenticatingRealm {

    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        UsernamePasswordToken usernamePasswordToken = (UsernamePasswordToken) authenticationToken;
        SimpleAuthenticationInfo simpleAccount = new SimpleAuthenticationInfo(usernamePasswordToken.getUsername(), usernamePasswordToken.getUsername(), "用户名密码相同");
        return simpleAccount;
    }
}
