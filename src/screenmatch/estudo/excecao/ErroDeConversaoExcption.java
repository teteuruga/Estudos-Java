package screenmatch.estudo.excecao;

public class ErroDeConversaoExcption extends RuntimeException{

    private String mensagem;
    public ErroDeConversaoExcption(String mensagem) {
        this.mensagem = mensagem;
    }

    public String getMensagem() {
        return this.mensagem;
    }
}
