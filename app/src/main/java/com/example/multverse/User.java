package com.example.multverse;

import com.google.firebase.database.DatabaseReference;

public class User {
    public String id, login, password, number;
    private DatabaseReference DB;

    public User(String id, String login, String password, String number) {
        this.id = id;
        this.login = login;
        this.password = password;
        this.number = number;
    }

    public  User(){

    }
}
