package musicas;

public class Audiolivro extends Musica {

    String descricao;

    Audiolivro(String nome, String author, String genre, String duracao, String lancamento) {
        super(nome, author, genre, duracao, lancamento);
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

}
