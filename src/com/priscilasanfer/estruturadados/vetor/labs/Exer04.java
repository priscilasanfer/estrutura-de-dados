package com.priscilasanfer.estruturadados.vetor.labs;

import com.priscilasanfer.estruturadados.vetor.Lista;

public class Exer04 {
    public static void main(String[] args) {
        Lista<String> lista = new Lista<String>(5);
        lista.adiciona("A");
        lista.adiciona("B");
        lista.adiciona("B");

        System.out.println(lista.obtem(1));
    }
}
