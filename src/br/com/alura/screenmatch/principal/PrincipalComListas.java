package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.*;

public class PrincipalComListas {
    public static void main(String[] args){
        Filme filme1 = new Filme("Bird Box", 2018);
        filme1.avalia(8);
        Filme filme2 = new Filme("Avatar", 2009);
        filme2.avalia(10);
        Filme filme3 = new Filme("Maze Runner", 2014);
        filme3.avalia(9);
        Serie lost = new Serie("Brooklyn 99",2013);
        lost.avalia(10);

        ArrayList<Titulo> lista= new ArrayList<>();
        lista.add(filme1);
        lista.add(filme2);
        lista.add(filme3);
        lista.add(lost);
        for (Titulo item: lista){
            System.out.println(item.getNome());
            if (item instanceof Filme filme && filme.getClassificacao() > 2){
                System.out.println("Classificação: " + filme.getClassificacao());
            }

        }

        List<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Adam Sandler");
        buscaPorArtista.add("Jennifer Lawrence");
        buscaPorArtista.add("Dylan O'Brien");
        System.out.println(buscaPorArtista);

        Collections.sort(buscaPorArtista);
        System.out.println("\nDepois de usar o .sort para ordenar a lista:");
        System.out.println(buscaPorArtista);

        System.out.println(lista);
        Collections.sort(lista);
        System.out.println("\nDepois de usar o .sort para ordenar a lista:");
        System.out.println(lista);
    }
}
