package usuarios;

import musicas.Musica;

public class UsuarioGrat extends Usuario{

    UsuarioGrat(String nome, String cpf, String email, String senha ) {
        super(nome, cpf, email, senha);

        this.pagante = false;
        this.plano = Plano.Gratuito;

        this.getId();
    }

    @Override
    void tocarMusica(Musica m){
        System.out.println("Tocando " + m.getNome() + "....");
        this.tocarAnuncio();
        System.out.println("Tocando " + m.getNome() + "....");
    }

    void tocarAnuncio(){
        System.out.println("Tocando Aunucio....");
    }

}
