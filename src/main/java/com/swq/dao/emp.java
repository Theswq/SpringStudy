package com.swq.dao;

public class emp {
    private  String name;
    private String  gender;
    private dept dept;

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setDept(com.swq.dao.dept dept) {
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "emp{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", dept=" + dept +
                '}';
    }
}
