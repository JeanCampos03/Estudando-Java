package ex1.carrosexpt1;

// 1. Crie uma classe Carro com métodos para representar um modelo específico
//ao longo de três anos. Implemente métodos para definir o nome do modelo,
//os preços médios para cada ano, e calcular e exibir o menor e o maior preço.
//Adicione uma subclasse ModeloCarro para criar instâncias específicas,
//utilizando-a na classe principal para definir preços e mostrar informações.

public class Principal {
    public static void main(String[] args) {
        ModeloCarro carroUm = new ModeloCarro();

        carroUm.definirModelo("Corsa");
        carroUm.definirPreco(5000,4500,3800);
        carroUm.exibeInformacoes();
        carroUm.exibeMaiorMenor();
    }



}