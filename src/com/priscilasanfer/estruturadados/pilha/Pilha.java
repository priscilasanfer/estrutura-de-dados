package com.priscilasanfer.estruturadados.pilha;

import com.priscilasanfer.estruturadados.base.EstruturaEstatica;

public class Pilha<T> extends EstruturaEstatica {

    public Pilha() {
        super();
    }

    public Pilha(int capacidade) {
        super(capacidade);
    }

    public void empilha(T elemento){
       super.adiciona(elemento);

    }
}
