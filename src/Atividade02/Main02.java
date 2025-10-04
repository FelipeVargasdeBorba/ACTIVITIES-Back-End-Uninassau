package Atividade02;

public class Main02 {
    static void main(String[] args) {
        Pessoa suspect = new Pessoa("Suspect");
        Perguntas questionario = new Perguntas();

        System.out.println("Questionario sobre o crime: ");
        questionario.aplicar(suspect);

        System.out.println("Decisão: "+suspect.classificacao());
    }
}