package prova02;

public class Gerente extends Funcionario{

    private double bonus;

    public Gerente(String nome, String matricula, double salarioBase, double bonus){
        super(nome, matricula, salarioBase);
        this.bonus = bonus;
    }

    @Override
    public double calcularSalarioLiquido() {
        return salarioBase + bonus;
    }

}
