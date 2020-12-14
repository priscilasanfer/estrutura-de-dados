package com.priscilasanfer.estruturadados.vetor.labs;

import com.priscilasanfer.estruturadados.vetor.teste.Contato;

import java.util.ArrayList;
import java.util.Scanner;

public class Exer07 extends Exer06 {
    public static void main(String[] args) {
        // Criacao das variaveis
        Scanner scan = new Scanner(System.in);

        // Criar vetor com 20 posicoes
        ArrayList<Contato> lista = new ArrayList<Contato>(20);

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

    private static void imprimirVetor(ArrayList<Contato> lista){
        System.out.println(lista);
    }

    private static void imprimeTamnhoVetor(ArrayList<Contato> lista){
        System.out.println("Tamanho do vetor é de: " + lista.size());
    }

    private static void limparVetor(ArrayList<Contato> ArrayList){
        ArrayList.clear();
        System.out.println("Todos os contatos foram excluidos");
    }

    private static void pesquisarUltimoIndice(Scanner scan, ArrayList<Contato> lista) {
        System.out.println("Obtend do ultimo contato do indice, entre com os dados:");

        int pos = leInformacaoInt("Entre com a posição", scan);

        try {
            Contato contato = lista.get(pos);
            System.out.println("Contato existe, segue dados:");
            System.out.println(contato);

            System.out.println("Fazendo pesquisa do do ultimo contato do indice encontrado:");
            pos = lista.lastIndexOf(contato);

            System.out.println("Contato encontrado na posição: " + pos);
        } catch (Exception e) {
            System.out.println("Posicao invalida!");
        }
    }

    private static void pesquisarContatoExiste(Scanner scan, ArrayList<Contato> lista) {
        System.out.println("Verificando se contato existe, entre com os dados:");

        int pos = leInformacaoInt("Entre com a posição", scan);

        try {
            Contato contato = lista.get(pos);

            boolean existe = lista.contains(contato);

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

    private static void excluirPorPosição(Scanner scan, ArrayList<Contato> lista) {
        int pos = leInformacaoInt("Entre com a posição a ser removida", scan);

        try {
            lista.remove(pos);
            System.out.println("Contato excluido");
        } catch (Exception e) {
            System.out.println("Posicao invalida!");
        }
    }

    private static void excluirContato(Scanner scan, ArrayList<Contato> lista) {
        int pos = leInformacaoInt("Entre com a posição a ser removida", scan);

        try {
            Contato contato = lista.get(pos);
            lista.remove(contato);
            System.out.println("Contato excluido");
        } catch (Exception e) {
            System.out.println("Posicao invalida!");
        }
    }

    private static void obtemContato(Scanner scan, ArrayList<Contato> lista) {
        System.out.println("Obtendo conato por posição, entre com os dados:");

        int pos = leInformacaoInt("Entre com a posição", scan);

        try {
            Contato contato = lista.get(pos);
            System.out.println("Contato existe, segue dados:");
            System.out.println(contato);
            System.out.println("Fazendo pesquisa  do contato encontrado:");
            pos = lista.indexOf(contato);
            System.out.println("Contato encontrado na posição: " + pos);
        } catch (Exception e) {
            System.out.println("Posicao invalida!");
        }
    }

    private static void obtemContatoPosicao(Scanner scan, ArrayList<Contato> lista) {
        System.out.println("Obtendo conato por posição, entre com os dados:");
        int pos = leInformacaoInt("Entre com a posição a ser pesquisada", scan);

        try {
            Contato contato = lista.get(pos);
            System.out.println("Contato existe, segue dados:");
            System.out.println(contato);
        } catch (Exception e) {
            System.out.println("Posicao invalida!");
        }
    }

    private static void adicionarContatoNoFinal(Scanner scanner, ArrayList<Contato> lista) {
        System.out.println("Criando contato, entre com os dados");
        String nome = leInformacao("Entre com o nome", scanner);
        String telefpne = leInformacao("Entre com o telefone", scanner);
        String email = leInformacao("Entre com o email", scanner);
        Contato contato = new Contato(nome, telefpne, email);
        lista.add(contato);
        System.out.println("Contato adicionado com sucesso");
        System.out.println(contato);
    }

    private static void adicionarContatoPosicao(Scanner scanner, ArrayList<Contato> lista) {
        System.out.println("Criando contato, entre com os dados");
        String nome = leInformacao("Entre com o nome", scanner);
        String telefpne = leInformacao("Entre com o telefone", scanner);
        String email = leInformacao("Entre com o email", scanner);

        Contato contato = new Contato(nome, telefpne, email);

        int posicao = leInformacaoInt("Entre a posicao desejada", scanner);
        try {
            lista.add(posicao, contato);
            System.out.println("Contato adicionado com sucesso");
            System.out.println(contato);
        } catch (Exception e) {
            System.out.println("Posicao invalida, contato nao adicionado");
        }
    }

    private static void criarContatosDinamicamente(int quantidade, ArrayList<Contato> lista) {
        Contato contato;

        for (int i = 0; i < quantidade; i++) {
            contato = new Contato();
            contato.setNome("Contato " + i);
            contato.setEmail("contato" + i + "@teste.com");
            contato.setTelefone("1111" + i);
            lista.add(contato);
        }
    }

}
