package tableaubord;

import java.time.LocalDate;

public class Principal {

    public static void main(String[] args) {
//        Intervenant intervenant1 = new Intervenant("Dupont", "Jean", "jean.dupont@example.com");
//        Intervenant intervenant2 = new Intervenant("Martin", "Sophie", "sophie.martin@example.com");
//
//        System.out.println(intervenant1);
//        System.out.println(intervenant2);
//        System.out.println(intervenant1.isExterne());
//        System.out.println(intervenant2.isExterne());
        Intervenant iExt1 = new IntervenantExterne("Dupont", "Jean", "jean.dupont@example.com","laposte");
        Intervenant iExt2 = new IntervenantExterne("Martin", "Sophie", "sophie.martin@example.com","laposte");
        System.out.println(iExt1);
        System.out.println(iExt2);
        System.out.println(iExt1.isExterne());
        System.out.println(iExt2.isExterne());
        
        Prestation prestation = new Prestation("Consultation", LocalDate.of(2023, 10, 15), 150.0, iExt1);
    }
    
}
