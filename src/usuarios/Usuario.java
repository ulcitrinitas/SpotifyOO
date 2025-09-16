package usuarios;

import musicas.Musica;

import java.security.MessageDigest;
import java.time.Instant;
import java.util.UUID;

public class Usuario {

    String nome;
    String email;
    String senha;
    String cpf;
    String id;
    String username;
    boolean pagante;
    Plano plano;

    public Usuario(String nome, String email, String senha, String username) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.username = username;

        this.pagante = false;
        this.plano = Plano.Gratuito;

        this.cpf = "";

        var id = UUID.randomUUID().toString();
        this.id = id;

        this.username = username + "@" + id.substring(id.length() - 6);
    }

    void tocarMusica(Musica m){
        System.out.println("Tocando " + m.getNome() + "....");
    }

    public double precoCalculo(){

        double valor = 22.99;
        double desconto = valor * (40.0 / 100);

        switch (this.plano){
            case Premium:
                return valor;
            case Universitario:
                return valor - desconto;
            case Duo:
                return valor;
            case Familia:
                return valor * 2;
            default:
                return 0;
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getId() {
        return id;
    }

    public void setId() {
        id = UUID.randomUUID().toString();

        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public boolean isPagante() {
        return pagante;
    }

    public void setPagante(boolean pagante) {
        this.pagante = pagante;
    }

    public Plano getPlano() {
        return plano;
    }

    public void setPlano(Plano plano) {
        this.plano = plano;
    }


}
