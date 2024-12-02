package tableaubord;


public class Dossier {
    private String nature;
    private String jour;
    private String heure;
    private String personneEnCharge;
    private Prestation mesPrestations;

    public Dossier(String nature, String jour, String heure, String personneEnCharge) {
        this.nature = nature;
        this.jour = jour;
        this.heure = heure;
        this.personneEnCharge = personneEnCharge;
        this.mesPrestations = new Prestation();
    }
    
    
    
    
    
}
