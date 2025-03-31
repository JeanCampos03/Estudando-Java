package contasbancarias;

public class ContaBancaria {
    protected float saldoConta;

    public void depositoNaConta (float deposito) {
        saldoConta += deposito;
        System.out.printf("Deposito realizado no valor de R$%.2f %n", saldoConta);
    }

    public void saqueDaConta(float sacar) {
        if (sacar <= saldoConta  ) {
            saldoConta -= sacar;
            System.out.printf("Saque efetuado de: R$%.2f %n", saldoConta);

        } else {
            System.out.println("Saldo indisponivel.");

        }


    }

    public void consultarSaldo () {
        System.out.printf("Saldo em conta:  R$%.2f %n", saldoConta);
    }
}
