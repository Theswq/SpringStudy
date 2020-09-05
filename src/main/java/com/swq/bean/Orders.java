package com.swq.bean;

public class Orders {

    private String oname;
    private String address;

    /**
     * 使用有参构造注入
     */
    public Orders(String oname, String address) {
        this.oname = oname;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Orders{" +
                "oname='" + oname + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
