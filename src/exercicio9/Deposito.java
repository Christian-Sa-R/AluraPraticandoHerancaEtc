package exercicio9;

public class Deposito extends OperacaoBancaria{
    public Deposito(double valor) {
        super(valor);
    }

    @Override
    public String executar() {
        return "Depósito de R$%.2f realizado".formatted(valor);
    }
}
