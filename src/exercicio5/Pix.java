package exercicio5;

public class Pix extends Pagamento{
    public Pix(double valor) {
        super(valor);
    }

    @Override
    public String realizarPagamento() {
        return "Pix de R$%.2f realizado com sucesso".formatted(valor);
    }
}
