package tp4.EX2;

public class Main {
    public static void main(String[] args) {

        // Création des deux comptes
        CompteBancaire c1 = new CompteBancaire("C001", "Ahmed", 1000);
        CompteBancaire c2 = new CompteBancaire("C002", "Sara");

        // Dépôt
        c1.deposer(500);

        // Retrait
        c1.retirer(200);

        // Virement
        c1.virerVers(c2, 300);

        // Affichage final
        System.out.println("\n--- Comptes à la fin ---");
        c1.afficher();
        c2.afficher();
    }
}
