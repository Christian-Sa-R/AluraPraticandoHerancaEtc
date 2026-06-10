package exercicio10;

public class Luz implements Controlavel{
    private boolean ligado = false;

    @Override
    public String desligar() {
        if(ligado){
            ligado = false;
            return "Desligando luz...";
        } else {
            return "Luz já está desligada";
        }
    }

    @Override
    public String ligar() {
        if(ligado){
            return "Luz já está ligada";
        } else {
            ligado = true;
            return "Ligando luz...";
        }
    }
}
