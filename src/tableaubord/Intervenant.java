package tableaubord;

import java.util.ArrayList;

public abstract class Intervenant {
    protected String nom;
    protected String prenom;
    private ArrayList<Prestation> lesPrestations;

    public Intervenant(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
        this.lesPrestations = new ArrayList<>();
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }
    
    public void ajoutePrestation(Prestation unePrestation) {
        lesPrestations.add(unePrestation);
    }
    
    @Override
    public String toString() {
        return "Intervenant [Nom: " + nom + ", Prénom: " + prenom +
            ", Nombre de Prestations: " + lesPrestations.size() + "]";
    }
    
    public abstract boolean isExterne();
}
