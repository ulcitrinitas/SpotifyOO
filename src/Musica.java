import java.util.Date;

public class Musica {

    String nome;
    String author;
    String genre;
    double classificacao;
    long duracao;
    Date lançamento;
    String letra;

    public Musica(String nome, String author, String genre, String duracao) {
        this.nome = nome;
        this.author = author;
        this.genre = genre;

        this.duracao = calculoDuracao(duracao);

    }

    public long calculoDuracao(String tempo){
        var tempos = tempo.split(":");

        var min =  Long.parseLong(tempos[0]);
        var seg = Long.parseLong(tempos[1]);

        seg = seg + (min*60);

        return seg * 1000;
    }
}
