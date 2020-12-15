package com.priscilasanfer.estruturadados.pilha.labs;

import com.priscilasanfer.estruturadados.pilha.Pilha;

import java.util.Scanner;

public class Exer06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String expressaoMatematica = sc.nextLine();
        Pilha<Character> pilha = new Pilha<>();
        int erro = 0;

        final String ABRE= "({[<";
        final String FECHA = ")}]>";

        char topo, simbolo;

        for (int i = 0; i < expressaoMatematica.length() ; i++) {
            simbolo = expressaoMatematica.charAt(i);

            if(ABRE.indexOf(simbolo) > -1){
                pilha.empilha(simbolo);
            } else if (FECHA.indexOf(simbolo) > -1){
                if (pilha.estaVazia()){
                    System.out.println("A expressao: "+ expressaoMatematica + " não está balanceada");
                    erro++;
                    break;
                }else {
                    topo = pilha.desempilha();
                    if (FECHA.indexOf(simbolo) != ABRE.indexOf(topo)){
                        System.out.println("A expressao: "+ expressaoMatematica + " não está balanceada");
                        erro++;
                        break;
                    }
                }
            }
        }

        if (pilha.estaVazia() && erro == 0){
            System.out.println("A expressao: " + expressaoMatematica + " está balanceada");
        }
    }
}
