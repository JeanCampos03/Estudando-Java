package ex2.produtocompradosexpt2;

public class Produto implements Vendavel {
    @Override
    public void precoTotal(int quantidade, double preco, double desconto) {
        double precoProdutos;
        if (quantidade >= 5 ) {
            precoProdutos = quantidade * preco;
            double valorDesconto = precoProdutos * (desconto/100.0);
            precoProdutos -= valorDesconto;
            System.out.printf("""
                Valor: R$%.2f
                Quantidade: %d
                Desconto: %.0f%%
                
                """, precoProdutos, quantidade,desconto);

        } else if (quantidade > 0 ) {
            precoProdutos = quantidade * preco;
            System.out.printf("""
                Valor: R$%.2f
                Quantidade: %d
                Desconto se comprasse mais de 5 itens: %.0f%%
                
                """, precoProdutos, quantidade,desconto);

        } else {
            System.out.println("Não é possivel seguir! \n");

        }

}
}
