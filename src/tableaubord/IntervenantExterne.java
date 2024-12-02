package tableaubord;

public class IntervenantExterne extends Intervenant{
    private String specialite;
    private String adresse;
    private String tel;
    
    public IntervenantExterne(String nom, String prenom, String specialite,String adresse, String tel) { 
        super(nom, prenom);
        this.specialite = specialite;
        this.adresse = adresse;
        this.tel = tel;
    }

    public String getOrganisme() {
        return specialite;
    }

    @Override
    public String toString() {
        return "IntervenantExterne{" + "specialite=" + specialite + 
        ", adresse=" + adresse + ", tel=" + tel + '}';
    }


    @Override
    public boolean isExterne() {
        return true;
    }
    
}
