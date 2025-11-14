package prova01;

public abstract class Veiculo {
    private String marca;
    private String modelo;
    private int ano;
    private double valorDiaria;

    public Veiculo(String marca, String modelo, int ano, double valorDiaria) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.valorDiaria = valorDiaria;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAno() {
        return ano;
    }

    public double getValorDiaria() {
        return valorDiaria;
    }

    public String exibirDados() {
        return "Marca: " + marca + "\n"
                + "Modelo: " + modelo + "\n"
                + "Ano: " + ano;
    }

    public abstract double calcularValorLocacao();
}
