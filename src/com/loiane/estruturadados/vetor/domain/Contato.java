package com.loiane.estruturadados.vetor.domain;

public class Contato {

    private String name;

    private String telefone;

    private String email;

    public Contato(String name, String telefone, String email) {
        this.name = name;
        this.telefone = telefone;
        this.email = email;
    }

    public Contato() {
    }

    @Override
    public String toString() {
        return "Contato [name= " + name + ", telefone= " + telefone + ", email= " + email + "]";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
