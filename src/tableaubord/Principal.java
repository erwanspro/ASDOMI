package tableaubord;

public class Principal {

    public static void main(String[] args) {
        Intervenant intervenant1 = new Intervenant("Dupont", "Jean", "jean.dupont@example.com");
        Intervenant intervenant2 = new Intervenant("Martin", "Sophie", "sophie.martin@example.com");

        System.out.println(intervenant1);
        System.out.println(intervenant2);
        System.out.println(intervenant1.isExterne());
        System.out.println(intervenant2.isExterne());
    }
    
}
