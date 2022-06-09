package Problema3;

public class MensagemVideo extends Mensagem {
    private String link;

    public MensagemVideo(String link) {
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
