package tableaubord;

import java.time.LocalDate;

public class Prestation {
    private String nomPrestation;
    private LocalDate datePrestation;
    private double montant;
    private Intervenant intervenant;

    public Prestation(String nomPrestation, LocalDate datePrestation, double montant, Intervenant intervenant) {
        this.nomPrestation = nomPrestation;
        this.datePrestation = datePrestation;
        this.montant = montant;
        this.intervenant = intervenant;
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

    public Intervenant getIntervenant() {
        return intervenant;
    }
}
