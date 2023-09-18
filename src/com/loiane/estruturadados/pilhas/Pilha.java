package com.loiane.estruturadados.pilhas;

import com.loiane.estruturadados.base.EstruturaStatica;

public class Pilha<T> extends EstruturaStatica<T>{
    public Pilha(){
        super();
    }

    public Pilha(int capacidade){
        super(capacidade);
    }

    public void empilha(T elemento){
        super.Add(elemento);
    }
    public T topo(){
        if (this.estaVazio()) {
            return null;
        }

        return this.elementos[tamanho-1];
    }

    public T desempilha(){
        if (this.estaVazio()) {
            return null;
        }
        return this.elementos[--tamanho];
    }
}
