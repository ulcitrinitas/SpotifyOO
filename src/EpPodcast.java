import java.io.*;
import java.util.HashMap;
import java.util.Scanner;

public class EpPodcast extends Musica {

    HashMap<String, Double> votos;
    String descricao;

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
            writter.write(this.descricao);
            writter.close();
        } catch (IOException e){
            e.printStackTrace();
            System.out.println("Erro!\nNão foi possível escrever o arquivo");
        }
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String path) {

        var f = new File(path);

        String descricao = "";

        try(var scanner = new Scanner(f);){
            while(scanner.hasNextLine()){
                var line = scanner.nextLine();
                descricao += line + ' ';
            }
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("Erro!\nNão foi possível ler o arquivo");
        }


        this.descricao = descricao;
    }
}
