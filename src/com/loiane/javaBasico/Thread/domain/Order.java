package com.loiane.javaBasico.Thread.domain;

public class Order {

    private Integer id;

    private String status;
    
    private Products products;

    private Payment payment;

    
    public Order(Integer id) {
        this.id = id;
    }

    public Order(Integer id, String status, Products products, Payment payment) {
        this.id = id;
        this.status = status;
        this.products = products;
        this.payment = payment;
    }

    public Payment getPayment() {
        return payment;
    }

    @Override
    public String toString() {
        return "Order [id=" + id + ", status=" + status + ", products=" + products + ", payment=" + payment + "]";
    }

    public void setPayment(Payment idPayment) {
        this.payment = idPayment;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Products getProducts() {
        return products;
    }

    public void setProducts(Products idProducts) {
        this.products = idProducts;
    }
}
