package com.priscilasanfer.estruturadados.fila.labs;

import com.priscilasanfer.estruturadados.fila.FilaComPrioridade;

public class Ex03 {
    public static final int VERDE = 2;
    public static final int AMARELO = 1;
    public static final int VERMELHO = 0;

    public static void main(String[] args) {
        FilaComPrioridade<Pessoa> fila = new FilaComPrioridade<>();

        fila.enfileira(new Pessoa("1", VERDE));
        fila.enfileira(new Pessoa("2", AMARELO));
        fila.enfileira(new Pessoa("3", VERMELHO));
        fila.enfileira(new Pessoa("4", VERDE));
        fila.enfileira(new Pessoa("5", VERDE));
        fila.enfileira(new Pessoa("6", VERMELHO));

        PSAntendimento antendimento = new PSAntendimento(fila);
        PSNovoPaciente novoPaciente = new PSNovoPaciente(fila);

        Thread t1 = new Thread(antendimento);
        Thread t2 = new Thread(novoPaciente);
        t1.start();
        t2.start();

    }
}
