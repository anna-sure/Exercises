package com.selfstudy.dao;

public class UserDaoMysqlImpl implements UserDao{
    @Override
    public void getUser() {
        System.out.println("Mysql獲取用戶數據！");
    }
}
