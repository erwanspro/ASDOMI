package tableaubord;

public abstract class Intervenant {
    protected String nom;
    protected String prenom;
    protected String email;

    public Intervenant(String nom, String prenom, String email) {
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
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

    public String afficherInfo() {
        return "Nom: " + nom + ", Prénom: " + prenom + ", Email: " + email;
    }
    
    @Override
    public String toString() {
        return "Intervenant [Nom: " + nom + ", Prénom: " + prenom + ", Email: " + email + "]";
    }
    
    public abstract boolean isExterne();
}
