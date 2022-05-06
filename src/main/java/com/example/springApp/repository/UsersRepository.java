package com.example.springApp.repository;

import com.example.springApp.model.UsersModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UsersRepository extends JpaRepository<UsersModel, Integer> { //specify entity and primary key

    Optional<UsersModel> finByLogiinAndPassword(String login, String password);

}
