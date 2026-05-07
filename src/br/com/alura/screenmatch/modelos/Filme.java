package br.com.alura.screenmatch.modelos;

public class Filme {
    private String nome;
    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacoes;
    private int duracaoEmMinutos;

    public int getTotalDeAvaliacoes(){
        return totalDeAvaliacoes;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }



    public void exibeFichaTecnica(){
        System.out.println("Nome: "+ nome);
        System.out.println("Ano de lançamento: "+ anoDeLancamento);
        System.out.println("Duração: " + duracaoEmMinutos);
    }

    public void avalia(double nota){
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;
    }

    public double retornaMedia(){
        return somaDasAvaliacoes / totalDeAvaliacoes;
    }


}
