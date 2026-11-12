package tp4.EX2;
public class CompteBancaire {

    String numero;
    String titulaire;
    double solde;

    // Premier constructeur
    public CompteBancaire(String numero, String titulaire, double solde) {
        this.numero = numero;
        this.titulaire = titulaire;
        this.solde = solde;
    }

    // Deuxième constructeur : solde initial = 0
    public CompteBancaire(String numero, String titulaire) {
        this(numero, titulaire, 0);
    }

    // Déposer de l'argent
    void deposer(double montant) {
        if (montant <= 0) {
            System.out.println("Montant invalide !");
        } else {
            solde = solde + montant;
            System.out.println("Dépôt effectué.");
        }
    }

    // Retirer de l'argent
    boolean retirer(double montant) {
        if (montant <= 0) {
            System.out.println("Montant invalide !");
            return false;
        }

        if (montant > solde) {
            System.out.println("Solde insuffisant !");
            return false;
        }

        solde = solde - montant;
        System.out.println("Retrait effectué.");
        return true;
    }

    // Virement vers un autre compte
    void virerVers(CompteBancaire destinataire, double montant) {
        if (this.retirer(montant)) {
            destinataire.deposer(montant);
            System.out.println("Virement effectué.");
        }
    }

    // Afficher le compte
    void afficher() {
        System.out.println("Numéro : " + numero
                + ", Titulaire : " + titulaire
                + ", Solde : " + solde + " DH");
    }
}
