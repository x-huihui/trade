package com.om.blank.trade.mybatis.base;

public interface BaseMapper{

    default BaseExample getExample(){
        return new BaseExample();
    }
}
