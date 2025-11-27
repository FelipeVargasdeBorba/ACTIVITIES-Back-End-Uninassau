package prova03;

public class Eletronico extends Produto{
    private int garantiaMeses;

    public Eletronico(String nome, double precoBase, int garantiaMeses) {
        super(nome, precoBase);
        this.garantiaMeses = garantiaMeses;
    }

    @Override
    public double calcularPrecoFinal() {
        return getPrecoBase() * 1.15; // +15%
    }

    @Override
    public String exibirInfo() {
        return "Categoria: Eletrônico (" + garantiaMeses + " meses de garantia)";
    }

}
