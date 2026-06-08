package exercicio3;

public class Midia {
    protected String titulo;
    protected int anoPublicacao;

    public Midia (String titulo, int anoPublicacao) {
        this.titulo = titulo;
        this.anoPublicacao = anoPublicacao;
    }

    public String codigo() {
        StringBuilder codigo = new StringBuilder();
        for (char digito : titulo.toUpperCase().toCharArray()) {
            if (digito != ' ' && codigo.length() < 3) {
                codigo.append(digito);
            }
        }
        codigo.append(anoPublicacao);
        return String.valueOf(codigo);
    }

    public String ficha() {
        return """
                Título: %s (LIB-%s)
                Ano: %d
                """.formatted(titulo, codigo(), anoPublicacao);
    }
}
