package com.cbin.ssmtest.service.impl;

import com.cbin.ssmtest.mapper.TestMapper;
import com.cbin.ssmtest.model.TestModel;
import com.cbin.ssmtest.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class TestServiceImpl implements TestService {

    @Autowired
    private TestMapper testMapper;

    @Override
    public Long ceshi(TestModel testModel) {
        return testMapper.insert(testModel);
    }
}
