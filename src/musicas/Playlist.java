package musicas;

import java.util.ArrayList;

public class Playlist {

    ArrayList<Musica> musicas;

    public Playlist() {
        musicas = new ArrayList<>();
    }

    public void addMusica(Musica m) {
        this.musicas.add(m);
    }

    public ArrayList<Musica> getMusicas() {
        return this.musicas;
    }

    public void setMusicas() {
        this.musicas = new ArrayList<>();
    }
}
