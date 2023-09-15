package com.loiane.javaBasico.Thread.domain;

public class Payment {

    private Integer id;

    private String TypePayment;

    private InstallmentTitle installmentTitle;

    public Payment(Integer id, String typePayment, InstallmentTitle installmentTitle) {
        this.id = id;
        this.TypePayment = typePayment;
        this.installmentTitle = installmentTitle;

    }

    
    @Override
    public String toString() {
        return "Payment [id=" + id + ", TypePayment=" + TypePayment + ", installmentTitle=" + installmentTitle
                + "]";
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTypePayment() {
        return TypePayment;
    }

    public void setTypePayment(String typePayment) {
        TypePayment = typePayment;
    }

    public InstallmentTitle getInstallmentTitle() {
        return installmentTitle;
    }

    public void setInstallmentTitle(InstallmentTitle installmentTitle) {
        this.installmentTitle = installmentTitle;
    }
    
}
