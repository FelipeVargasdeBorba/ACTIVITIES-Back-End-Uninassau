package Attividade03;

public class Produto {

    private String nome;
    private double preco;
    private int quantidade;
    private String codigoBarras;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome.toUpperCase();
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if (preco >= 0){
            this.preco = preco;
        }else{
            System.out.println("Preço Inválido!");
        }
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        if (quantidade >= 0) {
            this.quantidade = quantidade;
        }else{
            this.quantidade = 0;
        }
    }

    public String getCodigoBarras() {
        return codigoBarras;
    }

    public void setCodigoBarras(String codigoBarras) {
        if (codigoBarras.length() == 13) {
            this.codigoBarras = codigoBarras;
        }else{
            System.out.println("Codigo de barras inválido");
        }
    }

    public void mostrar(){
        System.out.println("Nome: " +nome);
        System.out.println("Preço: " +preco);
        System.out.println("Quantidade: " +quantidade);
        System.out.println("Código de Barras: " +codigoBarras);
    }
}
