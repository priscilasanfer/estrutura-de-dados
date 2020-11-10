package com.priscilasanfer.estruturadados.vetor.teste;

import com.priscilasanfer.estruturadados.vetor.Lista;
import com.priscilasanfer.estruturadados.vetor.VetorDeObjetos;

public class Aula11 {
    public static void main(String[] args) {
        Lista<String> vetor = new Lista(1);
        vetor.adiciona("Oi");

        vetor.adiciona("TUDO BEM");

        System.out.println("Tamanho = " + vetor.tamanho());
        System.out.println(vetor);
    }
}
