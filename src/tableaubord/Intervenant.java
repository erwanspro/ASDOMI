package tableaubord;

import java.util.ArrayList;

public abstract class Intervenant {
    protected String nom;
    protected String prenom;
    protected String email;
    private ArrayList<Prestation> lesPrestations;

    public Intervenant(String nom, String prenom, String email) {
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.lesPrestations = new ArrayList<>();
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getEmail() {
        return email;
    }
    
    public void ajoutePrestation(Prestation unePrestation) {
        lesPrestations.add(unePrestation);
    }
    
    @Override
    public String toString() {
        return "Intervenant [Nom: " + nom + ", Prénom: " + prenom + ", Email: " + email +
            ", Nombre de Prestations: " + lesPrestations.size() + "]";
    }
    
    public abstract boolean isExterne();
}
