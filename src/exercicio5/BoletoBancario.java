package exercicio5;

public class BoletoBancario extends Pagamento{
    public BoletoBancario(double valor) {
        super(valor);
    }

    @Override
    public double calcularTaxa () {
        return valor * 0.01;
    }

    @Override
    public String realizarPagamento() {
        return "Boleto de R$%.2f gerado com sucesso (taxa: R$%.2f)".formatted(valor, calcularTaxa());
    }
}
