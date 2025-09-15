import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Episodios extends Musica {

    HashMap<String, Double> votos;
    HashMap<String, String> comentarios;
    String descricao;

    Episodios(String nome, String author, String genre, String duracao, String lancamento) {
        super(nome, author, genre, duracao, lancamento);

        votos = new HashMap<String, Double>();
        comentarios = new HashMap<String, String>();
    }

    public void classificar(String username, Double voto){
        votos.put(nome, voto);
    }

    public double mostrarClassificacao(){

        double soma = 0.0;

        for(var val: votos.values()){
            soma += val;
        }

        return soma / votos.size();
    }

    public void comentar(String nome, String comentario){
        comentarios.put(nome, comentario);
    }

    public void mostrarComentarios(){
        for(Map.Entry<String, String> e: this.comentarios.entrySet()){
            System.out.println(e.getKey() + ": " + e.getValue());
        }
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
