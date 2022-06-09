package Problema3;

public class MensagemImagem extends Mensagem {
    private String link;

    public MensagemImagem(String link) {
        this.link = link;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    @Override
    public String toString() {
        return link;
    }
}
