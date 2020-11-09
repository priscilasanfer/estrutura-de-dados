package com.priscilasanfer.estruturadados.vetor.teste;

import com.priscilasanfer.estruturadados.vetor.Vetor;

public class Aula09 {
    public static void main(String[] args) {
        Vetor vetor = new Vetor(5);
        vetor.adiciona("A");
        vetor.adiciona("C");
        vetor.adiciona("B");
        vetor.adiciona("C");
        vetor.adiciona("D");

        System.out.println(vetor);

        vetor.remove(1);

        System.out.println(vetor);

        System.out.println("Remover o Elemento B");

        int pos = vetor.busca("E");
        if (pos > -1){
            vetor.remove(pos);
        }else {
            System.out.println("Elemento não existe no vetor");
        }
    }
}
