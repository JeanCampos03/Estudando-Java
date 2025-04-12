package br.com.alura.screenmatch;

import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;


public class Principal {
    public static void main (String[] args) {



            Filme meuFilme = new Filme("The Matrix");
//old   meuFilme.setNome("The Matrix");
        meuFilme.setAnoDeLancamento(1999);
        meuFilme.setDuracaoEmMinutos(135);
        meuFilme.setIncluidoNoPlano(true);
        meuFilme.exibeFichaTecnica();

            Filme outroFilme = new Filme("John Wick");
//old   outroFilme.setNome("John Wick");
        outroFilme.setAnoDeLancamento(2014);
        outroFilme.setDuracaoEmMinutos(101);
        outroFilme.setIncluidoNoPlano(true);
        outroFilme.exibeFichaTecnica();


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
        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(serieUm);

        System.out.println("Tempo total: " +calculadora.getTempoTotal());

        FiltroRecomendacao filtroUm = new FiltroRecomendacao();
        filtroUm.filtra(meuFilme);

        Episodio episodioUm = new Episodio();
        episodioUm.setNumero(1);
        episodioUm.setSerie(serieUm);
        episodioUm.setTotalVisualizacoes(300);
        filtroUm.filtra(episodioUm);

        //var é uma variável que faz uma inferencia do tipo declarado
        var filmeDoPaulo = new Filme("Dogville");
        filmeDoPaulo.setDuracaoEmMinutos(200);
//old   filmeDoPaulo.setNome();
        filmeDoPaulo.setAnoDeLancamento(2003);
        filmeDoPaulo.avalia(10);

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(filmeDoPaulo);
        listaDeFilmes.add(meuFilme);
        listaDeFilmes.add(outroFilme);

        //size exibe quantos elementos foram adicionados
        System.out.println("Tamanho da lista: " + listaDeFilmes.size());
        System.out.println("Nome do primeiro filme na lista: " + listaDeFilmes.get(0).getNome());
        System.out.println("Nome do primeiro filme na lista: " + listaDeFilmes.get(1).getNome());

        System.out.println("toString de todos os filmes da lista: " + listaDeFilmes);
        System.out.println("toString do filme: " + listaDeFilmes.get(0).toString());





}
}