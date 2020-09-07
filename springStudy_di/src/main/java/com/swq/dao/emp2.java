package com.swq.dao;

public class emp2 {
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
    //这里要写上dept的get方法


    public com.swq.dao.dept getDept() {
        return dept;
    }

    @Override
    public String toString() {
        return "emp2{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", dept=" + dept +
                '}';
    }
}
