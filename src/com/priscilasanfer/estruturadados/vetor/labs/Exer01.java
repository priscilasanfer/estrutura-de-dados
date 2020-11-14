package com.priscilasanfer.estruturadados.vetor.labs;

import com.priscilasanfer.estruturadados.vetor.Lista;

public class Exer01 {
    public static void main(String[] args) {
        Lista<String> lista = new Lista<String>(5);
        lista.adiciona("Meg");
        lista.adiciona("Malu");

        System.out.println(lista.contem("Meg"));
        System.out.println(lista.contem("Cachorro"));
    }
}
