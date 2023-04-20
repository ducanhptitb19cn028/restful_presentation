package com.example.orderRestfulServer.models;

import javax.persistence.Column;

public class fake {

    private Integer number;

    private String product_id;

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getProduct_id() {
        return product_id;
    }

    public void setProduct_id(String product_id) {
        this.product_id = product_id;
    }

    public fake() {

    }
}
