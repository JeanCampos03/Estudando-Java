package precoprodutoexpt2;

public class Livro implements Calculavel{
    @Override
    public double calcularPrecoFinal(double preco) {
        double desconto = preco * (10.0/100);
        preco -= desconto;
        return preco;
    }
}
