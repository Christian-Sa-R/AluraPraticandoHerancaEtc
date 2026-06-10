package exercicio4;

public class Sms extends Notificacao{
    public Sms (String destinatario, String mensagem) {
        super(destinatario, mensagem);
    }

    @Override
    public String enviar() {
        return """
                SMS enviado para %s
                Mensagem: %s
                """.formatted(destinatario, mensagem);
    }
}
