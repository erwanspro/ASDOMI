package tableaubord;

import java.time.LocalDate;
import java.time.LocalTime;

public class Prestation {
    private String libelle;
    private LocalDate dateSoin;
    private LocalTime heureSoin;
    private Intervenant intervenant;

    public Prestation(String nomPrestation, LocalDate datePrestation, LocalTime heureSoin,Intervenant unIntervenant) {
        this.libelle = nomPrestation;
        this.dateSoin = datePrestation;
        this.heureSoin = heureSoin;
        this.intervenant = unIntervenant;
    }

    public String getLibelle() {
        return libelle;
    }

    public LocalDate getDate() {
        return dateSoin;
    }

    public LocalTime getHeure() {
        return heureSoin;
    }

    public Intervenant getIntervenant() {
        return intervenant;
    }

    @Override
    public String toString() {
        return "Prestation{" + "nom de la prestation :" + libelle +
        ", date de  debut de la prestation :" + dateSoin + ", heure Soin :" + heureSoin + '}';
    }
    
    
}
