package com.priscilasanfer.estruturadados.pilha.labs;

import com.priscilasanfer.estruturadados.pilha.Pilha;

import java.util.Scanner;

public class Exer02 {

    public static void main(String[] args) {
        Pilha<Integer> par = new Pilha<>();
        Pilha<Integer> impar = new Pilha<>();
        int numero;

        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 10; i++) {
            System.out.println("Entre com um numero");
            numero = sc.nextInt();
            if (numero == 0) {
                Integer desempilhado = par.desempilha();

                if (desempilhado == null) {
                    System.out.println("Pilha está vazia");
                } else {
                    System.out.println("Desempilhando a pilha par: " + desempilhado);
                }

                desempilhado = impar.desempilha();
                if (desempilhado == null) {
                    System.out.println("Pilha está vazia");
                } else {
                    System.out.println("Desempilhando a pilha impar: " + desempilhado);
                }


            } else if (numero % 2 == 0) {
                System.out.println("Numero par, empilhando na pilha par: " + numero);
                par.empilha(numero);
            } else {
                System.out.println("Numero impar, empilhando na pilha impar: " + numero);
                impar.empilha(numero);
            }
        }

        System.out.println("Todos os numeros foram lidos desempilhando numeros da pilha par");

        while (!par.estaVazia()) {
            System.out.println("desempilhando um elemento da pilha par: " + par.desempilha());
        }

        System.out.println("Desempilhando numeros da pilha par");

        while (!impar.estaVazia()) {
            System.out.println("desempilhando um elemento da pilha impar: " + impar.desempilha());
        }
    }
}

