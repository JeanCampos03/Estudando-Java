package ex2.convertetemperaturaexpt2;

public class ConversorTemperaturaPadrao implements ConversorTemperatura {
    @Override
    public void celsiusParaFahrenheit(float celsius) {
        float fahreinheit = (celsius * 1.8f) + 32;
        System.out.printf("%.2f°C é igual a %.2f°F %n", celsius, fahreinheit);
    }

    @Override
    public void fahrenheitParaCelsius(float fahreinheit) {
        float celsius = (fahreinheit - 32) / 1.8f;
        System.out.printf("%.2f°F é igual a %.2f°C %n", fahreinheit,celsius );
    }
}
