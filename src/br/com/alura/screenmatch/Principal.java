package br.com.alura.screenmatch;

import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;


public class Principal {
    public static void main (String args[]) {



            Filme favorito = new Filme();
        favorito.setNome("The Matrix");
        favorito.setAnoDeLancamento(1999);
        favorito.setDuracaoEmMinutos(135);
        favorito.setIncluidoNoPlano(true);
        favorito.exibeFichaTecnica();

            Filme outro = new Filme();
        outro.setNome("John Wick");
        outro.setAnoDeLancamento(2014);
        outro.setDuracaoEmMinutos(101);
        outro.setIncluidoNoPlano(true);
        outro.exibeFichaTecnica();


            Serie serieUm = new Serie();
        serieUm.setNome("La Casa de Papel");
        serieUm.setAnoDeLancamento(2017);
        serieUm.setIncluidoNoPlano(true);
        serieUm.setAtiva(true);
        serieUm.setTemporadas(5);
        serieUm.setEpisodiosPorTemporada(10);
        serieUm.setMinutosPorEpisodio(45);
        serieUm.exibeFichaTecnica();

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(favorito);
        calculadora.inclui(outro);
        calculadora.inclui(serieUm);

        System.out.println("Tempo total: " +calculadora.getTempoTotal());

        FiltroRecomendacao filtroUm = new FiltroRecomendacao();
        filtroUm.filtra(favorito);

        Episodio episodioUm = new Episodio();
        episodioUm.setNumero(1);
        episodioUm.setSerie(serieUm);
        episodioUm.setTotalVisualizacoes(300);
        filtroUm.filtra(episodioUm);

}
}