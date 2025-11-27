package prova03;

public class Alimento extends Produto {
    private boolean perecivel;

    public Alimento(String nome, double precoBase, boolean perecivel) {
        super(nome, precoBase);
        this.perecivel = perecivel;
    }

    @Override
    public double calcularPrecoFinal() {
        if (perecivel) {
            return getPrecoBase() * 0.80; // -20%
        }
        return getPrecoBase();
    }

    @Override
    public String exibirInfo() {
        return perecivel ?
                "Categoria: Alimento (Perecível)" :
                "Categoria: Alimento (Não Perecível)";
    }
}

