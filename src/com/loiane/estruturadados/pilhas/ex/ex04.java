package com.loiane.estruturadados.pilhas.ex;

import java.util.Stack;

import com.loiane.estruturadados.pilhas.domain.Livros;

public class ex04 {
    public static void main(String[] args) {
        Stack<Livros> pilhaLivros = new Stack<>();
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
            pilhaLivros.push(livros);
        }

        System.out.println(pilhaLivros);

        for (int i = 0; i < pilhaLivros.size(); pilhaLivros.isEmpty()) {
            System.out.println("removendo elementos da pilha elemento: "+pilhaLivros.size());
            pilhaLivros.pop();
        }
        System.out.println("programa finalizado: "+pilhaLivros);
    }
}
