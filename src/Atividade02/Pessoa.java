package Atividade02;

public class Pessoa {

    private String nome;
    private static int respostaSim;

    public Pessoa(String nome){
        this.nome = nome;
        this.respostaSim = 0;
    }

    static void adicionarRespostaSim() {
        respostaSim++;
    }

    public String classificacao(){
        switch (respostaSim){
            case 2:
                return "Suspeita";
            case 3:
            case 4:
                return "Cumplice";
            case 5:
                return "Assassino";
            default:
                return "Inocente";
        }
    }

}
