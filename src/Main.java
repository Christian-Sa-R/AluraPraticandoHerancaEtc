import exercicio1.*;
import exercicio2.*;
import exercicio3.*;
import exercicio4.*;
import exercicio5.*;
import exercicio6.*;
import exercicio7.*;
import exercicio8.*;
import exercicio9.*;
import exercicio10.*;

public static void main() {
    System.out.println("---------------------------Hello World---------------------------");

    Aluno Fernanda = new Aluno("Fernanda", "regular");
    Aluno Lucas = new Bolsista("Lucas");
    System.out.println(Fernanda);
    System.out.println(Lucas);

    System.out.println("-----------------------------------------------------------------");

    Pessoa julia = new Discente("Julia", 16, 8.5);
    Pessoa caio = new Discente("Caio", 17, 7.2);
    Pessoa marta = new Docente("Marta", 40, "Matematica");
    Pessoa roberto = new Docente("Roberto", 38, "Historia");
    System.out.println(julia);
    System.out.println(caio);
    System.out.println(marta);
    System.out.println(roberto);

    System.out.println("-----------------------------------------------------------------");

    List<Midia> midias = new ArrayList<>();
    midias.add(new Midia("FMA Brotherhood", 2009));
    midias.add(new Livro("O Guia do Mochileiro das Galáxias", 1979, "Dougals Adams"));
    midias.add(new Revista("National Geographic", 2023, 245));
    midias.add(new Ebook("Clean Code", 2008, "pdf"));
    for (Midia midia : midias) {
        System.out.println(midia.ficha());
    }

    System.out.println("-----------------------------------------------------------------");

    List<Notificacao> notificacoes = new ArrayList<>();
    notificacoes.add(new Email("email@exemplo", "Assunto de teste", "Mensagem aquiii"));
    notificacoes.add(new Sms("(91)99999-9999", "Outra mensagem aquiii"));
    notificacoes.add(new Push("Usuario", "Assunto de teste para push", "Mensagem por push"));
    for (Notificacao notificacao : notificacoes) {
        System.out.println(notificacao.enviar());
    }

    System.out.println("-----------------------------------------------------------------");

    List<Pagamento> pagamentos = new ArrayList<>();
    pagamentos.add(new CartaoCredito(250));
    pagamentos.add(new BoletoBancario(500));
    pagamentos.add(new Pix(300));
    for (Pagamento pagamento : pagamentos) {
        System.out.println(pagamento.realizarPagamento());
    }

    System.out.println("-----------------------------------------------------------------");

    Mensagem mensagem = new Mensagem();
    System.out.println(mensagem.enviarMensagem("Mensagem enviada para todos", false));
    System.out.println(mensagem.enviarMensagem("Mensagem IMPORTANTE enviada para todos", true));
    System.out.println(mensagem.enviarMensagem("Sant", "Mensagem enviada para Sant", false));
    System.out.println(mensagem.enviarMensagem("Marcelo D2", "Mensagem IMPORTANTE enviada para Marcelo D2", true));

    System.out.println("-----------------------------------------------------------------");

    Reserva reserva = new Reserva();
    Reserva reservaVip = new ReservaVip();
    System.out.println(reserva.reservar());
    System.out.println(reserva.reservar("12/07"));
    System.out.println(reserva.reservar("31/12", 20));
    System.out.println(reservaVip.reservar());

    System.out.println("-----------------------------------------------------------------");

    Relatorio relatorio = new Relatorio("RELAÓRIO IMPORTANTE", "teste teste teste teste");
    System.out.println(relatorio.imprimir());

    System.out.println("-----------------------------------------------------------------");

    OperacaoBancaria deposito = new Deposito(200.0);
    OperacaoBancaria saque = new Saque(50.5);
    System.out.println(deposito.executar());
    System.out.println(saque.executar());

    System.out.println("-----------------------------------------------------------------");

    Luz luz = new Luz();
    ArCondicionado ar = new ArCondicionado();

    System.out.println(luz.ligar());
    System.out.println(luz.ligar());
    System.out.println(luz.desligar());
    System.out.println(ar.desligar());
}