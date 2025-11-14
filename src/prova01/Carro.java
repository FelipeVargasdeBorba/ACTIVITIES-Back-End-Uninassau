package prova01;

public class Carro extends Veiculo {
    private int quantidadeDePortas;

    public Carro(String marca, String modelo, int ano, int quantidadeDePortas) {
        super(marca, modelo, ano, 200.00);
        this.quantidadeDePortas = quantidadeDePortas;
    }

    @Override
    public double calcularValorLocacao() {
        return getValorDiaria();
    }

    @Override
    public String exibirDados() {
        return super.exibirDados()+ "\n" +"Quantidade de portas: " + quantidadeDePortas;
    }
}