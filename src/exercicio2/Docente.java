package exercicio2;

public class Docente extends Pessoa {
    protected String disciplina;

    public Docente(String nome, int idade, String disciplina) {
        super(nome, idade);
        this.disciplina = disciplina;
    }

    @Override
    public String toString() {
        return super.toString() + " - Disciplina: %s".formatted(disciplina);
    }
}
