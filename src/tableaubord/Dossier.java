package tableaubord;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class Dossier {
    private String nomPatient;
    private String prenomPatient;
    private LocalDate dateNaissancePatient;
    private Collection<Prestation> mesPrestations;

    // Constructeur
    public Dossier(String unNomPatient, String unPrenomPatient, LocalDate uneDateNaissancePatient) {
        this.nomPatient = unNomPatient;
        this.prenomPatient = unPrenomPatient;
        this.dateNaissancePatient = uneDateNaissancePatient;
        this.mesPrestations = new ArrayList<>(); // Initialisation de la collection de prestations
    }

    // Méthode pour ajouter une prestation au dossier
    public void ajoutePrestation(String libelle, LocalDate uneDate, LocalTime uneHeure, Intervenant unIntervenant) {
        Prestation prestation = new Prestation(libelle, uneDate, uneHeure, unIntervenant);
        mesPrestations.add(prestation);
    }

    // Fonction pour obtenir le nombre de prestations externes
    public int getNbPrestationsExternes() {
        int nbPrestationsExternes = 0;
        for (Prestation prestation : mesPrestations) {
            if (prestation.isExterne()) {
                nbPrestationsExternes++;
            }
        }
        return nbPrestationsExternes;
    }

    // Fonction pour obtenir le nombre total de prestations
    public int getNbPrestations() {
        return mesPrestations.size();
    }

    // Fonction pour obtenir le nombre de jours de soins
    public int getNbJoursSoins() {
        Set<LocalDate> joursSoins = new HashSet<>();
        for (Prestation prestation : mesPrestations) {
            joursSoins.add(prestation.getDate());
        }
        return joursSoins.size();
    }
    
}
