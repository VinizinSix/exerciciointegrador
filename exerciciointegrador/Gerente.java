public class Gerente extends Funcionario implements Bonificavel {
    private int numeroSubordinados;

    public Gerente(String nome, String cpf, double salario, int numeroSubordinados) {
        super(nome, cpf, salario);
        this.numeroSubordinados = numeroSubordinados;
    }

    @Override
    public double calcularSalarioTotal() {
        return salario + calcularBonus();
    }

    @Override
    public double calcularBonus() {
        return salario * 0.2 + numeroSubordinados * 100;
    }

    public void atribuirTarefa(String tarefa) {
        System.out.println("Gerente " + nome + " atribuindo tarefa: " + tarefa);
    }
}