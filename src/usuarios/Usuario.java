package usuarios;

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
    String plano;

    public Usuario(String nome, String email, String senha, String username) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.username = username;

        this.pagante = false;
        this.plano = "Gratuito";

        this.cpf = "";

        var id = UUID.randomUUID().toString();
        this.id = id;

        this.username = username + "@" + id.substring(id.length()-6);



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

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }



}
