package com.priscilasanfer.estruturadados.fila.labs;

import com.priscilasanfer.estruturadados.fila.Fila;

public class Ex02 {
    public static void main(String[] args) {
        Fila<String> regular = new Fila<>();
        Fila<String> prioridade = new Fila<>();

        final int MAX_PRIORIDADE = 3;

        regular.enfileira("Pessoa 1");
        regular.enfileira("Pessoa 2");
        regular.enfileira("Pessoa 3");

        prioridade.enfileira("Pessoa 1P");
        prioridade.enfileira("Pessoa 2P");
        prioridade.enfileira("Pessoa 3P");
        prioridade.enfileira("Pessoa 4P");
        prioridade.enfileira("Pessoa 5P");
        prioridade.enfileira("Pessoa 6P");
        prioridade.enfileira("Pessoa 7P");

        regular.enfileira("Pessoa 4");
        regular.enfileira("Pessoa 5");
        regular.enfileira("Pessoa 6");
        regular.enfileira("Pessoa 7");

        while (!regular.estaVazia() || !prioridade.estaVazia()) {
            int cont = 0;
            while (!prioridade.estaVazia() && cont < MAX_PRIORIDADE) {
                atendePessoa(prioridade);
                cont++;
            }

            if (!regular.estaVazia()){
                atendePessoa(regular);
            }

            if(prioridade.estaVazia()){
                while (!regular.estaVazia()){
                    atendePessoa(regular);
                }
            }
        }
    }

    public static void atendePessoa(Fila<String> fila){
        String pessoaAtendida = fila.desenfileirar();
        System.out.println(pessoaAtendida + " foi atendida." );
    }
}
