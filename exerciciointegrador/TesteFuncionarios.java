public class TesteFuncionarios {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Ana Silva", "123.456.789-00", 5000, 10);
        Estagiario estagiario = new Estagiario("João Santos", "987.654.321-00", 1200, "UFRJ", 20);

        Funcionario[] funcionarios = {gerente, estagiario};
        for (Funcionario f : funcionarios) {
            System.out.println("Nome: " + f.nome);
            System.out.println("Salário base: R$ " + f.salario);
            System.out.println("Salário total: R$ " + f.calcularSalarioTotal());
            System.out.println("-------------------");
        }

        Bonificavel[] bonificaveis = {gerente, estagiario};
        for (Bonificavel b : bonificaveis) {
            System.out.println("Bônus: R$ " + b.calcularBonus());
        }

        gerente.atribuirTarefa("Revisar relatórios");
        estagiario.registrarHoras(5);
    }
}