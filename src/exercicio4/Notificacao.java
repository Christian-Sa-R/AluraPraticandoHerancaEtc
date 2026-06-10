package exercicio4;

public class Notificacao {
    protected String destinatario;
    protected String mensagem;

    public Notificacao (String destinatario, String mensagem) {
        this.destinatario = destinatario;
        this.mensagem = mensagem;
    }

    public String enviar() {
        return """
                Notificação enviada para %s
                Conteúdo: %s
                """.formatted(destinatario, mensagem);
    }
}
