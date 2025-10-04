package Atividade02;

import java.util.Scanner;

public class Perguntas {
    public void aplicar(Pessoa pessoa) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Telefonou para a vitima? ");
        if (sc.next().equalsIgnoreCase("sim")) pessoa.adicionarRespostaSim();
        System.out.println("Esteve no local do crime? ");
        if (sc.next().equalsIgnoreCase("sim")) pessoa.adicionarRespostaSim();
        System.out.println("Mora perto da vitima? ");
        if (sc.next().equalsIgnoreCase("sim")) pessoa.adicionarRespostaSim();
        System.out.println("Tinha dividas com a vitima? ");
        if (sc.next().equalsIgnoreCase("sim")) pessoa.adicionarRespostaSim();
        System.out.println("ja trabalhou? ");
        if (sc.next().equalsIgnoreCase("sim")) pessoa.adicionarRespostaSim();
    }

}
