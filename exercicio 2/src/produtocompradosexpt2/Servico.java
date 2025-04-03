package produtocompradosexpt2;

public class Servico implements Vendavel{
        @Override
        public void precoTotal(int quantidade, double preco, double desconto) {
            double precoProdutos = quantidade * preco;

            precoProdutos -= desconto;
            System.out.printf("""
                Valor: R$%.2f
                Quantidade: %d
                Desconto: R$%.2f
                
                """, precoProdutos, quantidade,desconto);

        }
}

