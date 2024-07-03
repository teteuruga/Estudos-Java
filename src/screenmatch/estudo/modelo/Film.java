package screenmatch.estudo.modelo;

import screenmatch.estudo.calculos.Classificavel;

public class Film extends Title implements Classificavel {
  private String diretor;

  public Film (String nome, int anoDeLancamento) {
      super (nome,anoDeLancamento);
  }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public int getclassificacao() {
        return (int) pegaMedia() / 2;
    }

    @Override
    public String toString() {
        return "Filme: " + this.getNome() + " (" + this.getAnoDeLancamento() + ")";
    }
}
