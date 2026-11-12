package tp4.EX6;

public class Voiture extends Vehicule {
    private int nombrePortes;

    public Voiture(String immatriculation, String marque, int annee, int kilometrage, int nombrePortes) {
        super(immatriculation, marque, annee, kilometrage); // Appel du constructeur parent
        this.nombrePortes = nombrePortes;
    }

    @Override
    double calculerVignette() {
        return 800.0;
    }

    @Override
    void afficher() {
        super.afficher(); // Reutilisation de l'affichage du parent
        System.out.println(" | Portes : " + nombrePortes + " | Vignette : " + calculerVignette() + " DH");
    }
}
