
package tp4.EX6;

public class Vehicule {
    protected String immatriculation;
    protected String marque;
    protected int annee;
    protected int kilometrage;

    public Vehicule(String immatriculation, String marque, int annee, int kilometrage) {
        this.immatriculation = immatriculation;
        this.marque = marque;
        this.annee = annee;
        this.kilometrage = kilometrage;
    }

    void rouler(int km) {
        if (km < 0) {
            System.out.println("Erreur : le kilométrage ne peut pas être négatif.");
        } else {
            this.kilometrage += km;
        }
    }

    int age(int anneeCourante) {
        return anneeCourante - this.annee;
    }

    double calculerVignette() {
        return 500.0;
    }

    void afficher() {
        System.out.print("Immat : " + immatriculation + " | Marque : " + marque +
                " | Année : " + annee + " | Km : " + kilometrage);
    }
}
