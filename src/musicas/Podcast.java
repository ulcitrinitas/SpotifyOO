package musicas;

import java.util.ArrayList;

public class Podcast {

    String id;
    String title;
    String artist;

    ArrayList<Episodio> episodios;

    public Podcast(String id, String title, String artist) {
        this.id = id;
        this.title = title;
        this.artist = artist;
    }

    public addEp(Episodio ep){
        episodios.add(ep);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public ArrayList<Episodio> getEpisodios() {
        return episodios;
    }

    public void setEpisodios() {
        this.episodios = new ArrayList<>();
    }
}
