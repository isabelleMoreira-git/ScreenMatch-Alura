import br.com.alura.screenmatch.modelos.Filme;

public class PrincipalJava {
    public static void main(String[] args){
        Filme meuFilme = new Filme();
        meuFilme.nome = "O Poderoso Chefão";
        meuFilme.anoDeLancamento = 1970;
        meuFilme.duracaoEmMinutos = 180;

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);

        System.out.println("Total de avaliações: "+ meuFilme.getTotalDeAvaliacoes());
        System.out.println("Média de Avaliações: "+ meuFilme.retornaMedia());

    }
}
