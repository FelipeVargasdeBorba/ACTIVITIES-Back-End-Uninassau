package prova01;

public class Caminhao extends Veiculo {
    private double capacidadeDeCarga;

    public Caminhao(String marca, String modelo, int ano, double capacidadeDeCarga) {
        super(marca, modelo, ano, 350.00);
        this.capacidadeDeCarga = capacidadeDeCarga;
    }

    @Override
    public double calcularValorLocacao() {
        return getValorDiaria();
    }

    @Override
    public String exibirDados() {
        return super.exibirDados() + "\n" + "Capacidade de carga (em toneladas): " + capacidadeDeCarga;
    }
}
