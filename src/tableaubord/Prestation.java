package tableaubord;

import java.time.LocalDate;

public class Prestation {
    private String libelle;
    private LocalDate dateSoin;
    private double heureSoin;

    public Prestation(String nomPrestation, LocalDate datePrestation, double heureSoin) {
        this.libelle = nomPrestation;
        this.dateSoin = datePrestation;
        this.heureSoin = heureSoin;
    }

    public String getNomPrestation() {
        return libelle;
    }

    public LocalDate getDatePrestation() {
        return dateSoin;
    }

    public double getMontant() {
        return heureSoin;
    }

    @Override
    public String toString() {
        return "Prestation{" + "nom de la prestation :" + libelle +
        ", date de  debut de la prestation :" + dateSoin + ", heure Soin :" + heureSoin + '}';
    }
    
    
}
