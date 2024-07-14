package screenmatch.estudo.modelo;

public class Serie extends Title{
    private int Temporadas;
    private boolean ativa;
    private int espisodiosPorTemporada;
    private int minutosPorEpisodio;

    public Serie(String nome, int anoDeLancamento) {
        super(nome, anoDeLancamento);
    }


    public int getTempordas() {
        return Temporadas;
    }

    public void setTempordas(int tempordas) {
        this.Temporadas = Temporadas;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    public int getEspisodiosPorTemporada() {
        return espisodiosPorTemporada;
    }

    public void setEspisodiosPorTemporada(int espisodiosPorTemporada) {
        this.espisodiosPorTemporada = espisodiosPorTemporada;
    }

    public int getMinutosPorEpisodio() {
        return minutosPorEpisodio;
    }

    public void setMinutosPorEpisodio(int minutosPorEpisodio) {
        this.minutosPorEpisodio = minutosPorEpisodio;
    }

    @Override
    public int getDuracaoEmMinutos() {
        return Temporadas * espisodiosPorTemporada * minutosPorEpisodio;

    }

    @Override
    public String toString() {
        return "Serie: " + this.getNome() + "(" + getAnoDeLancamento() + ")";
    }
}