package exercicio2;

public class Discente extends Pessoa {
    protected double nota;

    public Discente(String nome, int idade, double nota) {
        super(nome, idade);
        this.nota = nota;
    }

    @Override
    public String toString() {
        return super.toString() + " - Nota: %.2f".formatted(nota);
    }
}
