package ex1.contasbancariasexpt1;

// 3. Crie uma classe ContaBancaria com métodos para realizar operações bancárias como depositar(), sacar()
//e consultarSaldo(). Em seguida, crie uma subclasse ContaCorrente que herda da classe ContaBancaria.
//Adicione um metodo específico para a subclasse, como cobrarTarifaMensal(), que desconta uma tarifa mensal
//da conta corrente.

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
