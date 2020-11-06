package com.priscilasanfer.estruturadados.vetor.teste;

import com.priscilasanfer.estruturadados.vetor.Vetor;

public class Aula06 {
    public static void main(String[] args) {
        Vetor vetor = new Vetor(5);
        vetor.adiciona("Elemento 1");
        vetor.adiciona("Elemento 2");
        System.out.println(vetor.busca("Elemento 1"));
        System.out.println(vetor.busca("Elemento 5"));
    }
}
