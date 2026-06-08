package exercicio3;

public class Livro extends Midia{
    protected String autor;

    public Livro (String titulo, int anoPublicacao, String autor) {
        super(titulo, anoPublicacao);
        this.autor = autor;
    }
    @Override
    public String ficha() {
        return """
            Título: %s (LIB-%s)
            Autor: %s
            Ano: %d
            """.formatted(titulo, codigo(), autor, anoPublicacao);
    }
}
