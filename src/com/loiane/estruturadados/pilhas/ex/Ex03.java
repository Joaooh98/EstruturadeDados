package com.loiane.estruturadados.pilhas.ex;

import com.loiane.estruturadados.pilhas.Pilha;
import com.loiane.estruturadados.pilhas.domain.Livros;

public class Ex03 {
    public static void main(String[] args) {
        Pilha<Livros> pilhaLivros = new Pilha<>(5);
        int anoLancamento = 1998;
        String isbn = "WAR";
        String autor = "Rebert Martin";
        String nome = "codigo Limpo";

        for (int i = 0; i < 5; i++) {

            Livros livros = new Livros();
            livros.setAnoLancamento(anoLancamento + i);
            livros.setIsbn("B00"+i+isbn + i);
            String ia = String.valueOf(i);
            ia = " Versao :";
            livros.setAutor(autor);
            livros.setNome(nome.concat(ia)+i);
            pilhaLivros.empilha(livros);
        }

        System.out.println(pilhaLivros);

        for (int i = 0; i < pilhaLivros.tamanho(); pilhaLivros.estaVazio()) {
            System.out.println("removendo elementos da pilha elemento: "+pilhaLivros.tamanho());
            pilhaLivros.desempilha();
        }
        System.out.println("programa finalizado: "+pilhaLivros);
    }

}
