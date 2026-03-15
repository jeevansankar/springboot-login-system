package com.jeevan.login.service;



import com.jeevan.login.entity.LoginEntity;

public interface LoginServiceInterface {
    public void registeruser(LoginEntity  user);
    public void loginuser(String username, String password);
    

}
