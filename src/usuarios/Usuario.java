package usuarios;

import java.security.MessageDigest;
import java.util.UUID;

public class Usuario {

    String nome;
    String email;
    String senha;
    String cpf;
    String id;
    String username;

    public Usuario(String nome, String email, String senha, String username) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.username = username;

        this.cpf = "";

        var idHash = UUID.randomUUID().toString();
        this.id = idHash;
    }


}
