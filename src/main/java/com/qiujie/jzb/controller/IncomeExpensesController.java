package com.qiujie.jzb.controller;

import com.qiujie.jzb.model.InconmeExpenses;
import com.qiujie.jzb.model.Response;
import com.qiujie.jzb.service.impl.IncomeExpensesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/incomeExpenses")
public class IncomeExpensesController {
    @Autowired
    IncomeExpensesService incomeExpensesService;
    @RequestMapping("/uploadIncomeOrExpenses")
    public Response uploadIncomeOrExpenses(@RequestBody InconmeExpenses incomeExpense){
        Response rsp;
        incomeExpense.setId(UUID.randomUUID().toString());
        incomeExpensesService.insert(incomeExpense);
        rsp = new Response("0", "上传成功");
        return rsp;
    }
}
