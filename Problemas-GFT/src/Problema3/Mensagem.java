package Problema3;

public class Mensagem {
    public static String[] tiposDeReacao = new String[]{"Curtir", "Coração", "Gargalhada", "Surpreso", "Triste", "Bravo"};

    private String texto;
    private String[] reacoes;

    public Mensagem() {

    }

    public Mensagem(String texto, String[] reacoes) {
        this.texto = texto;
        this.reacoes = reacoes;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public String[] getReacoes() {
        return reacoes;
    }

    public void setReacoes(String[] reacoes) {
        this.reacoes = reacoes;
    }

    @Override
    public String toString() {
        String str = texto + "(";
        for (String s: reacoes) {
            str += s + ",";
        }
        str = str + ")";
        return str;
    }
}
