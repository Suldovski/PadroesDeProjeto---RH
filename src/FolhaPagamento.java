public class FolhaPagamento {

    private Pagavel funcionario;

    public FolhaPagamento(Pagavel funcionario) {
        this.funcionario = funcionario;
    }

    public void processarPagamento(){
        try{
            double salario = funcionario.calcularSalario();

            if (salario < 0) {
                throw new IllegalArgumentException("Salário não pode ser negativo.");
            }
            System.out.printf("Pagamento processado: R$ %.2f%n", salario);

        } catch (Exception e) {
            System.err.println("Erro ao processar pagamento: " + e.getMessage());
        }
    }
}
