package ex4;


// 1. Crie uma classe Produto com atributos como nome, preco, e quantidade. Em seguida,
// crie uma lista de objetos Produto utilizando a classe ArrayList. Adicione alguns produtos,
// imprima o tamanho da lista e recupere um produto pelo índice.
//
// 2. Implemente o metodo toString() na classe Produto para retornar uma representação em texto
// do objeto. Em seguida, imprima a lista de produtos utilizando o metodo System.out.println().
//
// 3. Modifique a classe Produto para incluir um construtor que aceite parâmetros para inicializar
// os atributos. Em seguida, crie objetos Produto utilizando esse novo construtor.
//
// 4. Crie uma classe ProdutoPerecivel que herde de Produto. Adicione um atributo dataValidade e
// um construtor que utilize o construtor da classe mãe (super) para inicializar os atributos herdados.
// Crie um objeto ProdutoPerecivel e imprima seus valores.


import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        ProdutoEx4 produtoUm = new ProdutoEx4("Camiseta",25.90,3);
        ProdutoEx4 produtoDois = new ProdutoEx4("Bermuda",20.85,4);
        ProdutoEx4 produtoTres = new ProdutoEx4("Moletom",169.90,1);
        ProdutoEx4 produtoQuatro = new ProdutoEx4("Tênis",250.90,2);

        ProdutoPerecivel perecivelUm = new ProdutoPerecivel("Leite", 6,12,"05/05/2025" );



        ArrayList<ProdutoEx4> listaDeProdutos = new ArrayList<>();

        listaDeProdutos.add(produtoUm);
        listaDeProdutos.add(produtoDois);
        listaDeProdutos.add(produtoTres);
        listaDeProdutos.add(produtoQuatro);

        System.out.println("Tamnanho da lista " + listaDeProdutos.size());
        System.out.println("Produto na posição 0: \n" + listaDeProdutos.get(0));
        System.out.println("------------------------------------------------------------------------");

        System.out.println("Produto perecivel: \n" + perecivelUm);

    }
}
