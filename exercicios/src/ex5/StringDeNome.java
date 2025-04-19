package ex5;
import java.util.ArrayList;

// 1. Crie um ArrayList de strings e utilize um loop foreach para percorrer e
//imprimir cada elemento da lista.

public class StringDeNome {
    public static void main(String[] args) {
        ArrayList<String> listaNomes = new ArrayList<>();

        listaNomes.add("Jean");
        listaNomes.add("Lara");
        listaNomes.add("Jacqueline");
        listaNomes.add("Matheus");
        listaNomes.add("José");
        listaNomes.add("Rosana");

        for(String percorreListaNomes: listaNomes) {
            System.out.println(percorreListaNomes);
        }


    }
}
