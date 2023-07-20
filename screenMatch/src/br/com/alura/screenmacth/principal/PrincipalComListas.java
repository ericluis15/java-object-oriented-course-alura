package br.com.alura.screenmacth.principal;

import br.com.alura.screenmacth.modelos.Filme;
import br.com.alura.screenmacth.modelos.Serie;
import br.com.alura.screenmacth.modelos.Titulo;

import java.util.*;

public class PrincipalComListas {

    public static void main(String[] args) {
        Filme meuFilme = new Filme("O poderoso chefão", 1970);
        meuFilme.avalia(9);
        Filme outroFilme = new Filme("Avatar", 2023);
        outroFilme.avalia(6);
        Serie lost = new Serie("Lost", 2000);
        var filmeDoPaulo = new Filme("Dogville", 2000);
        filmeDoPaulo.avalia(10);

        Filme f1 = filmeDoPaulo;

        List<Titulo> lista = new LinkedList<>();
        lista.add(filmeDoPaulo);
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(lost);

        for (Titulo item: lista) {
            System.out.println(item.getNome());
            if(item instanceof Filme filme && filme.getClassificacao() > 2) {
                System.out.println("Classificação: " + filme.getClassificacao());
            }
        }

        ArrayList<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Adam Sandler");
        buscaPorArtista.add("Paulo");
        buscaPorArtista.add("Jacqueline");

        System.out.println(buscaPorArtista);

        Collections.sort(buscaPorArtista);

        System.out.println("Depois da ordenação: "+ buscaPorArtista);

        Collections.sort(lista);

        System.out.println("Lista De Titulos Ordenada: "+ lista);

        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));

        System.out.println("Lista De Titulos Ordenada por Ano: "+ lista);

    }
}
