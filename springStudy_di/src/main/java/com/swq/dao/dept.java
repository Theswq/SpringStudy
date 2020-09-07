package com.swq.dao;

public class dept {
    private String dname;

    public void setDname(String dname) {
        this.dname = dname;
    }

    @Override
    public String toString() {
        return "dept{" +
                "dname='" + dname + '\'' +
                '}';
    }
}
