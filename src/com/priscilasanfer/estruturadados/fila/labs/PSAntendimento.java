package com.priscilasanfer.estruturadados.fila.labs;

import com.priscilasanfer.estruturadados.fila.FilaComPrioridade;

public class PSAntendimento implements Runnable {
    private FilaComPrioridade<Pessoa> fila;

    public PSAntendimento(FilaComPrioridade<Pessoa> fila) {
        this.fila = fila;
    }

    @Override
    public void run() {
        while (!fila.estaVazia()) {
            try {
                System.out.println(fila.desenfileirar() + " atendida");
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Atendimento concluido");
    }
}
