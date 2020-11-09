package com.priscilasanfer.estruturadados.vetor.teste;

import com.priscilasanfer.estruturadados.vetor.Vetor;
import com.priscilasanfer.estruturadados.vetor.VetorDeObjetos;

public class Aula10 {
    public static void main(String[] args) {
        VetorDeObjetos vetor = new VetorDeObjetos(3);
        Contato c1 = new Contato("Contato 1", "1234", "contato1@teste.com");
        Contato c2 = new Contato("Contato 2", "4567", "contato2@teste.com");
        Contato c3 = new Contato("Contato 3", "8901", "contato3@teste.com");

        vetor.adiciona(c1);
        vetor.adiciona(c2);
        vetor.adiciona(c3);

        System.out.println("Tamanho = " + vetor.tamanho());
        System.out.println(vetor);
    }
}
