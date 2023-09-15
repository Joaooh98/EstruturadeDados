package com.loiane.javaBasico.Thread.domain;

public class Products {
    private Integer id;

    private String name;

    private String statusReserve;

    public Products(Integer id, String name, String statusReserve) {
        this.id = id;
        this.name = name;
        this.statusReserve = statusReserve;
    }

    @Override
    public String toString() {
        return "Products [id=" + id + ", name=" + name + ", statusReserve=" + statusReserve + "]";
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    
    public String getStatusReserve() {
        return statusReserve;
    }

    public void setStatusReserve(String statusReserve) {
        this.statusReserve = statusReserve;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}
