import screenmatch.estudo.calculos.CalculadoraDeTempo;
import screenmatch.estudo.calculos.FiltroRecomendacao;
import screenmatch.estudo.modelo.Episodio;
import screenmatch.estudo.modelo.Film;
import screenmatch.estudo.modelo.Serie;

import java.util.ArrayList;


//Principal filme
public class Principal {

    public static void main(String[] args) {
        Film filme1 = new Film(" Vingadores", 2012);
        filme1.setDuracaoEmMinutos(138);

        filme1.exibeFichaTecnica();
        filme1.avalia(5);
        filme1.avalia(8);


        System.out.println("total de avaliacoes: " + filme1.getTotalDeAvaliacoes());
        System.out.println(filme1.pegaMedia());

        System.out.println("ano de lancamento: " + filme1.getAnoDeLancamento());
        // Orientacao ao metodo Serie
        Serie RickAndMorty = new Serie("Rick And Morty", 2021);
        RickAndMorty.exibeFichaTecnica();
        RickAndMorty.setTempordas(7);
        RickAndMorty.setEspisodiosPorTemporada(18);
        RickAndMorty.setMinutosPorEpisodio(23);

        System.out.println("Duracao para maratonar Rick And Morty : " + RickAndMorty.getDuracaoEmMinutos());

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(filme1);
        calculadora.inclui(RickAndMorty);
        System.out.println(calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro. filtra(filme1);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(RickAndMorty);
        episodio.setTotalVisualizacoes(300);
        filtro.filtra(episodio);

        Film filme2 = new Film("Euro tripo",2004);
        filme2.setDuracaoEmMinutos(90);
       

        ArrayList<Film> listaFilmes = new ArrayList<>();

        listaFilmes.add(filme2);
        listaFilmes.add(filme1);

        System.out.println(" Tamanho de lista " + listaFilmes.size());
        System.out.println(" Primeiro Filme " + listaFilmes.get(0).getNome());
        System.out.println(listaFilmes);
        System.out.println(" toString do Filme " + listaFilmes.get(0).toString());



    }
}

