package convertetemperaturaexpt2;

// 4- Crie uma interface ConversorTemperatura com os métodos celsiusParaFahrenheit() e fahrenheitParaCelsius().
//Implemente uma classe ConversorTemperaturaPadrao que implementa essa interface com as fórmulas de conversão
//e exibe os resultados.

public class Principal {
    public static void main(String[] args) {
        ConversorTemperaturaPadrao tempCelsiusParaFahreinheit = new ConversorTemperaturaPadrao();
        ConversorTemperaturaPadrao tempFahreinheitParaCelsius = new ConversorTemperaturaPadrao();


        tempCelsiusParaFahreinheit.celsiusParaFahrenheit(50);
        tempFahreinheitParaCelsius.fahrenheitParaCelsius(50);



    }
}
