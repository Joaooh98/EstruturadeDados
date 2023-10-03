package com.loiane.estruturadados.lista;

public class ListaEncadeada<T> {

    private No<T> inicio;
    private No<T> ultimo;
    private Integer tamanho = 0;

    public void adiciona(T elemento) {
        No<T> celula = new No<T>(elemento);
        if (this.tamanho == 0) {
            this.inicio = celula;
        } else{
            this.ultimo.setProximo(celula);
        }
        this.ultimo = celula;
        this.tamanho ++;
    }

    @Override
    public String toString() {
        return "ListaEncadeada [inicio=" + inicio + "]";
    }

    public Integer getTamanho() {
        return tamanho;
    }

}
