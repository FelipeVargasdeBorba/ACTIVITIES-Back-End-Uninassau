package prova02;

public class Estagiario extends Funcionario{

    private final double cargaHoraria;

    public Estagiario(String nome, String matricula, double salarioBase, int cargaHoraria){
        super(nome, matricula, salarioBase);
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public double calcularSalarioLiquido() {
        return salarioBase * (cargaHoraria/40);
    }
}
