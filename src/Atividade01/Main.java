package Atividade01;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pontos = 0;

        System.out.println("Digite os resultados das 10 partidas (V- Vitória D- Derrota E- Empate): ");

        for (int i = 1; i<= 10; i++){
            char resultado = sc.next().toUpperCase().charAt(0);

            switch (resultado){
                case 'V':
                    pontos += 10;
                    break;
                case 'D':
                    pontos -= 2;
                    break;
                case 'E':
                    pontos += 5;
                    break;
                default:
                    System.out.println("Entrada Inválida!!");
            }

        }

        System.out.println("Total de pontos: "+pontos);

        if (pontos>= 60){
            System.out.println("Você Subiu de Patente! Parabéns!");
        } else if (pontos >= 21) {
            System.out.println("Você Permanece na Patente Atual");
        }else{
            System.out.println("Você Caiu de Patente");
        }

    }
}