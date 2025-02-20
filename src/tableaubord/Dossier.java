package tableaubord;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Dossier {
    private String nomPatient;
    private String prenomPatient;
    private LocalDate dateNaissancePatient;
    private ArrayList<Prestation> mesPrestations;

    public Dossier(String unNomPatient, String unPrenomPatient, LocalDate uneDateNaissancePatient) {
        this.nomPatient = unNomPatient;
        this.prenomPatient = unPrenomPatient;
        this.dateNaissancePatient = uneDateNaissancePatient;
        this.mesPrestations = new ArrayList<>();
    }

    public void ajoutePrestation(String libelle, LocalDate uneDate, LocalTime uneHeure, Intervenant unIntervenant) {
        Prestation prestation = new Prestation(libelle, uneDate, uneHeure, unIntervenant);
        mesPrestations.add(prestation);
    }

    public int getNbIntervenantExternes() {
        int nbPrestationsExternes = 0;
        for (Prestation prestation : mesPrestations) {
            if (prestation.getIntervenant().isExterne()) {
                nbPrestationsExternes++;
            }
        }
        return nbPrestationsExternes;
    }

    public int getNbPrestations() {
        return mesPrestations.size();
    }

    public int getNbJoursSoins() {
        if (mesPrestations.isEmpty()){
            return 0;
        }
        Collections.sort(mesPrestations);
        Set<LocalDate> joursSoins = new HashSet<>();
        for (Prestation prestation : mesPrestations) {
            joursSoins.add(prestation.getDate());
        }
        return joursSoins.size();
    }
    
}
