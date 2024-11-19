package tableaubord;

import java.time.LocalDate;

public class Prestation {
    private String nomPrestation;
    private LocalDate datePrestation;
    private double montant;

    public Prestation(String nomPrestation, LocalDate datePrestation, double montant) {
        this.nomPrestation = nomPrestation;
        this.datePrestation = datePrestation;
        this.montant = montant;
    }

    public String getNomPrestation() {
        return nomPrestation;
    }

    public LocalDate getDatePrestation() {
        return datePrestation;
    }

    public double getMontant() {
        return montant;
    }

    @Override
    public String toString() {
        return "Prestation{" + "nom de la prestation :" + nomPrestation +
        ", date de  debut de la prestation :" + datePrestation + ", montant :" + montant + '}';
    }
    
    
}
