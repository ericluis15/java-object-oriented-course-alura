package br.com.alura.screenmacth.calculos;

import br.com.alura.screenmacth.modelos.Filme;
import br.com.alura.screenmacth.modelos.Serie;
import br.com.alura.screenmacth.modelos.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal;

    public int getTempoTotal() {
        return tempoTotal;
    }

    public void inclui(Titulo titulo) {
        System.out.println("Adicionando duração em minutos de: "+titulo);
        tempoTotal += titulo.getDuracaoEmMinutos();
    }
}
