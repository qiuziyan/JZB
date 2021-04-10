package com.qiujie.jzb.model;

import lombok.Data;

@Data
public class User {
    private String id;

    private String userName;

    private String passWord;

    private Double balance;

    private Double debt;

    private Double stockfund;

    public User(String userName, String passWord) {
        this.userName = userName;
        this.passWord = passWord;
    }
    public User(){}
}