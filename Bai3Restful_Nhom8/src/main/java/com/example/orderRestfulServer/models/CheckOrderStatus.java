package com.example.orderRestfulServer.models;

import lombok.Data;

import javax.persistence.*;

@Table(name = "check_status")
@Entity
@Data
public class CheckOrderStatus {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "rm_number")
    private Integer rm_number;

    @Column(name = "product_id")
    private String product_id;

    @Column(name = "name")
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Integer getRm_number() {
        return rm_number;
    }

    public void setRm_number(Integer rm_number) {
        this.rm_number = rm_number;
    }

    public String getProduct_id() {
        return product_id;
    }

    public void setProduct_id(String product_id) {
        this.product_id = product_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
