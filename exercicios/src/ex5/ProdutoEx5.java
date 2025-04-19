package ex5;

import java.util.ArrayList;

/*
* 4- Crie uma classe Produto com propriedades como nome e preço.
* Em seguida, crie uma lista de produtos e utilize um loop para
* calcular e imprimir o preço médio dos produtos.
* */

public class ProdutoEx5 {
    private String nome;
    private float preco;

    public ProdutoEx5(String nome, float preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public float getPreco() {
        return preco;
    }
    public String toString () {
        return String.format("R$%.2f + ",preco);
    }


}
