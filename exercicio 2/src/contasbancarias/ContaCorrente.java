package contasbancarias;

public class ContaCorrente extends ContaBancaria{
    private float tarifaMensal;
    public void cobrarTarifaMensal(float tarifaMensal) {
        saldoConta -= tarifaMensal;
        System.out.println("Tarifa mensal de " + tarifaMensal + " cobrada. Saldo atual: " + saldoConta);
    }
}
