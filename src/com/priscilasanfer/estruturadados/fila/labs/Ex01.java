package com.priscilasanfer.estruturadados.fila.labs;

import com.priscilasanfer.estruturadados.fila.Fila;

public class Ex01 {
    public static void main(String[] args) {

        Fila<Documento> filaImpressora = new Fila<>();

        filaImpressora.enfileira(new Documento("A", 10));
        filaImpressora.enfileira(new Documento("B", 20));
        filaImpressora.enfileira(new Documento("C", 30));
        filaImpressora.enfileira(new Documento("D", 40));
        filaImpressora.enfileira(new Documento("E", 50));

        while (!filaImpressora.estaVazia()) {
            Documento doc = filaImpressora.desenfileirar();
            System.out.println("Imprimindo Documento: " + doc.getNome());

            try {
                Thread.sleep(200 * doc.getQuantidadeDeFolhas());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Todos os documentos foram impressos");

    }
}
