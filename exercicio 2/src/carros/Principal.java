package carros;

public class Principal {
    public static void main(String[] args) {
        ModeloCarro carroUm = new ModeloCarro();

        carroUm.definirModelo("Corsa");
        carroUm.definirPreco(5000,4500,3800);
        carroUm.exibeInformacoes();
        carroUm.exibeMaiorMenor();
    }



}