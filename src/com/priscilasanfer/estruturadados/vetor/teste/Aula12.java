package com.priscilasanfer.estruturadados.vetor.teste;

import java.util.ArrayList;

public class Aula12 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<String>();

        arrayList.add("Priscila");
        arrayList.add("Ferreira");
        System.out.println(arrayList);
        arrayList.add(1, "Teste");
        System.out.println(arrayList);

        boolean existe = arrayList.contains("Meg");

        if(existe){
            System.out.println("O elemento existe no array");
        }else {
            System.out.println("O elemento não existe no array");
        }

        int pos = arrayList.indexOf("Teste");

        if(pos > -1){
            System.out.println("O elemento existe no array");
        }else {
            System.out.println("O elemento não existe no array");
        }

    }
}
