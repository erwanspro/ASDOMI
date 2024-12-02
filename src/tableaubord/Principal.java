package tableaubord;

import java.time.LocalDate;
import java.time.LocalTime;

public class Principal {

    public static void main(String[] args) {
//        Intervenant intervenant1 = new Intervenant("Dupont", "Jean", "jean.dupont@example.com");
//        Intervenant intervenant2 = new Intervenant("Martin", "Sophie", "sophie.martin@example.com");
//
//        System.out.println(intervenant1);
//        System.out.println(intervenant2);
//        System.out.println(intervenant1.isExterne());
//        System.out.println(intervenant2.isExterne());
//        Intervenant iExt1 = new IntervenantExterne("Dupont", "Jean", "jean.dupont@example.com","laposte");
//        Intervenant iExt2 = new IntervenantExterne("Martin", "Sophie", "sophie.martin@example.com","laposte");
//        System.out.println(iExt1);
//        System.out.println(iExt2);
//        System.out.println(iExt1.isExterne());
//        System.out.println(iExt2.isExterne());
        
        Intervenant iExt1 = new IntervenantExterne("Martin", "Sophie", "isakai","WALA che pas","0632245766");
        Intervenant iExt2 = new IntervenantExterne("Sophie", "Sophie", "mamamia","dont know","0632245766");
        Prestation presta1 = new Prestation("Consultation", LocalDate.of(2023, 10, 15), LocalTime.of(2,4),iExt1);
        Prestation presta2 = new Prestation("espion", LocalDate.of(2023, 11, 25), LocalTime.of(4,40),iExt2);
        System.out.println(presta1.compareTo(presta2));
        System.out.println(presta2.compareTo(presta1));
//        System.out.println(presta1);
//        System.out.println(presta2);
//        System.out.println(iExt2);
        
    }
    
}
