package com.priscilasanfer.estruturadados.pilha.teste;

import com.priscilasanfer.estruturadados.pilha.Pilha;

public class aula16 {
    public static void main(String[] args) {
        Pilha<Integer> pilha = new Pilha<Integer>();

        System.out.println(pilha.topo());
        System.out.println(pilha);

        pilha.empilha(1);
        pilha.empilha(2);
        System.out.println(pilha.topo());
        System.out.println(pilha);
    }
}
