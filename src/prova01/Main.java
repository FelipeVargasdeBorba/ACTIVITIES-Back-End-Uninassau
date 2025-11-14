package prova01;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Escolha o tipo de veículo:");
        System.out.println("1 - Carro");
        System.out.println("2 - Moto");
        System.out.println("3 - Caminhão");
        System.out.print("> ");

        int tipoVeiculo = scan.nextInt();
        scan.nextLine();

        String marca, modelo;
        int ano, diasDeLocacao;

        System.out.print("Marca: ");
        marca = scan.nextLine();
        System.out.print("Modelo: ");
        modelo = scan.nextLine();
        System.out.print("Ano: ");
        ano = scan.nextInt();
        System.out.print("Dias de locação: ");
        diasDeLocacao = scan.nextInt();
        scan.nextLine();

        Veiculo veiculo = null;

        switch (tipoVeiculo) {
            case 1:
                System.out.print("Quantidade de portas: ");
                int portas = scan.nextInt();
                veiculo = new Carro(marca, modelo, ano, portas);
                break;
            case 2:
                System.out.print("Cilindradas: ");
                int cilindradas = scan.nextInt();
                veiculo = new Moto(marca, modelo, ano, cilindradas);
                break;
            case 3:
                System.out.print("Capacidade de carga (em toneladas): ");
                double carga = scan.nextDouble();
                veiculo = new Caminhao(marca, modelo, ano, carga);
                break;
            default:
                System.out.println("Tipo de veículo inválido.");
                return;
        }

        System.out.println("\nResumo da Locação:");
        System.out.println(veiculo.exibirDados());

        double valorDiaria = veiculo.calcularValorLocacao();
        double valorTotal = valorDiaria * diasDeLocacao;

        System.out.println("Dias de locação: " + diasDeLocacao);
        System.out.println("Valor da diária (R$): " + valorDiaria);
        System.out.println("Valor Total (R$): " + valorTotal);

        scan.close();
    }
}
