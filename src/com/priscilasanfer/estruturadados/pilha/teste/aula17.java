package com.priscilasanfer.estruturadados.pilha.teste;

import com.priscilasanfer.estruturadados.pilha.Pilha;

public class aula17 {
    public static void main(String[] args) {
        Pilha<Integer> pilha = new Pilha<Integer>();

        pilha.empilha(1);
        pilha.empilha(2);
        pilha.empilha(3);

        System.out.println(pilha);

        System.out.println("Desempilhando elemento : " + pilha.desempilha());
        System.out.println(pilha);
    }
}
