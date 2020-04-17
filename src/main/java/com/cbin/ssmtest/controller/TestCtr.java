package com.cbin.ssmtest.controller;


import com.alibaba.fastjson.JSONObject;
import com.cbin.ssmtest.model.TestModel;
import com.cbin.ssmtest.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TestCtr {
    @Autowired
    private TestService testService;

    @GetMapping("/test")
    public JSONObject test(){
        JSONObject jsonObject = new JSONObject();
        TestModel model=new TestModel();
        model.setSyscreatedate("第三个数据");
        model.setTestmainUuid("第二个数据");
        model.setOperation("第一个数据");
        testService.ceshi(model);
        jsonObject.put("title", "测试成功" + model.getLogUuid());
        return jsonObject;
    }


}
