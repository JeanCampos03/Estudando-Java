package carrosexpt1;

public class Carro {
    private String modelo;
    private float precoAno1;
    private float precoAno2;
    private float precoAno3;

    public void definirModelo(String modelo){
        this.modelo = modelo;
    }

    public void definirPreco(float precoAno1, float precoAno2, float precoAno3) {
      this.precoAno1 = precoAno1;
      this.precoAno2 = precoAno2;
      this.precoAno3 = precoAno3;
    }

    public void exibeInformacoes() {
        System.out.printf("""  
                Modelo: %s
                Preço ano 1: R$%.2f
                Preço ano 2: R$%.2f
                Preço ano 3: R$%.2f %n""", modelo, precoAno1, precoAno2, precoAno3
        );
    }

    public float defineMenorPreco() {
        float menorPreco = precoAno1;

        if (precoAno2 < menorPreco) {
            menorPreco = precoAno2;
        }

        if (precoAno3 < menorPreco) {
            menorPreco = precoAno3;
        }
            return menorPreco;
    }

    public float defineMaiorPreco() {
        float maiorPreco = precoAno1;

        if(precoAno2 > maiorPreco) {
            maiorPreco = precoAno2;
        }
        if(precoAno3 > maiorPreco) {
            maiorPreco = precoAno3;
        }
        return maiorPreco;
    }

    public void exibeMaiorMenor () {
        System.out.println("Menor preço é de: " + defineMenorPreco());
        System.out.println("Maior preço é de: " + defineMaiorPreco());
    }


}
