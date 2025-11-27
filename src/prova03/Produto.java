package prova03;

public abstract class Produto {

    private String nome;
    private double precoBase;

    public Produto(String nome, double precoBase) {
        this.nome = nome;
        this.precoBase = precoBase;
    }

    public double getPrecoBase() {
        return precoBase;
    }

    public String getNome() {
        return nome;
    }

    public abstract double calcularPrecoFinal();
    public abstract String exibirInfo();

}
