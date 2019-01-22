/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;

/**
 *
 * @author mwang
 */
public class User implements Serializable{

    private int id;
    private String email;
    private int user_type;
    private String password;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getUser_type() {
        return user_type;
    }

    public void setUser_type(int user_type) {
        this.user_type = user_type;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public User(int id, String name,String email, int user_type, String password) {
        this.id = id;
        this.name=name;
        this.email = email;
        this.user_type = user_type;
        this.password = password;
    }

    public User(String email,String name, int user_type, String password) {
        this.email = email;
        this.name=name;
        this.user_type = user_type;
        this.password = password;
    }

    public User() {
    }

}
