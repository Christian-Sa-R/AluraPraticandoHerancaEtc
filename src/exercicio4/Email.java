package exercicio4;

public class Email extends Notificacao{
    protected String assunto;

    public Email (String destinatario, String assunto, String mensagem) {
        super(destinatario, mensagem);
        this.assunto = assunto;
    }

    @Override
    public String enviar() {
        return """
                Email enviado para: %s
                Assunto: %s
                Corpo: %s
                """.formatted(destinatario, assunto, mensagem);
    }
}
