public class FuncionarioFactory {

    public static Funcionario criarFuncionario(String tipo, String nome, double salarioBase) {
        if (tipo.equalsIgnoreCase("CLT")) {
            return new FuncionarioCLT(nome, salarioBase);
        } else if (tipo.equalsIgnoreCase("PJ")) {
            return new FuncionarioPJ(nome, salarioBase);
        } else {
            throw new IllegalArgumentException("Tipo de funcionário inválido: " + tipo);
        }
    }
}
