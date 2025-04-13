package ex4;

public class ProdutoEx4 {
    private String nome;
    private double preco;
    private int quantidade;

    public ProdutoEx4 (String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String toString () {
        return "Informações do produto: \n" + "Nome: " + nome + "\nPreço: " + preco + "\nQuantidade: " + quantidade;
    }


}
