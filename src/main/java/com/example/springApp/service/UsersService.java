package com.example.springApp.service;

import com.example.springApp.model.UsersModel;
import com.example.springApp.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsersService {

    @Autowired
    private final UsersRepository usersRepository;

    public UsersService(UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }

    //METHOD TO REGISTER USERS
    public UsersModel registerUser(String login, String password){
        //login and password as mandatory
        if(login == null && password == null){
            return null;
        }else{
            UsersModel usersModel = new UsersModel();
            usersModel.setLogin(login);
            usersModel.setPassword(password);
            return usersRepository.save(usersModel);
        }
    }

    //METHOD TO AUTHENTICATE USER
    public UsersModel authenticate(String login, String password){
        return usersRepository.finByLogiinAndPassword(login, password).orElse(null);
    }
}
