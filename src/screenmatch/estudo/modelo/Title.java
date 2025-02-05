package screenmatch.estudo.modelo;

import com.google.gson.annotations.SerializedName;
import org.w3c.dom.ls.LSOutput;
import screenmatch.estudo.excecao.ErroDeConversaoExcption;

public class Title implements Comparable<Title> {


    private String nome;

    private int anoDeLancamento;
    private boolean incluindoNoPlano;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacoes;
    private int duracaoEmMinutos;

    public Title(String nome, int anoDeLancamento) {
        this.nome = nome;
        this.anoDeLancamento = anoDeLancamento;
    }

    public Title(TituloOmdb meutituloOmdb) {
        this.nome = meutituloOmdb.title();

        if (meutituloOmdb.year().length() > 4){
            throw new ErroDeConversaoExcption("Não consegui converter o ano " +
                    "porque tem mais de 04 caracteres.");
        }
        this. anoDeLancamento = Integer.valueOf(meutituloOmdb.year());
        this.duracaoEmMinutos = Integer.valueOf(meutituloOmdb.runtime().substring(0,2));
    }


    public String getNome() {
        return nome;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public boolean getIncluindoNoPlano() {
        return incluindoNoPlano;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public int getTotalDeAvaliacoes() {
        return totalDeAvaliacoes;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public void setIncluindoNoPlano(boolean incluindoNoPlano) {
        this.incluindoNoPlano = incluindoNoPlano;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public void exibeFichaTecnica(){

        System.out.println("Nome do filme: " + nome);
    }
    public void avalia(double nota){
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;
    }

    public double pegaMedia(){
        return somaDasAvaliacoes / totalDeAvaliacoes;
    }

    @Override
    public int compareTo (Title outroTitulo) {
        return this.getNome().compareTo(outroTitulo.getNome());

    }

    @Override
    public String toString() {
        return "nome='" + nome + '\'' +
                ", anoDeLancamento=" + anoDeLancamento + "," + " Duracao " + duracaoEmMinutos;
    }
}
