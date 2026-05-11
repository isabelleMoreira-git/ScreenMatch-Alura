package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.calculo.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.calculo.CalculadoraDeTempo;

import java.util.ArrayList;

public class PrincipalJava {
    public static void main(String[] args){
        Filme filme1 = new Filme("Bird Box", 2018);
        //filme1.setNome("Bird Box");
        //filme1.setAnoDeLancamento(2018);
        filme1.setDuracaoEmMinutos(180);
        System.out.println("Duração do Filme:" + filme1.getDuracaoEmMinutos());

        filme1.exibeFichaTecnica();
        filme1.avalia(8);
        filme1.avalia(5);


        System.out.println("Total de avaliações: "+ filme1.getTotalDeAvaliacoes());
        System.out.println("Média de Avaliações: "+ filme1.retornaMedia());

        Serie serie1 = new Serie("Brooklyn 99",2013);
        //serie1.setNome("Brooklyn 99");
        serie1.exibeFichaTecnica();
        serie1.setTemporadas(8);
        serie1.setEpisodiosPorTemporada(20);
        serie1.setMinutosPorEpisodio(24);
        System.out.println("Duração para maratonar Brooklyn 99: " + serie1.getDuracaoEmMinutos());

        Filme filme2= new Filme("Avatar", 2009);
        //euFilme.setNome("Avatar");
        //filme1.setAnoDeLancamento(2009);
        filme1.setDuracaoEmMinutos(200);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(filme1);
        calculadora.inclui(filme2);
        System.out.println("Tempo total de maratona: " + calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(filme1);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(serie1);
        episodio.setTotalDeVizualizacoes(300);
        filtro.filtra(episodio);

        Filme filme3 = new Filme("Maze Runner", 2018);
        //filme3.setNome("Maze Runner");
        //filme3.setAnoDeLancamento(2018);
        filme3.setDuracaoEmMinutos(200);
        filme3.avalia(9);

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(filme1);
        listaDeFilmes.add(filme2);
        listaDeFilmes.add(filme3);
        System.out.println("Tamanho da lista: " + listaDeFilmes.size());
        System.out.println("Primeiro filme: " + listaDeFilmes.get(0).getNome());
        System.out.println(listaDeFilmes);
        System.out.println("toString do filme: " + listaDeFilmes.get(0).toString());




    }
}
