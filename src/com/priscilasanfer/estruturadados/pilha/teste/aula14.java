package com.priscilasanfer.estruturadados.pilha.teste;

import com.priscilasanfer.estruturadados.pilha.Pilha;

public class aula14 {
    public static void main(String[] args) {
        Pilha<Integer> pilha = new Pilha<Integer>();
        for (int i = 1; i <= 10; i++) {
            pilha.empilha(i);
        }
        System.out.println(pilha);
        System.out.println(pilha.tamanho());
    }
}
