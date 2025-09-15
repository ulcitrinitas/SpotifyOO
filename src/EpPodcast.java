import java.util.HashMap;

public class EpPodcast extends Musica {

    HashMap<String, Double> votos;

    EpPodcast(String nome, String author, String genre, String duracao, String lancamento) {
        super(nome, author, genre, duracao, lancamento);

        votos = new HashMap<String, Double>();
    }

    public void classificar(String username, Double voto){
        votos.put(nome, voto);
    }

}
