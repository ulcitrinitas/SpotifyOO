import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;

public class EpPodcast extends Musica {

    HashMap<String, Double> votos;
    String descrição;

    EpPodcast(String nome, String author, String genre, String duracao, String lancamento) {
        super(nome, author, genre, duracao, lancamento);

        votos = new HashMap<String, Double>();
    }

    public void classificar(String username, Double voto){
        votos.put(nome, voto);
    }

    public void escreverDescricao(){

        try{
            var writter = new FileWriter(this.nome + ".txt");
            writter.write(this.descrição);
            writter.close();
        } catch (IOException e){
            e.printStackTrace();
            System.out.println("Erro!\nNão foi possível escrever o arquivo");
        }
    }

    public String getDescrição() {
        return descrição;
    }

    public void setDescrição(String descrição) {
        this.descrição = descrição;
    }
}
