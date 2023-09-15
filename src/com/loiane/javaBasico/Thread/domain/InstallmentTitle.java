package com.loiane.javaBasico.Thread.domain;

public class InstallmentTitle {

    private Integer id;

    public InstallmentTitle(Integer id) {
        this.id = id;
    }
    
    @Override
    public String toString() {
        return "InstallmentTitle [id=" + id + "]";
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    
}
