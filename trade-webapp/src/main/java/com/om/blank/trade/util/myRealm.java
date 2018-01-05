package com.om.blank.trade.util;

import org.apache.shiro.authc.*;
import org.apache.shiro.realm.AuthenticatingRealm;
import org.apache.shiro.realm.Realm;
import org.apache.shiro.subject.PrincipalCollection;

public class myRealm extends AuthenticatingRealm {

    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        UsernamePasswordToken usernamePasswordToken = (UsernamePasswordToken) authenticationToken;
        SimpleAuthenticationInfo simpleAccount = new SimpleAuthenticationInfo(usernamePasswordToken.getUsername(), usernamePasswordToken.getUsername(), "用户名密码相同");
        return simpleAccount;
    }
}