package prova03;

public class Vestuario extends Produto {
    private String tamanho;

    public Vestuario(String nome, double precoBase, String tamanho) {
        super(nome, precoBase);
        this.tamanho = tamanho;
    }

    @Override
    public double calcularPrecoFinal() {
        return getPrecoBase() * 0.90; // -10%
    }

    @Override
    public String exibirInfo() {
        return "Categoria: Vestuário (Tamanho " + tamanho + ")";
    }
}
