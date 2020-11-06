package com.priscilasanfer.estruturadados.vetor.teste;

import com.priscilasanfer.estruturadados.vetor.Vetor;

public class Aula07 {
    public static void main(String[] args) {
        Vetor vetor = new Vetor(5);
        vetor.adiciona("Elemento B");
        vetor.adiciona("Elemento C");
        vetor.adiciona("Elemento D");
        vetor.adiciona(0, "Elemento A");

        System.out.println(vetor );

    }
}
