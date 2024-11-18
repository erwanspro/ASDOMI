package tableaubord;

public class IntervenantExterne extends Intervenant{
    private String organisme;
    
    public IntervenantExterne(String nom, String prenom, String email, String organisme) {
        super(nom, prenom, email);
        this.organisme = organisme;
    }

    public String getOrganisme() {
        return organisme;
    }

    @Override
    public String toString() {
        return super.toString() + ", Organisme: " + organisme;
    }

    @Override
    public boolean isExterne() {
        return true;
    }
    
}
