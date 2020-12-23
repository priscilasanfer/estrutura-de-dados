package com.priscilasanfer.estruturadados.lista.teste;

import com.priscilasanfer.estruturadados.lista.Fila;

public class Aula21 {
    public static void main(String[] args) {
        Fila<Integer> fila = new Fila<>();
        fila.enfileira(1);
        fila.enfileira(2);
        fila.enfileira(3);
        System.out.println(fila.espirar());
        System.out.println(fila);

    }
}
