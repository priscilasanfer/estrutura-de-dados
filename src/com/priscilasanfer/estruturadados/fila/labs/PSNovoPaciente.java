package com.priscilasanfer.estruturadados.fila.labs;

import com.priscilasanfer.estruturadados.fila.FilaComPrioridade;

import java.util.Random;

public class PSNovoPaciente implements Runnable {
    private FilaComPrioridade<Pessoa> fila;
    private int cont = 7;
    private Random prioridade = new Random();

    public PSNovoPaciente(FilaComPrioridade<Pessoa> fila) {
        this.fila = fila;
    }

    @Override
    public void run() {
        Pessoa p;
        for (int i = 0; i < 8; i++) {
            try{
                Thread.sleep(8000);
                p = new Pessoa("" + cont, prioridade.nextInt(3));
                fila.enfileira(p);
                cont++;
                System.out.println(p + "enfileirada");
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
