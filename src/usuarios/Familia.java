package usuarios;

import java.util.ArrayList;

public class Familia {

    FamiliaAdm adm;
    ArrayList<UsuarioPremium> familia;

    public Familia(){}

    public Familia(FamiliaAdm adm){
        this.adm = adm;

        familia = new ArrayList<UsuarioPremium>();
    }

    public FamiliaAdm getAdm() {
        return adm;
    }

    public void setAdm(FamiliaAdm adm) {
        this.adm = adm;
    }

    public ArrayList<UsuarioPremium> getFamilia() {
        return familia;
    }

    public void setFamilia(ArrayList<UsuarioPremium> familia) {
        this.familia = familia;
    }
}
