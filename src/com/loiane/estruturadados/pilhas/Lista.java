package com.loiane.estruturadados.pilhas;

import com.loiane.estruturadados.base.EstruturaStatica;

public class Lista<T> extends EstruturaStatica<T> {

    public Lista() {
        super();
    }

    public Lista(int capacidade) {
        super(capacidade);
    }

    public boolean Add(T elemento) {
        return super.Add(elemento);

    }

    public boolean Add(int posicao, T elemento) {
        return super.Add(posicao, elemento);

    } 

}
