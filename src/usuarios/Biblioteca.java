package usuarios;

import musicas.*;

import java.util.ArrayList;

public class Biblioteca {

    Usuario user;

    ArrayList<Musica> musicas;
    ArrayList<Podcast> podcasts;
    ArrayList<Playlist> playlists;
    ArrayList<Audiolivro>  audiolivros;

    public Biblioteca(Usuario user) {
        this.user = user;

        ArrayList<Musica> musicas = new ArrayList<>();
        ArrayList<Podcast> podcasts = new ArrayList<>();
        ArrayList<Playlist> playlists = new ArrayList<>();
        ArrayList<Audiolivro> audiolivros = new ArrayList<>();
    }

    public Usuario getUser() {
        return user;
    }

    public void setUser(Usuario user) {
        this.user = user;
    }

    public ArrayList<Musica> getMusicas() {
        return musicas;
    }

    public void setMusicas() {
        this.musicas = new  ArrayList<>();
    }

    public ArrayList<Podcast> getPodcasts() {
        return podcasts;
    }

    public void setPodcasts() {
        this.podcasts = new  ArrayList<>();
    }

    public ArrayList<Playlist> getPlaylists() {
        return playlists;
    }

    public void setPlaylists() {
        this.playlists = new  ArrayList<>();
    }

    public ArrayList<Audiolivro> getAudiolivros() {
        return audiolivros;
    }

    public void setAudiolivros() {
        this.audiolivros = new  ArrayList<>();
    }
}
