import java.util.Date;
import java.util.HashMap;

public class Musica {

    String nome;
    String author;
    String genre;
    double classificacao_total;
    HashMap<String, Double> classificacoes;
    long duracao;
    String lancamento;
    String letra;


    public Musica(String nome, String author, String genre, String duracao, String lancamento) {
        this.nome = nome;
        this.author = author;
        this.genre = genre;

        this.duracao = calculoDuracao(duracao);

        this.lancamento =  lancamento;
    }

    public long calculoDuracao(String tempo){
        var tempos = tempo.split(":");

        var min =  Long.parseLong(tempos[0]);
        var seg = Long.parseLong(tempos[1]);

        seg = seg + (min*60);

        return seg * 1000;
    }


    private double mediaClassificacao(double classi){
        double soma = 0;
        for(var c : classificacoes.values()){
            soma += c;
        }

        var media = soma / classificacoes.size();

        return media;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public long getDuracao() {
        return duracao;
    }

    public void setDuracao(String duracao) {
        this.duracao = calculoDuracao(duracao);
    }

    public String getLancamento() {
        return lancamento;
    }

    public void setLancamento(String lancamento) {
        this.lancamento = lancamento;
    }

    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }

    public double getClassificacao_total() {
        return classificacao_total;
    }

    public void setClassificacao_total(double classificacao_total) {
        this.classificacao_total = classificacao_total;
    }
}
