package precoprodutoexpt2;

public class ProdutoFisico implements Calculavel{
    @Override
    public double calcularPrecoFinal(double preco) {
        preco += 0.9f;
        return preco;
    }
}
