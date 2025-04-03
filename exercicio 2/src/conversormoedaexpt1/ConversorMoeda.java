package conversormoedaexpt1;

public class ConversorMoeda implements ConversorFinanceira{


    @Override
    public void converterDolarParaReal(double dolar) {
        double cotacaoAtual = 5.88;
        double convertidoParaReais = dolar * cotacaoAtual;
        System.out.printf("Considerando a cotação atual R$%.2f: %n$%.2f  dolares é equivalente a R$%.2f reais.",
                cotacaoAtual, dolar, convertidoParaReais);

    }

}
