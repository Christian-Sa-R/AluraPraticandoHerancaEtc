package exercicio4;

public class Push extends Notificacao{
    protected String titulo;

    public Push (String destinatario, String titulo, String mensagem) {
        super(destinatario, mensagem);
        this.titulo = titulo;
    }

    @Override
    public String enviar() {
        return """
                Push enviado para: %s
                Titulo: %s
                Conteúdo: %s
                """.formatted(destinatario, titulo, mensagem);
    }
}
