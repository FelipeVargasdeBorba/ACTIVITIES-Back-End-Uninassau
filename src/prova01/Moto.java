package prova01;

public class Moto extends Veiculo {
    private int cilindradas;

    public Moto(String marca, String modelo, int ano, int cilindradas) {
        super(marca, modelo, ano, 120.00);
        this.cilindradas = cilindradas;
    }

    @Override
    public double calcularValorLocacao() {
        return getValorDiaria();
    }

    @Override
    public String exibirDados() {
        return super.exibirDados() + "\n" + "Cilindradas: " + cilindradas;
    }
}
