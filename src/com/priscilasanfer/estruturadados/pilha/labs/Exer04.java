package com.priscilasanfer.estruturadados.pilha.labs;

import com.priscilasanfer.estruturadados.pilha.Livro;
import com.priscilasanfer.estruturadados.pilha.Pilha;

import java.util.Scanner;
import java.util.Stack;

public class Exer04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Stack<Livro> pilha = new Stack<>();

        criarLivrosDinamicamente(6, pilha);

        int opcao = 1;

        while (opcao != 0) {
            opcao = obterOpcaoMenu(scan);
            switch (opcao) {
                case 1:
                    empilhaLivro(scan, pilha);
                    break;
                case 2:
                    espiarUltimoLivro(pilha);
                    break;
                case 3:
                    desempilharLivro(pilha);
                    break;
                case 4:
                    pilhaEstaVazia(pilha);
                case 5:
                    tamanhoDapilha(pilha);
                default:
                    break;
            }
        }
    }

    private static void tamanhoDapilha(Stack<Livro> pilha) {
        System.out.println("O tamanho da pilha é: " + pilha.size());
    }

    private static void pilhaEstaVazia(Stack<Livro> pilha) {
        System.out.println( "A pilha esta vazia: " + pilha.isEmpty());
    }

    private static void desempilharLivro(Stack<Livro> pilha) {
        System.out.println("Desempilhando livro");

        Livro desempilhado = pilha.pop();
        if (desempilhado == null) {
            System.out.println("Pilha está vazia");
        } else {
            System.out.println("Desempilhando o livro da pilha: " + desempilhado);
        }
    }

    private static void espiarUltimoLivro(Stack<Livro> pilha) {
        System.out.println("Espiando o ultimo livro");
        System.out.println(pilha.peek());
    }

    private static void empilhaLivro(Scanner scan, Stack<Livro> pilha) {
        System.out.println("Empilhando no final da pilha");
        String nome = leInformacao("Digite o nome do Livro: ", scan);
        String isbn = leInformacao("Digite o isbn do Livro: ", scan);
        String anoDeLancamento = leInformacao("Digite o ano de lancamento do Livro: ", scan);
        String autor = leInformacao("Digite o nome do autor Livro: ", scan);

        Livro livro = new Livro(nome, isbn, anoDeLancamento, autor);
        pilha.push(livro);
        System.out.println("Livro empilhado com sucesso");
        System.out.println(pilha);
        System.out.println();
    }

    private static int obterOpcaoMenu(Scanner scan) {
        boolean entradaValida = false;
        int opcao = 0;
        String entrada;
        while (!entradaValida) {
            System.out.println("Digite a opção desejada");
            System.out.println("1 - Empilhar Livro");
            System.out.println("2 - Espiar ultimo Livro");
            System.out.println("3 - Desempilhar Livro");
            System.out.println("4 - Sair");
            try {
                entrada = scan.nextLine();
                opcao = Integer.parseInt(entrada);
                if (opcao >= 0 && opcao <= 4) {
                    entradaValida = true;
                } else {
                    throw new Exception();
                }

            } catch (Exception e) {
                System.out.println("Entrada invalida, digite novamente\n\n");
            }
        }
        return opcao;
    }

    private static void criarLivrosDinamicamente(int quantidade, Stack<Livro> pilha) {
        Livro livro;
        for (int i = 0; i < quantidade; i++) {
            livro = new Livro();
            livro.setNome("Nome do Livro " + i);
            livro.setIsbn("ISBN" + i);
            livro.setAnoDeLancamento(i + "/01/2020");
            livro.setAutor("Nome do Autor " + i);
            pilha.push(livro);
        }
    }

    private static String leInformacao(String msg, Scanner scanner) {
        System.out.println(msg);
        return scanner.nextLine();
    }
}
