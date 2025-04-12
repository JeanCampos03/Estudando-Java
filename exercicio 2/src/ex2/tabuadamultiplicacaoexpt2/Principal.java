package ex2.tabuadamultiplicacaoexpt2;

// 3- Crie uma classe TabuadaMultiplicacao que implementa uma interface Tabuada com o metodo mostrarTabuada()
//para exibir a tabuada de um número. A classe deve receber o número como parâmetro.

public class Principal {
    public static void main(String[] args) {
        TabuadaMultiplicacao primeiraTabuada = new TabuadaMultiplicacao();
        TabuadaMultiplicacao segundaTabuada = new TabuadaMultiplicacao();
        TabuadaMultiplicacao terceiraTabuada = new TabuadaMultiplicacao();


        primeiraTabuada.mostrarTabuada(1);
        segundaTabuada.mostrarTabuada(5);
        terceiraTabuada.mostrarTabuada(10);


    }
}
