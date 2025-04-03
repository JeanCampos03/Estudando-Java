package tabuadamultiplicacaoexpt2;

public class TabuadaMultiplicacao implements Tabuada{
    @Override
    public void mostrarTabuada(int numero) {
        int i;
        int multiplicado;
        for (i = 1; i <= 10 ; i++) {
            multiplicado = numero * i;
            System.out.printf("%d x %d = %d %n",numero ,i, multiplicado);

        } System.out.println("------------\n");
    }
}
