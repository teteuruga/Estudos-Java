package screenmatch.estudo.Principal;

import screenmatch.estudo.modelo.Film;
import screenmatch.estudo.modelo.Serie;
import screenmatch.estudo.modelo.Title;

import java.util.*;

public class PrincipalComListas {

    public static void main(String[] args) {
        Film filme1 = new Film("Vingadores", 2012);
        Film filme2 = new Film("Euro tripo",2004);
        Serie RickAndMorty = new Serie("Rick And Morty", 2021);

        List<Title> lista = new LinkedList<>(); // Formato de lista mais utilizado

        lista.add(filme2);
        lista.add(filme1);
        lista.add(RickAndMorty);
        for (Title item: lista) {
            System.out.println(item.getNome());

            if (item instanceof Film filme && filme.getclassificacao() > 2) {
                System.out.println("Classificacao" + filme.getclassificacao());
            }

        }

        ArrayList <String> buscarPorArtista = new ArrayList<>(); // formato de lista utilizando array
        buscarPorArtista.add("Rick Sanchez");
        buscarPorArtista.add("Chopper");
        buscarPorArtista.add("Monkey D. Luffy");
        System.out.println(buscarPorArtista);

        Collections.sort(buscarPorArtista);
        System.out.println("Depois da Ordenacao ");
        System.out.println(buscarPorArtista);
        System.out.printf("Lista de titulos ordenados");
        Collections.sort(lista);
        System.out.println(lista);
        lista.sort(Comparator.comparing(Title::getAnoDeLancamento));
        System.out.println("Ordenando por ano");
        System.out.println(lista);

    }
}
