package prova02;

public class Desenvolvedor extends Funcionario{

    private String nivel; //(Junior, Pleno ou Senior)

    public Desenvolvedor(String nome, String matricula, double salarioBase, String nivel){
        super(nome, matricula, salarioBase);
        this.nivel = nivel;
    }

    @Override
    public double calcularSalarioLiquido() {
        double experiencia = switch (nivel.toLowerCase()){
            case "junior" -> 1.1;
            case "pleno" -> 1.2;
            case "senior" -> 1.5;
            default -> 1.0;
        };

        return salarioBase * experiencia;
    }

    @Override
    public void exibirDados() {
        System.out.println("Dados do Desenvolvedor: ");
        System.out.println(nome + " - " + matricula);
        System.out.println("Nível: "+nivel);
        System.out.println("Salário Base: R$ "+salarioBase);
        System.out.println("Salário Líquido: R$ "+calcularSalarioLiquido());
    }
}
