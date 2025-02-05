package screenmatch.estudo.Principal;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import screenmatch.estudo.excecao.ErroDeConversaoExcption;
import screenmatch.estudo.modelo.Title;
import screenmatch.estudo.modelo.TituloOmdb;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class PrincipalComBusca {

    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite um filme para busca: ");
        var busca = leitura.nextLine();

        String endereco = "https://www.omdbapi.com/?t=" + busca.replace(" ", "+") + "&apikey=a46458d2";

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        String json = response.body();
        System.out.println(json);

        Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE).create();

        TituloOmdb meuTituloOmdb = gson.fromJson(json, TituloOmdb.class);
        System.out.println(meuTituloOmdb);

        try {
            Title meuTitulo = new Title(meuTituloOmdb);
            System.out.println("Titulo ja convertido");
            System.out.println(meuTitulo);
        } catch (NumberFormatException e){
            System.out.printf("Aconteceu um erro ");
            System.out.println(e.getMessage());

        }catch (ErroDeConversaoExcption e){
            System.out.println(e.getMessage());
        }

        System.out.println("O programa finalizou com sucesso");

    }
}
