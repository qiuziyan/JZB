package com.qiujie.jzb.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.qiujie.jzb.model.Acc;
import com.qiujie.jzb.mapper.AccMapper;
import com.qiujie.jzb.service.impl.AccService;
@Service
public class AccServiceImpl implements AccService{

    @Resource
    private AccMapper accMapper;

    @Override
    public int insert(Acc record) {
        return accMapper.insert(record);
    }

    @Override
    public int insertSelective(Acc record) {
        return accMapper.insertSelective(record);
    }

    @Override
    public Acc findAccByID(String ID) {
        return null;
    }

}
