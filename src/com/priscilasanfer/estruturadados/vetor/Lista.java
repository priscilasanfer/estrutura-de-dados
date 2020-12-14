package com.priscilasanfer.estruturadados.vetor;

import java.lang.reflect.Array;
import java.util.List;

public class Lista<T> {
    private T[] elementos;
    private int tamanho;

    public Lista(int capacidade) {
        this.elementos = (T[]) new Object[capacidade];
        this.tamanho = 0;
    }

    public Lista(){
        this(10);
    }

    public Lista(int capacidade, Class<T> tipoDaClasse) {
        this.elementos = (T[]) Array.newInstance(tipoDaClasse, capacidade);
        this.tamanho = 0;
    }

    public boolean adiciona(T elemento) {
        this.aumentaCapacidade();
        if (this.tamanho < this.elementos.length) {
            this.elementos[tamanho] = elemento;
            this.tamanho++;
            return true;
        }
        return false;
    }

    public boolean adiciona(int posicao, T elemento) {
        if (!(posicao >= 0 && posicao < this.tamanho)) {
            throw new IllegalArgumentException("Posição invalida");
        }

        this.aumentaCapacidade();

        for (int i = this.tamanho - 1; i >= posicao; i--) {
            this.elementos[i + 1] = this.elementos[i];
        }

        this.elementos[posicao] = elemento;
        this.tamanho++;
        return true;
    }

    public T busca(int posicao) {
        if (!(posicao >= 0 && posicao < this.tamanho)) {
            throw new IllegalArgumentException("Posição invalida");
        }
        return this.elementos[posicao];
    }

    public int busca(T elemento) {
        for (int i = 0; i < this.tamanho; i++) {
            if (this.elementos[i].equals(elemento)) {
                return i;
            }
        }
        return -1;
    }

    public boolean contem(T elemento) {

//        int pos = busca(elemento);
//        if (pos>1){
//            return true;
//        }
//        else {
//            return false;
//        }
        return busca(elemento) > -1;
    }

    public int tamanho() {
        return this.tamanho;
    }

    private void aumentaCapacidade() {
        if (this.tamanho == this.elementos.length) {
            T[] elementosNovos = (T[]) new String[this.elementos.length * 2];
            for (int i = 0; i < this.elementos.length; i++) {
                elementosNovos[i] = elementos[i];
            }
            this.elementos = elementosNovos;
        }
    }

    public void remove(int posicao) {
        if (!(posicao >= 0 && posicao < tamanho)) {
            throw new IllegalArgumentException("Posição inválida");
        }
        for (int i = posicao; i < this.tamanho - 1; i++) {
            this.elementos[i] = this.elementos[i + 1];
        }
        this.tamanho--;

    }

    public void remove(T elemento) {
        int pos = this.busca(elemento);

        if (pos != -1) {
            remove(pos);
        } else {
            throw new IllegalArgumentException("Elemento inválido");
        }
    }

    public void limpar() {
        //Opcao 1
        //this.elementos = (T[])new Object[this.elementos.length];

        //Opcao 2
        //this.tamanho =0;

        //Opcao 3
        for (int i = 0; i < this.tamanho - 1; i++) {
            elementos[i] = null;
        }
        this.tamanho = 0;
    }

    public int ultimoIndice(T elemento) {
        for (int i = this.tamanho - 1; i >= 0; i--) {
            if (this.elementos[i].equals(elemento)) {
                return i;
            }
        }
        return -1;
    }

    public T obtem(int posicao) {
        return this.busca(posicao);
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("[");
        for (int i = 0; i < this.tamanho - 1; i++) {
            s.append(this.elementos[i]);
            s.append(", ");
        }
        if (this.tamanho > 0) {
            s.append(this.elementos[this.tamanho - 1]);
        }

        s.append("]");

        return s.toString();
    }
}
