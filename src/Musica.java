import java.util.Date;

public class Musica {

    String nome;
    String author;
    String genre;
    double classificacao;
    long duracao;
    Date lançamento;
    String letra;

    public Musica(String nome, String author, String genre, String duration) {
        this.nome = nome;
        this.author = author;
        this.genre = genre;
    }

}
