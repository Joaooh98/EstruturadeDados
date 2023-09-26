package com.loiane.estruturadados.filas.domain;

import com.loiane.estruturadados.base.EstruturaStatica;

public class Fila<T> extends EstruturaStatica<T> {

    public Fila() {
        super();
    }

    public Fila(int capacidade) {
        super(capacidade);
    }

    public void enfileira(T elemento) {
        this.Add(elemento);
    }

    public T espiar(){
        return this.elementos[0];
    }

    public T desenfileirar(){

        final int POS = 0;

        if (this.estaVazio()) {
            return null;
        }

        T elementoASerRemovido = this.elementos[POS];
        this.removeElement(POS);

        return elementoASerRemovido;
    }

}
