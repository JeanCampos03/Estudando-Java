package ex2.calcularetangularexpt2;

public class CalcularSalaRetangular implements CalculoGeometrico{
    @Override
    public void calcularArea(int altura, int largura) {
        int area = (int)(largura * altura);
        System.out.printf("A área de uma sala de largura %d e altura %d é igual a %d %n", largura, altura, area);
    }

    @Override
    public void calcularPerimetro(int altura, int largura) {
        int perimetro = 2 * (largura + altura);
        System.out.printf("O perimetro de uma sala de largura %d e altura %d é igual a %d %n", largura, altura, perimetro);
        System.out.println("----------------------------------------------------------------------------------------------");
    }

}
