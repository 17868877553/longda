package com.dubbo.demo.model.entity;

import java.io.Serializable;

/**
 * @author guoyalong
 * @date2020/1/17 9:52
 */
public class TestModel implements Serializable {
    private String name;

    private Integer age;

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
