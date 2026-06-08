package exercicio3;

public class Revista extends Midia{
    protected int edicao;

    public Revista (String titulo, int anoPublicacao, int edicao) {
        super(titulo, anoPublicacao);
        this.edicao = edicao;
    }
    @Override
    public String ficha() {
        return """
            Título: %s (LIB-%s)
            Edição: %d
            Ano: %d
            """.formatted(titulo, codigo(), edicao, anoPublicacao);
    }
}
