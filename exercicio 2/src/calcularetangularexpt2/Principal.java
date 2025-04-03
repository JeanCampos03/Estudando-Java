package calcularetangularexpt2;

// 2- Crie uma classe CalculadoraSalaRetangular que implementa uma interface CalculoGeometrico
//com os métodos calcularArea() e calcularPerimetro() para calcular a área e o perímetro
//de uma sala retangular. A classe deve receber altura e largura como parâmetros.

public class Principal {
    public static void main (String[] args) {
        CalcularSalaRetangular salaUm = new CalcularSalaRetangular();
        CalcularSalaRetangular salaDois = new CalcularSalaRetangular();
        CalcularSalaRetangular salaTres = new CalcularSalaRetangular();

        System.out.println("Sala");salaUm.calcularArea(4,3);
        salaUm.calcularPerimetro(4,3);

        salaDois.calcularArea(5,10);
        salaDois.calcularPerimetro(5,10);

        salaTres.calcularArea(50,100);
        salaTres.calcularPerimetro(50,100);

    }
}
