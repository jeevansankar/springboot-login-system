package com.jeevan.login.service;

import org.springframework.stereotype.Service;

import com.jeevan.login.entity.LoginEntity;
import com.jeevan.login.repository.RepositoryInterface;
@Service
public class LoginServiceImpl implements LoginServiceInterface {

    private RepositoryInterface repositoryInterface;
    LoginServiceImpl(RepositoryInterface repositoryInterface) {
        this.repositoryInterface = repositoryInterface;
    }

    @Override
    public void registeruser(LoginEntity user) {

        repositoryInterface.save(user);
        


        
    }

    @Override
    public void loginuser(String username, String password) {
        repositoryInterface.findAll();
      
    }

}
