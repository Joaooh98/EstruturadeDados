package com.loiane.estruturadados.vetor.domain;

public class Vetor {
    private String[] elementos;
    private int tamanho;

    public Vetor(int capacidade) {
        this.elementos = new String[capacidade];
        this.tamanho = 0;

    }

    public boolean toAdd(String elemento) {
        capacityIncrease();
        if (this.tamanho < this.elementos.length) {
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;

            System.out.println(elemento);

            return true;
        }
        System.out.println("vetor ja esta cheio");
        return false;
    }

    public boolean toAdd(int posicao, String elemento) {

        if (!(posicao >= 0 && posicao < tamanho)) {
            throw new IllegalArgumentException("posicao invalida");
        }

        capacityIncrease();

        for (int i = this.tamanho - 1; i >= posicao; i--) {
            this.elementos[i + 1] = this.elementos[i];
        }
        this.elementos[posicao] = elemento;
        this.tamanho++;

        return true;
    }

    private void capacityIncrease() {
        if (this.tamanho == this.elementos.length) {
            String[] elementosNovos = new String[this.elementos.length * 2];
            for (int i = 0; i < this.elementos.length; i++) {
                elementosNovos[i] = this.elementos[i];
            }
            this.elementos = elementosNovos;
        }
    }

    // public void adicionar(String elemento) {
    // for (int i = 0; i < elementos.length; i++) {
    // if (this.elementos[i] == null) {
    // this.elementos[i] = elemento;
    // System.out.println(elemento);
    // break;
    // }
    // }
    // }

    // public void to_add(String elemento) throws Exception{
    // if (this.tamanho < this.elementos.length){
    // this.elementos[this.tamanho]= elemento;
    // this.tamanho++;
    // System.out.println(elemento);
    // }else{
    // throw new Exception("Vetor ja esta cheio, nao e possivel adicionar mais
    // elementos");
    // }

    public String busca(int posicao) {
        if (!(posicao >= 0 && posicao < tamanho)) {
            throw new IllegalArgumentException("posição invalida");
        }
        return this.elementos[posicao];
    }

    public int busca(String elemento) {
        for (int i = 0; i < this.tamanho; i++) {
            if (this.elementos[i].equals(elemento)) {
                return i;
            }
        }
        return -1;
    }

    // B G D E F -> POSICAO A SER REMOVIDA E 1 (G)
    // 0 1 2 3 4 -> TAMANHO e 5 ou elementos[5]
    public void removeElement(int posicao) {
        if (!(posicao >= 0 && posicao < tamanho)) {
            throw new IllegalArgumentException("posição invalida");
        }
        for (int i = posicao; i < this.tamanho-1; i++) {
            this.elementos[i] =  this.elementos[i+1];
        }
        this.tamanho--;
    }

    public int tamanho() {
        return this.tamanho;

    }

    @Override
    public String toString() {

        StringBuilder s = new StringBuilder();
        s.append("[");

        for (int i = 0; i < tamanho - 1; i++) {
            s.append(this.elementos[i]);
            s.append(", ");
        }
        if (this.tamanho > 0) {
            s.append(this.elementos[this.tamanho - 1]);
        }
        s.append("]");

        return s.toString();
    }

}
