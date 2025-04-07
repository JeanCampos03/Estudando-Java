package br.com.alura.screenmatch.calculos;

public class FiltroRecomendacao {

    public void filtra(Classificavel classificavel) {
        if (classificavel.getClassificacao() >= 4) {
            System.out.println("Está nos preferidos!");
        } else if (classificavel.getClassificacao() >= 2) {
            System.out.println("Muito bem avaliado!");
        } else {
            System.out.println("Coloque na sua lista para ver mais tarde!");
        }
    }
}
