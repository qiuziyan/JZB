package com.qiujie.jzb.model;

import lombok.Data;

@Data
public class User {
    private Integer id;

    private String userName;

    private String passWord;

    private Double balance;

    private Integer debt;

    private Double stockfund;
}