package exercicio3;

public class Ebook extends Midia{
    protected String formato;

    public Ebook(String titulo, int anoPublicacao, String formato) {
        super(titulo, anoPublicacao);
        this.formato = formato;
    }
    @Override
    public String ficha() {
        return """
            Título: %s (LIB-%s)
            Formato: %s
            Ano: %d
            """.formatted(titulo, codigo(), formato, anoPublicacao);
    }
}
