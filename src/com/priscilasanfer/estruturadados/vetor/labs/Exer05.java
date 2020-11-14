package com.priscilasanfer.estruturadados.vetor.labs;

import com.priscilasanfer.estruturadados.vetor.Lista;

import java.util.ArrayList;

public class Exer05 {
    public static void main(String[] args) {
        ArrayList listaa = new ArrayList();
        listaa.clear();
        Lista<String> lista = new Lista<String>(5);
        lista.adiciona("A");
        lista.adiciona("B");
        lista.adiciona("B");

        System.out.println(lista);
        lista.limpar();

        System.out.println(lista);
    }
}
