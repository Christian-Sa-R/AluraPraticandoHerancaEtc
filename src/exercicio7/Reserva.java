package exercicio7;

public class Reserva {
    public String reservar() {
        return "Reserva realizada";
    }
    public String reservar(String data) {
        return "Reserva realizada para o dia %s".formatted(data);
    }
    public String reservar(String data, int quantidade) {
        return "Reserva realizada para o dia %s para %d pessoas".formatted(data, quantidade);
    }
}
