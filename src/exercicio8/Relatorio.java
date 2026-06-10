package exercicio8;

public class Relatorio implements Imprimivel{
    private String tituloRelatorio;
    private String relatorio;

    public Relatorio (String tituloRelatorio, String relatorio) {
        this.tituloRelatorio = tituloRelatorio;
        this.relatorio = relatorio;
    }

    @Override
    public String imprimir() {
        return """
                ##########_%s_##########
                Conteúdo: %s
                """.formatted(tituloRelatorio, relatorio);
    }
}
