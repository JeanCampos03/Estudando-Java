package ex4;

public class ProdutoPerecivel extends ProdutoEx4 {
    private String dataValidade;

    public ProdutoPerecivel(String nome, double preco, int quantidade, String dataValidade) {
        super(nome, preco, quantidade);
        this.dataValidade = dataValidade;
    }

    public String toString() {
        return super.toString() + "\nData do produto: " + dataValidade;
    }
}
