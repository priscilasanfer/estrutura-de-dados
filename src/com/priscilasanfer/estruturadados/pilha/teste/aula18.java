package com.priscilasanfer.estruturadados.pilha.teste;

import com.priscilasanfer.estruturadados.pilha.Pilha;

import java.util.Stack;

public class aula18 {
    public static void main(String[] args) {
        Pilha<Integer> pilha = new Pilha<Integer>();

        Stack<Integer> stack = new Stack<>();

        System.out.println(stack.isEmpty());
        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println(stack.isEmpty());
        System.out.println(stack.size());
        System.out.println(stack);

        System.out.println(stack.peek());
        System.out.println(stack.pop());

        System.out.println(stack);

        pilha.empilha(1);
        pilha.empilha(2);
        pilha.empilha(3);

        System.out.println(pilha);
    }
}
