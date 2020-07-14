package com.CYF.ch05.mm;

import com.CYF.pojo.UserCustom;

import java.util.List;

public interface UserItemsMapper {

    //查询用户及用户购买商品信息
    public List<UserCustom> find();

}
