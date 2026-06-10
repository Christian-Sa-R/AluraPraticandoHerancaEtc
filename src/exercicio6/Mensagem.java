package exercicio6;

public class Mensagem {
    public String enviarMensagem(String mensagem, boolean importante) {
        if (importante) {
            return """
                ***ATENÇÃO, IMPORTANTE***
                Mensagem enviada para todos:
                "%s"
                """.formatted(mensagem);
        } else {
            return """
                Mensagem enviada para todos:
                "%s"
                """.formatted(mensagem);
        }
    }
    public String enviarMensagem(String destinatario, String mensagem, boolean importante) {
        if (importante) {
            return """
                ***ATENÇÃO, IMPORTANTE***
                Mensagem enviada para %s:
                "%s"
                """.formatted(destinatario, mensagem);
        } else {
            return """
                Mensagem enviada para %s:
                "%s"
                """.formatted(destinatario, mensagem);
        }
    }
}
