package produtocompradosexpt2;

// 6- Crie uma interface Vendavel com métodos para calcular o preço total de um produto com
//base na quantidade comprada e aplicar descontos. Implemente essa interface nas
//classes Produto e Servico, cada uma fornecendo a sua própria lógica de cálculo de preço.

public class Principal {
    public static void main(String[] args) {
        Produto produtoUm = new Produto();
        Produto produtoDois = new Produto();
        Produto produtoTres = new Produto();

        Servico servicoUm = new Servico();


        produtoUm.precoTotal(6,10,5);
        produtoDois.precoTotal(2,15,5);
        produtoTres.precoTotal(0,10,5);

        servicoUm.precoTotal(2,250,50);



    }
}
