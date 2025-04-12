package ex3;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Pessoa pessoaUm = new Pessoa();
        Pessoa pessoaDois = new Pessoa();
        Pessoa pessoaTres = new Pessoa();

        pessoaUm.setNome("Lara");
        pessoaUm.setIdade(23);

        pessoaDois.setNome("Jean");
        pessoaDois.setIdade(22);

        pessoaTres.setNome("Pedro");
        pessoaTres.setIdade(21);


        ArrayList<Pessoa> listaDePessoas = new ArrayList<>();

        listaDePessoas.add(pessoaUm);
        listaDePessoas.add(pessoaDois);
        listaDePessoas.add(pessoaTres);

        System.out.println("Quantidade de pessoas: " + listaDePessoas.size());
        System.out.println("Primeira pessoa da lista: " + listaDePessoas.get(0));
        System.out.println("toString de Pessoa: " + listaDePessoas);
        System.out.println("Lista de pessoas:");
        for (Pessoa objetoCorrenteDePessoa : listaDePessoas) {
            System.out.println(objetoCorrenteDePessoa);
        }







    }
}
