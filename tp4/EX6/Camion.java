package tp4.EX6;
public class Camion extends Vehicule {
    private double chargeMaxTonnes;

    public Camion(String immatriculation, String marque, int annee, int kilometrage, double chargeMaxTonnes) {
        super(immatriculation, marque, annee, kilometrage);
        this.chargeMaxTonnes = chargeMaxTonnes;
    }

    @Override
    double calculerVignette() {
        return 1000.0 + (200.0 * chargeMaxTonnes);
    }

    @Override
    void afficher() {
        super.afficher();
        System.out.println(" | Charge Max : " + chargeMaxTonnes + " T | Vignette : " + calculerVignette() + " DH");
    }
}
