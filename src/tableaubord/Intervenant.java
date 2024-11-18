package tableaubord;

public class Intervenant {
    private String nom;
    private String prenom;
    private String email;

    // Constructeur
    public Intervenant(String nom, String prenom, String email) {
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
    }

    // Getters
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
    
    public boolean isExterne() {
        return false;
    }
    
    @Override
    public String toString() {
        return "Intervenant [Nom: " + nom + ", Prénom: " + prenom + ", Email: " + email + "]";
    }
}
