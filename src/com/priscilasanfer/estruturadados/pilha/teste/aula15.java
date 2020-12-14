package com.priscilasanfer.estruturadados.pilha.teste;

import com.priscilasanfer.estruturadados.pilha.Pilha;

public class aula15 {
    public static void main(String[] args) {
        Pilha<Integer> pilha = new Pilha<Integer>();

        System.out.println(pilha.estaVazia());

        pilha.empilha(1);

        System.out.println(pilha.estaVazia());

    }
}
