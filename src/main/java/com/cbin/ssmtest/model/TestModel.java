package com.cbin.ssmtest.model;

import lombok.Data;

import java.io.Serializable;

@Data
public class TestModel implements Serializable {

    private Long logUuid;

    private String testmainUuid;

    private String operation;

    private String syscreatedate;
}