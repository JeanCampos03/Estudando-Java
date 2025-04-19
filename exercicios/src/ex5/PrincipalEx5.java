package ex5;

import java.util.ArrayList;

// 2. Crie uma classe Animal e uma classe Cachorro que herda de Animal.
//Em seguida, crie um objeto da classe Cachorro e faça o casting
//para a classe Animal.


public class PrincipalEx5 {
    public static void main(String[] args) {


        CachorroEx5 cachorroUm = new CachorroEx5();

                //Exercicio fazendo upcasting: converter de uma subclasse para a superclasse.
        AnimalEx5 animalUm = cachorroUm;



//        3- Modifique o Exercício 2 para incluir uma verificação usando
//        instanceof para garantir que o objeto seja do tipo correto
//        antes de fazer o casting.

        // Verificando se meuAnimal é uma instância de Cachorro
        if (animalUm instanceof CachorroEx5) {
            //Fazendo downcasting: converte um objeto de uma superclasse para uma subclasse.
            CachorroEx5 cachorroDois = (CachorroEx5) animalUm;
            System.out.println("É um cachorro!");
        } else {
            System.out.println("Não é um cachorro.");
        }

        ProdutoEx5 produto1 = new ProdutoEx5("Camiseta",25);
        ProdutoEx5 produto2 = new ProdutoEx5("Moletom",300);
        ProdutoEx5 produto3 = new ProdutoEx5("Bermuda",35);
        ProdutoEx5 produto4 = new ProdutoEx5("Calça",180);

        ArrayList<ProdutoEx5> listaDeProdutos = new ArrayList<>();

        listaDeProdutos.add(produto1);
        listaDeProdutos.add(produto2);
        listaDeProdutos.add(produto3);
        listaDeProdutos.add(produto4);

        float totalPrecos = 0;

        for( ProdutoEx5 percorreListaDeProdutos : listaDeProdutos) {
            totalPrecos += percorreListaDeProdutos.getPreco();

        } System.out.println("Total dos preços é de: \n" + listaDeProdutos.get(0) + listaDeProdutos.get(1) +
                listaDeProdutos.get(2) + listaDeProdutos.get(3));

        System.out.printf("Soma total dos produtos: R$%.2f %n", totalPrecos);
        float media = totalPrecos / listaDeProdutos.size();
        System.out.printf("Média dos produtos: R$%.2f %n", media);


        Circulo circuloUm = new Circulo(5);
        Quadrado quadradoUm = new Quadrado(4);
        Circulo circuloDois = new Circulo(10);
        Quadrado quadradoDois = new Quadrado(8);
        Circulo circuloTres = new Circulo(15);
        Quadrado quadradoTres = new Quadrado(9);



        ArrayList<Forma> listaDeFormas = new ArrayList<>();
        listaDeFormas.add(circuloUm);
        listaDeFormas.add(quadradoUm);
        listaDeFormas.add(circuloDois);
        listaDeFormas.add(quadradoDois);
        listaDeFormas.add(circuloTres);
        listaDeFormas.add(quadradoTres);

        int linha = 0;
        for (Forma percorreListaFormas: listaDeFormas) {
            System.out.println( linha + "- Áreas: " + percorreListaFormas.calcularArea());
            linha++;

        }








    }
}
