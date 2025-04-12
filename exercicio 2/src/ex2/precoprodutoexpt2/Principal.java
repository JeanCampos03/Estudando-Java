package ex2.precoprodutoexpt2;

// 5- Crie uma interface Calculavel com um metodo double calcularPrecoFinal().
//Implemente essa interface nas classes Livro e ProdutoFisico, cada uma retornando
//o preçofinal considerando descontos ou taxas adicionais.

public class Principal {
    public static void main(String[] args) {
        Livro livroUm = new  Livro();
        ProdutoFisico produtoUm = new ProdutoFisico();

        System.out.println("Preço final do livro: " + livroUm.calcularPrecoFinal(45));

        System.out.println("Preço final do produto: " + produtoUm.calcularPrecoFinal(100));

    }
}
