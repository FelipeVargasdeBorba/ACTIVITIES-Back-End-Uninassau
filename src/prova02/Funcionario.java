package prova02;

public abstract class Funcionario {

    protected String nome;
    protected String matricula;
    protected double salarioBase;

    public Funcionario(String nome, String matricula, double salarioBase){
        this.nome = nome;
        this.matricula = matricula;
        this.salarioBase = salarioBase;
    }

    public abstract double calcularSalarioLiquido();

    public void exibirDados(){
        System.out.println("Dados do Funcionário: ");
        System.out.println(nome + " - " + matricula);
        System.out.println("Salário Base: R$ "+salarioBase);
        System.out.println("Salário Líquido: R$ "+calcularSalarioLiquido());

    }

}
