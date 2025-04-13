package br.com.alura.screenmatch.Principal;

import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("The Matrix",1999);
        meuFilme.avalia(9);

        Filme outroFilme = new Filme("John Wick",2014);
        outroFilme.avalia(6);

        var filmeDoPaulo = new Filme("Dogville", 2003);
        filmeDoPaulo.avalia(10);

        Serie serieUm = new Serie("La Casa de Papel", 2017);
        //serieUm.avalia();

        //Quando fazemos a representação abaixo, estamos dizendo que f1 e filme do Paulo se referencia ao mesmo objeto
        // ou seja podemos utilizar um ou outro, criação de objeto é apenas quando tem new.
        Filme f1 = filmeDoPaulo;



        ArrayList<Titulo> listaDeTitulos = new ArrayList<>();
        listaDeTitulos.add(filmeDoPaulo);
        listaDeTitulos.add(meuFilme);
        listaDeTitulos.add(outroFilme);
        listaDeTitulos.add(serieUm);

        //foreach em java
        //Para cada Titulo, vamos chamar de dadosPercorridos.
        // dadosPercorridos está dentro de listaDeTitulos
        for ( Titulo dadosPercorridos : listaDeTitulos) {//Vamos imprimir esses dados percorridos que cada hora assume um valor da lista
            System.out.println(dadosPercorridos.getNome());
    
            //Para não ocorrer erro com a serie que não retornar nada que seja de filme
            // passamos instanceof que verficia se é filme ou não

            if (dadosPercorridos instanceof Filme filme && filme.getClassificacao() > 2) { // podemos também passar até uma instancia
                //Nas versões atuais do Java a partir da 14, podemos já declararar na conferencia evitando ter de repassar a linha 47

                //Passar um metodo exclusivo de filme
                // estou falando que dados percorridos é um filme
                //Filme filme = (Filme)dadosPercorridos;
                System.out.println("Classificaação " + filme.getClassificacao());

            }


        }

    }
}
