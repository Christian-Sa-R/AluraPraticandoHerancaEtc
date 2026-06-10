package exercicio5;

public abstract class Pagamento {
    protected double valor;

    public Pagamento (double valor) {
        this.valor = valor;
    }

    public String realizarPagamento() {
        return "Forma de pagamento não especificada";
    }

    public double calcularTaxa () {
        return 0;
    }
}
