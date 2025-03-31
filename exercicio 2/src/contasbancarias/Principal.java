package contasbancarias;

public class Principal {
    public static void main (String [] args) {
        ContaBancaria contaUm = new ContaBancaria();

        contaUm.depositoNaConta(100);
        contaUm.consultarSaldo();
        contaUm.saqueDaConta(50);
        contaUm.consultarSaldo();
        System.out.println("----------------------------");

        ContaCorrente contaDois = new ContaCorrente();
        contaDois.depositoNaConta(1000);
        contaDois.consultarSaldo();
        contaDois.saqueDaConta(100);
        contaDois.consultarSaldo();
        contaDois.cobrarTarifaMensal(25);
        contaDois.consultarSaldo();
        System.out.println("----------------------------");




    }
}
