package com.priscilasanfer.estruturadados.pilha.labs;

import java.util.Scanner;
import java.util.Stack;

public class Exer07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero para converter em binario");

        Stack<Integer> pilha = new Stack<>();

        int numero = sc.nextInt();

        int resto;
        String numeroBinario = "";

        while (numero > 0) {
            resto = numero % 2;
            pilha.push(resto);
            numero /= 2;
        }

        while (!pilha.isEmpty()) {
            numeroBinario += pilha.pop();
        }

        System.out.println("O numero digitado em binário é: " + numeroBinario);

    }
}
