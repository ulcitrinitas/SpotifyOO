package usuarios;

public class UsuarioPremium extends Usuario{
    public UsuarioPremium(String nome, String cpf, String email, String senha){
        super(nome, cpf, email, senha);

        this.pagante = true;
        this.plano = Plano.Gratuito;
    }



}
