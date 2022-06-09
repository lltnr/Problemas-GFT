package Problema3;

public class Problema3 {
    
    public static void main(String[] args) {
        Mensagem[] mensagens = new Mensagem[]{
            new Mensagem("User 1: oi, tudo bem?", new String[]{ Mensagem.tiposDeReacao[0]}),
            new MensagemImagem("http://gif.com/bomdia.gif"),
            new MensagemVideo("http://youtube.com/bomdia")
        };

        for (Mensagem m: mensagens) {
            System.out.println(m.toString());
        }
    }

}
