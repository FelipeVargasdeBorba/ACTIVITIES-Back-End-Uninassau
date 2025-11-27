package prova03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("**** ShopMaster - Sistema de Vendas ****");
        System.out.print("Nome do produto: ");
        String nome = sc.nextLine();

        System.out.print("Preço base: ");
        double precoBase = sc.nextDouble();

        System.out.println("\nTipo do produto:");
        System.out.println("1 - Eletrônico");
        System.out.println("2 - Vestuário");
        System.out.println("3 - Alimento");
        System.out.print("Escolha: ");
        int tipo = sc.nextInt();

        Produto produto = null;

        switch (tipo) {
            case 1:
                System.out.print("Garantia (meses): ");
                int garantia = sc.nextInt();
                produto = new Eletronico(nome, precoBase, garantia);
                break;

            case 2:
                System.out.print("Tamanho: ");
                sc.nextLine();
                String tamanho = sc.nextLine();
                produto = new Vestuario(nome, precoBase, tamanho);
                break;

            case 3:
                System.out.print("É perecível? (1-Sim / 0-Não): ");
                int perecivel = sc.nextInt();
                produto = new Alimento(nome, precoBase, perecivel == 1);
                break;

            default:
                System.out.println("Opção inválida!");
                System.exit(0);
        }

        System.out.println("\nResumo da Compra:");
        System.out.println("Produto: " + produto.getNome());
        System.out.println(produto.exibirInfo());
        System.out.printf("Preço base: R$ %.2f\n", produto.getPrecoBase());
        System.out.printf("Preço final (com desconto): R$ %.2f\n", produto.calcularPrecoFinal());

        sc.close();
    }
}

