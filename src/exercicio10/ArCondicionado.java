package exercicio10;

public class ArCondicionado implements Controlavel{
    private boolean ligado = false;

    @Override
    public String desligar() {
        if(ligado){
            ligado = false;
            return "Desligando ar-condicionado...";
        } else {
            return "Ar-condicionado já está desligado";
        }
    }

    @Override
    public String ligar() {
        if(ligado){
            return "Ar-condicionado já está ligado";
        } else {
            ligado = true;
            return "Ligando ar-condicionado...";
        }
    }
}
