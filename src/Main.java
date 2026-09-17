import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        
        ArrayList<Funcionario> funcionarios = new ArrayList<>();

        Funcionario f1 = FuncionarioFactory.criarFuncionario("CLT", "João", 3000.0);
        Funcionario f2 = FuncionarioFactory.criarFuncionario("PJ", "Maria", 4000.0);

        funcionarios.add(f1);
        funcionarios.add(f2);

        System.out.println("Lista de Funcionários:");
        for (Funcionario funcionario : funcionarios) {
            System.out.println("Nome: " + funcionario.getNome() + ", Salário: " + funcionario.calcularSalario());
        }

        System.out.println("\nProcessando Pagamentos:");
        for (Funcionario f : funcionarios) {
            FolhaPagamento folha = new FolhaPagamento(f);
            folha.processarPagamento();
        }

        System.out.println("\nTeste de exceção");
        try{
            Funcionario invalido = FuncionarioFactory.criarFuncionario("Estagiário", "Carlos", 1000.0);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro Capturado: " + e.getMessage());
        }
    }

}
