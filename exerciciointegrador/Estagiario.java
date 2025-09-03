public class Estagiario extends Funcionario implements Bonificavel {
    private String instituicaoEnsino;
    private int horasEstagio;

    public Estagiario(String nome, String cpf, double salario, String instituicaoEnsino, int horasEstagio) {
        super(nome, cpf, salario);
        this.instituicaoEnsino = instituicaoEnsino;
        this.horasEstagio = horasEstagio;
    }

    @Override
    public double calcularSalarioTotal() {
        return salario + calcularBonus();
    }

    @Override
    public double calcularBonus() {
        return salario * 0.05 + horasEstagio * 10;
    }

    public void registrarHoras(int horas) {
        this.horasEstagio += horas;
        System.out.println("Estagiário " + nome + " registrou " + horas + " horas.");
    }
}