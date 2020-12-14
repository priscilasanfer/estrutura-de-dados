package com.priscilasanfer.estruturadados.vetor.labs;

import com.priscilasanfer.estruturadados.vetor.Lista;
import com.priscilasanfer.estruturadados.vetor.teste.Contato;

import java.util.List;
import java.util.Scanner;

public class Exer06 {
    public static void main(String[] args) {
        // Criacao das variaveis
        Scanner scan = new Scanner(System.in);

        // Criar vetor com 20 posicoes
        Lista<Contato> lista = new Lista<Contato>(20);

        // Criar e adicionar mais elementos
        criarContatosDinamicamente(5, lista);

        // Cria menu para usuario escolher
        int opcao = 1;
        while (opcao != 0) {
            opcao = obterOpcaoMenu(scan);
            switch (opcao) {
                case 1:
                    adicionarContatoNoFinal(scan, lista);
                    break;
                case 2:
                    adicionarContatoPosicao(scan, lista);
                    break;
                case 3:
                    obtemContatoPosicao(scan, lista);
                    break;
                case 4:
                    obtemContato(scan, lista);
                    break;
                case 5:
                    pesquisarUltimoIndice(scan, lista);
                    break;
                case 6:
                    pesquisarContatoExiste(scan, lista);
                    break;
                case 7:
                    excluirPorPosição(scan, lista);
                    break;
                case 8:
                    excluirContato(scan, lista);
                    break;
                case 9:
                    imprimeTamnhoVetor(lista);
                    break;
                case 10:
                    limparVetor(lista);
                    break;
                case 11:
                    imprimirVetor(lista);
                    break;
                default:
                    break;
            }
        }
        System.out.println("Usuario digitou 0, programa terminado");
    }

    private static void imprimirVetor(Lista<Contato> lista){
        System.out.println(lista);
    }

    private static void imprimeTamnhoVetor(Lista<Contato> lista){
        System.out.println("Tamanho do vetor é de: " + lista.tamanho());
    }

    private static void limparVetor(Lista<Contato> lista){
        lista.limpar();
        System.out.println("Todos os contatos foram excluidos");
    }

    private static void pesquisarUltimoIndice(Scanner scan, Lista<Contato> lista) {
        System.out.println("Obtend do ultimo contato do indice, entre com os dados:");

        int pos = leInformacaoInt("Entre com a posição", scan);

        try {
            Contato contato = lista.busca(pos);
            System.out.println("Contato existe, segue dados:");
            System.out.println(contato);

            System.out.println("Fazendo pesquisa do do ultimo contato do indice encontrado:");
            pos = lista.ultimoIndice(contato);

            System.out.println("Contato encontrado na posição: " + pos);
        } catch (Exception e) {
            System.out.println("Posicao invalida!");
        }
    }

    private static void pesquisarContatoExiste(Scanner scan, Lista<Contato> lista) {
        System.out.println("Verificando se contato existe, entre com os dados:");

        int pos = leInformacaoInt("Entre com a posição", scan);

        try {
            Contato contato = lista.busca(pos);

            boolean existe = lista.contem(contato);

            if (existe) {
                System.out.println("Contato existe, segue dados:");
                System.out.println(contato);
            } else {
                System.out.println("Contato nao existe");
            }
        } catch (Exception e) {
            System.out.println("Posicao invalida!");
        }
    }

    private static void excluirPorPosição(Scanner scan, Lista<Contato> lista) {
        int pos = leInformacaoInt("Entre com a posição a ser removida", scan);

        try {
            lista.remove(pos);
            System.out.println("Contato excluido");
        } catch (Exception e) {
            System.out.println("Posicao invalida!");
        }
    }

    private static void excluirContato(Scanner scan, Lista<Contato> lista) {
        int pos = leInformacaoInt("Entre com a posição a ser removida", scan);

        try {
            Contato contato = lista.busca(pos);
            lista.remove(contato);
            System.out.println("Contato excluido");
        } catch (Exception e) {
            System.out.println("Posicao invalida!");
        }
    }

    private static void obtemContato(Scanner scan, Lista<Contato> lista) {
        System.out.println("Obtendo conato por posição, entre com os dados:");

        int pos = leInformacaoInt("Entre com a posição", scan);

        try {
            Contato contato = lista.busca(pos);
            System.out.println("Contato existe, segue dados:");
            System.out.println(contato);
            System.out.println("Fazendo pesquisa  do contato encontrado:");
            pos = lista.busca(contato);
            System.out.println("Contato encontrado na posição: " + pos);
        } catch (Exception e) {
            System.out.println("Posicao invalida!");
        }
    }

    private static void obtemContatoPosicao(Scanner scan, Lista<Contato> lista) {
        System.out.println("Obtendo conato por posição, entre com os dados:");
        int pos = leInformacaoInt("Entre com a posição a ser pesquisada", scan);

        try {
            Contato contato = lista.busca(pos);
            System.out.println("Contato existe, segue dados:");
            System.out.println(contato);
        } catch (Exception e) {
            System.out.println("Posicao invalida!");
        }
    }

    private static void adicionarContatoNoFinal(Scanner scanner, Lista<Contato> lista) {
        System.out.println("Criando contato, entre com os dados");
        String nome = leInformacao("Entre com o nome", scanner);
        String telefpne = leInformacao("Entre com o telefone", scanner);
        String email = leInformacao("Entre com o email", scanner);
        Contato contato = new Contato(nome, telefpne, email);
        lista.adiciona(contato);
        System.out.println("Contato adicionado com sucesso");
        System.out.println(contato);
    }

    private static void adicionarContatoPosicao(Scanner scanner, Lista<Contato> lista) {
        System.out.println("Criando contato, entre com os dados");
        String nome = leInformacao("Entre com o nome", scanner);
        String telefpne = leInformacao("Entre com o telefone", scanner);
        String email = leInformacao("Entre com o email", scanner);

        Contato contato = new Contato(nome, telefpne, email);

        int posicao = leInformacaoInt("Entre a posicao desejada", scanner);
        try {
            lista.adiciona(posicao, contato);
            System.out.println("Contato adicionado com sucesso");
            System.out.println(contato);
        } catch (Exception e) {
            System.out.println("Posicao invalida, contato nao adicionado");
        }
    }

    private static String leInformacao(String msg, Scanner scanner) {
        System.out.println(msg);
        return scanner.nextLine();
    }

    private static int leInformacaoInt(String msg, Scanner scanner) {
        boolean entradaValida = false;
        int num = 0;
        while (!entradaValida) {
            try {
                System.out.println(msg);
                String entrada = scanner.nextLine();
                num = Integer.parseInt(entrada);
                entradaValida = true;
            } catch (Exception e) {
                System.out.println("Entrada Invalida, digite novamente");
            }
        }
        return num;
    }

    private static void criarContatosDinamicamente(int quantidade, Lista<Contato> lista) {
        Contato contato;

        for (int i = 0; i < quantidade; i++) {
            contato = new Contato();
            contato.setNome("Contato " + i);
            contato.setEmail("contato" + i + "@teste.com");
            contato.setTelefone("1111" + i);
            lista.adiciona(contato);
        }
    }

    private static int obterOpcaoMenu(Scanner scanner) {

        boolean entradaValida = false;
        int opcao = 0;
        String entrada;
        while (!entradaValida) {
            System.out.println("Digite a opção desejada");
            System.out.println("1: Adiciona contato no final do vetor");
            System.out.println("2: Adiciona contato em uma posição especifica");
            System.out.println("3: Obtem contato de uma posicao espefica");
            System.out.println("4: Consulta contato ");
            System.out.println("5: Consulta ultimo indice do contato ");
            System.out.println("6: Verifica se contato existe");
            System.out.println("7: Remove por posicao");
            System.out.println("8: Excluir contato");
            System.out.println("9: Verifica Tamanho vetor");
            System.out.println("10: Excluir todos os contatos do vetor");
            System.out.println("11: Imprime vetor");
            System.out.println("0: Sair");

            try {
                entrada = scanner.nextLine();
                opcao = Integer.parseInt(entrada);
                if (opcao >= 0 && opcao <= 11) {
                    entradaValida = true;
                } else {
                    throw new Exception();
                }
            } catch (Exception e) {
                System.out.println("Entrada invalida, digite novamente\n\n ");
            }
        }
        return opcao;
    }

}
