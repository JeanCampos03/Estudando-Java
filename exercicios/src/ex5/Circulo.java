package ex5;

public class Circulo implements Forma{
    private float raio;
    private float pi = 3.14f;

    public Circulo(float raio) {
        this.raio = raio;
    }

    public float getRaio() {
        return raio;
    }

    public float calcularArea() {
        float area = 0;

       return area = pi * (raio * raio);
    }
}
