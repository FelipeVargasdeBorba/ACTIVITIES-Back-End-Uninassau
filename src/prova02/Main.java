package prova02;

import java.awt.*;
import java.util.Scanner;

public class Main {

    static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("----------------------------");
        System.out.println("TechPay - Folha de Pagamento");
        System.out.println("----------------------------");

        System.out.println("Nome do funcionario: ");
        String nome = scan.nextLine();

        System.out.println("Matricula: ");
        String matricula = scan.nextLine();

        System.out.println("Salario Base: ");
        double salarioBase = scan.nextDouble();

        System.out.println("Tipo de Funcionario");
        System.out.println("1 - Gerente");
        System.out.println("2 - Desenvolvedor");
        System.out.println("3 - Estagiário");
        System.out.println("> ");
        int opcao = scan.nextInt();
        scan.nextLine();

        Funcionario fshow = null;

        switch (opcao){
            case 1 -> {
                System.out.println("Informe o bônus: ");
                double bonus = scan.nextDouble();
                fshow = new Gerente(nome, matricula, salarioBase, bonus);
            }
            case 2 -> {
                System.out.println("Informe o nível: ");
                String nivel = scan.nextLine();
                fshow = new Desenvolvedor(nome, matricula, salarioBase, nivel);
            }
            case 3 -> {
                System.out.println("Informe a carga horária:");
                int cargaHoraria = scan.nextInt();
                fshow = new Estagiario(nome, matricula, salarioBase, cargaHoraria);
            }
            default -> {
                System.out.println("Opção Inválida!");
                System.exit(0);
            }
        }
        fshow.exibirDados();

        scan.close();

    }

}
