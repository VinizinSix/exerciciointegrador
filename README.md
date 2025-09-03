# exerciciointegrador

# Sistema de Funcionários – Java


Projeto em Java que demonstra **herança, classes abstratas, interfaces e polimorfismo** através de um sistema simples de gerenciamento de funcionários.

---

## Estrutura do Projeto

O projeto contém as seguintes classes:

- **Funcionario.java** – Classe abstrata com atributos `nome`, `cpf` e `salario`. Possui método abstrato `calcularSalarioTotal()`.
- **Bonificavel.java** – Interface com o método `calcularBonus()`.
- **Gerente.java** – Herda `Funcionario` e implementa `Bonificavel`. Atributo `numeroSubordinados` e método `atribuirTarefa()`.
- **Estagiario.java** – Herda `Funcionario` e implementa `Bonificavel`. Atributos `instituicaoEnsino` e `horasEstagio`, método `registrarHoras()`.
- **TesteFuncionarios.java** – Programa principal que cria objetos e demonstra polimorfismo.

---

## Funcionalidades

1. Criação de **Gerente** e **Estagiário**.  
2. Cálculo do **salário total**, incluindo bônus.  
3. Demonstração de **polimorfismo** com arrays de `Funcionario` e `Bonificavel`.  
4. Métodos específicos:
   - `Gerente.atribuirTarefa(String tarefa)`  
   - `Estagiario.registrarHoras(int horas)`  


