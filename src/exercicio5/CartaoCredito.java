package exercicio5;

public class CartaoCredito extends Pagamento{
    public CartaoCredito(double valor) {
        super(valor);
    }

    @Override
    public double calcularTaxa () {
        return valor * 0.03;
    }

    @Override
    public String realizarPagamento() {
        return "Pagamento de R$%.2f confirmado no cartão de crédito (taxa: R$%.2f)".formatted(valor, calcularTaxa());
    }
}
