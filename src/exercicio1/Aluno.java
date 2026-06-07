package exercicio1;

public class Aluno {
    protected String nome;
    protected String tipo;

    public Aluno(String nome, String tipo) {
        this.nome = nome;
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getTipo() {
        return tipo;
    }

    @Override
    public String toString() {
        return "Exercicio1.Aluno: %s - Tipo: %s".formatted(nome, tipo);
    }
}
