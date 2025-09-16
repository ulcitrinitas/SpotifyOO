package usuarios;

public class FamiliaAdm extends Usuario {

    public FamiliaAdm(String nombre, String apellido, String email, String telefone) {
        super(nombre, apellido, email, telefone);

        this.plano = Plano.Familia;
        this.pagante = true;

        this.getId();
    }
}
