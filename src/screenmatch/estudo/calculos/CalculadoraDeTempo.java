package screenmatch.estudo.calculos;

import screenmatch.estudo.modelo.Title;

public class CalculadoraDeTempo {
    private int tempoTotal;

    public int getTempoTotal() {
        return this.tempoTotal;
    }

//    public void inclui(Film filme) {
//        this.tempoTotal += filme.getDuracaoEmMinutos();
//    }
//
//    public void inclui(Serie S) {
//        this.tempoTotal += S.getDuracaoEmMinutos();
//    }


    public void inclui(Title titulo){

        this.tempoTotal += titulo.getDuracaoEmMinutos();
    }
}