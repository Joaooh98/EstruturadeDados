package com.loiane.estruturadados.vetor.Vetor.Exercicio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.loiane.estruturadados.vetor.domain.Contato;

public class ex07 extends ex06 {
    // utilize a classe ArrayList e desenvolva os seguintes items:

    // 1. crie uma lista

    // 2. passe todos os contatos do vetor para o arrayList

    // 3. crie um exemplo para utilizar cada metodo da classe ArrayList(somente os
    // metodos que implementamos de forma similar a clase lista )

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        ArrayList<Contato> arrayList = new ArrayList<>();
        criarContatosDinamicamente(5, arrayList);
        int opcao = 1;

        System.out.println(arrayList);
        while (opcao != 0) {
            opcao = obterOpcaoMenu(teclado);
            switch (opcao) {
                case 1:
                    adicionarContato(teclado, arrayList);
                    break;
                case 2:
                    adicionarContatoPosicao(teclado, arrayList);
                    break;
                case 3:
                    obtemContatoPosicao(teclado, arrayList);
                    break;
                case 4:
                    obtemContato(teclado, arrayList);
                    break;
                case 5:
                    obtemUltimoContato(teclado, arrayList);
                    break;
                case 6:
                    contatoExiste(teclado, arrayList);
                    break;
                case 7:
                    removeContatoPosicao(teclado, arrayList);
                    break;
                case 8:
                    removeContato(teclado, arrayList);
                    break;
                case 9:
                    imprimeTamanhoVetor(arrayList);
                    break;
                case 10:
                    limparVetor(arrayList);
                    break;
                case 11:
                    imprimir(arrayList);
                    break;

                default:
                    break;
            }
        }
        System.out.println("progama encerrado");

    }

    private static void adicionarContato(Scanner teclado, List<Contato> lista) { // primeira opcao
        System.out.println("criado um contato, entre com as informacoes: ");
        String nome = leInformacao("informe seu nome: ", teclado);
        String telefone = leInformacao("informe numero de telefone: ", teclado);
        String email = leInformacao("informe o seu e-mail: ", teclado);

        var contato = new Contato(nome, telefone, email);

        lista.add(contato);

        System.out.println("contato adicionado com sucesso ");
        System.out.println(contato);

    }

    private static void adicionarContatoPosicao(Scanner teclado, List<Contato> lista) { // segunda opcao
        System.out.println("criado um contato, entre com as informacoes: ");
        String nome = leInformacao("informe seu nome: ", teclado);
        String telefone = leInformacao("informe numero de telefone: ", teclado);
        String email = leInformacao("informe o seu e-mail: ", teclado);

        var contato = new Contato(nome, telefone, email);

        int pos = leInformacaoInt("Informe a posicao que deve ser adicionado o contato ", teclado);

        try {

            lista.add(pos, contato);
            System.out.println("contato adiconado com sucesso :)");
            System.out.println(contato);
        } catch (Exception e) {
            System.out.println("nao foi posivel adiconar o contato");
        }

        System.out.println("contato adicionado com sucesso ");
        System.out.println(contato);

    }

    private static void obtemContatoPosicao(Scanner teclado, List<Contato> lista) {
        int pos = leInformacaoInt("informe o elemento no vetor que deseja buscar o contato", teclado);

        try {
            lista.get(pos);

            System.out.println("segue contato");
            System.out.println(lista);

        } catch (Exception e) {
            System.out.println("posicao invalida");
        }
    }

    private static void obtemContato(Scanner teclado, List<Contato> lista) {
        int pos = leInformacaoInt("informe o elemento no vetor que deseja buscar o contato", teclado);

        try {
            Contato contato = lista.get(pos);

            System.out.println("segue contato");
            System.out.println(lista);

            System.out.println("fazendo pesquisa do ultimo contato encontrado:" + pos);
            pos = lista.indexOf(contato);
            System.out.println("segue contato encontrado na posicao:" + pos);

        } catch (Exception e) {
            System.out.println("posicao invalida");
        }
    }

    private static void obtemUltimoContato(Scanner teclado, List<Contato> lista) {
        int pos = leInformacaoInt("informe o elemento no vetor que deseja buscar o contato", teclado);

        try {
            Contato contato = lista.get(pos);

            System.out.println("segue contato");
            System.out.println(lista);

            System.out.println("fazendo pesquisa do ultimo contato encontrado:" + pos);
            pos = lista.lastIndexOf(contato);

            System.out.println("segue contato encontrado na posicao:" + pos);

        } catch (Exception e) {
            System.out.println("posicao invalida");
        }
    }

    private static void contatoExiste(Scanner teclado, List<Contato> lista) {

        int pos = leInformacaoInt("verificando se o contato existe no vetor ", teclado);

        try {
            Contato contato = lista.get(pos);

            boolean existe = lista.contains(contato);

            if (existe) {
                System.out.println("segue contato");
                System.out.println(contato);
            } else {
                System.out.println("contato nao esta na lista");
            }

        } catch (Exception e) {
            System.out.println("posicao invalida");
        }
    }

    private static void removeContatoPosicao(Scanner teclado, List<Contato> lista) {
        int pos = leInformacaoInt("informe a posicao que deve ser removida: ", teclado);

        try {

            lista.get(pos);

            System.out.println(lista);

            lista.remove(pos);

            System.out.println("contato removido da lista conforme posicao indicada ");
            System.out.println(lista);

        } catch (Exception e) {
            System.out.println("posicao invalida");
        }
    }

    private static void removeContato(Scanner teclado, List<Contato> lista) {
        int pos = leInformacaoInt("informe a posicao que deve ser removida: ", teclado);

        try {

            Contato contato = lista.get(pos);

            lista.remove(contato);

            System.out.println("contato removido");

        } catch (Exception e) {
            System.out.println("posicao invalida");
        }
    }

    private static void imprimeTamanhoVetor(List<Contato> lista) {
        System.out.println(lista.size());
    }

    private static void limparVetor(List<Contato> lista) {
        lista.clear();

        System.out.println("todos os contatos foi excluido");
    }

    private static void imprimir(List<Contato> lista) {
        System.out.println(lista);
    }

    protected static String leInformacao(String msg, Scanner teclado) {
        System.out.println(msg);
        String entrada = teclado.nextLine();
        return entrada;
    }

    protected static int leInformacaoInt(String msg, Scanner teclado) {
        boolean entradaValida = false;
        int num = 0;

        while (!entradaValida) {
            try {

                System.out.println(msg);
                String entrada = teclado.nextLine();

                num = Integer.parseInt(entrada);

                entradaValida = true;

            } catch (Exception e) {
                System.out.println("entrada invalida, digite novamente ");
            }

        }
        return num;
    }

    protected static int obterOpcaoMenu(Scanner teclado) {

        boolean entradaValida = false;
        int opcao = 0;
        String entrada;

        while (!entradaValida) {

            System.out.println("Digite a opcao desejada");
            System.out.println("1. Adicionar contato ao final do vetor?");
            System.out.println("2. Adicionar contato em uma posicao especifica?");
            System.out.println("3. Obtem contato em uma posicao especifica?");
            System.out.println("4. Consultar contato?");
            System.out.println("5. Consultar ultimo contato cadastradao?");
            System.out.println("6. verificar se existe?");
            System.out.println("7. Remover por posicao?");
            System.out.println("8. Excluir contato?");
            System.out.println("9. verificar tamanho do vetor ?");
            System.out.println("10. excluir todos os contatos ?");
            System.out.println("11. imprime vetor?");
            System.out.println("0. Sair?");

            try {

                entrada = teclado.nextLine();
                opcao = Integer.parseInt(entrada);

                if (opcao >= 0 && opcao <= 11) {
                    entradaValida = true;
                } else {
                    throw new Exception();
                }
            } catch (Exception e) {
                System.out.println("entrada invalida corrigi os campos\n");
            }
        }
        return opcao;
    }

    protected static void criarContatosDinamicamente(int quantidade, List<Contato> lista) {
        Contato contato;

        for (int i = 1; i <= quantidade; i++) {

            contato = new Contato();
            contato.setName("Contato " + i);
            contato.setEmail("new" + i + "@gmail.com");
            contato.setTelefone("(45) 3657-" + i);

            lista.add(contato);
        }
    }
}
