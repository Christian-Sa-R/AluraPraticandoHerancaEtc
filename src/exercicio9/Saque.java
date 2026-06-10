package exercicio9;

public class Saque extends OperacaoBancaria{
    public Saque(double valor) {
        super(valor);
    }

    @Override
    public String executar() {
        return "Saque de R$%.2f realizado".formatted(valor);
    }
}
