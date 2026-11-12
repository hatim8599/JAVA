package tp4.EX1;

public class livre {
    String titre;
    String auteur;
    int nombrePages;
    double prix; // en DH

    // Constructeur
    public livre(String titre, String auteur, int nombrePages, double prix) {
        this.titre = titre;
        this.auteur = auteur;
        this.nombrePages = nombrePages;
        this.prix = prix;
    }

    // Afficher les infos du livre
    void afficher() {
        String infoLong = (estLong()) ? " (livre long)" : "";
        System.out.println("« " + titre + " » de " + auteur + ", " + nombrePages + " pages, " + String.format("%.2f", prix) + " DH" + infoLong);
    }

    // Indique si le livre dépasse 300 pages
    boolean estLong() {
        return nombrePages > 300;
    }


    void appliquerRemise(double pourcentage) {
        if (pourcentage < 0 || pourcentage > 50) {
            System.out.println("Remise refusée : " + pourcentage + " % n'est pas autorisé.");
        } else {
            prix = prix - (prix * pourcentage / 100.0);
        }
    }
}