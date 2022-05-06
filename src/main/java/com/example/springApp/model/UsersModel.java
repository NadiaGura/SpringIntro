package com.example.springApp.model;

import javax.persistence.*;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.util.Objects;

@Table(name = "users") //name of the table in the DB

@Entity
public class UsersModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    Integer id;
    String login;
    String password;

    //getters and setters

    public void setId(Integer id) {
        this.id = id;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public Integer getId() {
        return id;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }


//equals and hashcode
@Override
public int hashCode() {
    return Objects.hash(id, login, password);
}
@Override
public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    UsersModel that = (UsersModel) o;
    return Objects.equals(id, that.id) && Objects.equals(login, that.login) && Objects.equals(password, that.password);
}
//toString excluding password as it is sensitive info
@Override
public String toString() {
    return "UsersModel{" +
            "id=" + id +
            ", login='" + login + '\'' +
            '}';
}

}
