package com.qiujie.jzb.model;

import lombok.Data;

@Data
public class InconmeExpenses {
    private String id;

    private String userId;

    private Double amount;

    private String type;

    private String date;

    private String remark;

    private String iEFlag;
}