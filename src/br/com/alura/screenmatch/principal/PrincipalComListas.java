package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;

public class PrincipalComListas {
    public static void main(String[] args){
        Filme meuFilme = new Filme("O Poderoso Chefão", 1970);
        meuFilme.avalia(9);
        Filme outroFilme = new Filme("Avatar", 2023);
        outroFilme.avalia(6);
        Filme filme3 = new Filme("Dogville", 2003);
        filme3.avalia(10);
        Serie lost = new Serie("Lost",2003);
        lost.avalia(7);

        ArrayList<Titulo> lista= new ArrayList<>();
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(filme3);
        lista.add(lost);
        for (Titulo item: lista){
            System.out.println(item.getNome());
            if (item instanceof Filme filme && filme.getClassificacao() > 2){
                System.out.println("Classificação: " + filme.getClassificacao());
            }

        }



    }
}
