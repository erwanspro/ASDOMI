package tableaubord;

import java.time.LocalDate;
import java.time.LocalTime;

public class Principal {

    public static void main(String[] args) {
        
        Intervenant interv = new Intervenant("Dupont", "Jean");
        Intervenant interv2 = new Intervenant("Jean", "Dupont");
        Intervenant interv3 = new Intervenant("Dupont", "Jean");
        Dossier dos1 = new Dossier("Dupont", "Jean",LocalDate.of(2023, 10, 15));
        Intervenant iExt1 = new IntervenantExterne("Martin", "Sophie", "isakai","WALA che pas","0632245766");
        Intervenant iExt2 = new IntervenantExterne("Sophie", "Sophie", "mamamia","dont know","0632245766");
        Prestation presta1 = new Prestation("Consultation1", LocalDate.of(2023, 10, 15), LocalTime.of(2,40),iExt1);
        Prestation presta2 = new Prestation("espion1", LocalDate.of(2023, 11, 25), LocalTime.of(3,10),iExt2);
        Prestation presta3 = new Prestation("espion2", LocalDate.of(2023, 11, 25), LocalTime.of(3,10),iExt2);
        Prestation presta4 = new Prestation("Consultation2", LocalDate.of(2023, 11, 05), LocalTime.of(2,10),iExt1);
        
        dos1.ajoutePrestation("Consultation1", LocalDate.of(2023, 10, 15), LocalTime.of(2,40),iExt1);
        dos1.ajoutePrestation("espion1", LocalDate.of(2023, 11, 25), LocalTime.of(3,10),iExt2);
        dos1.ajoutePrestation("espion2", LocalDate.of(2023, 11, 25), LocalTime.of(3,10),iExt2);
        dos1.ajoutePrestation("Consultation2", LocalDate.of(2023, 11, 05), LocalTime.of(2,10),iExt1);
        
        System.out.println(presta1.compareTo(presta2));
        System.out.println(presta2.compareTo(presta1));
        System.out.println(dos1.getNbPrestations());
        System.out.println(dos1.getNbIntervenantExternes());
        System.out.println(dos1.getNbJoursSoins());
        
    }
    
}
