import exercicio1.Aluno;
import exercicio1.Bolsista;
import exercicio2.Discente;
import exercicio2.Docente;
import exercicio2.Pessoa;

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
}