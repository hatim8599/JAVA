package tp4.EX6;



public class Main {
    public static void main(String[] args) {
        // 1. Création des véhicules
        Voiture v = new Voiture("12345-A-1", "Peugeot", 2020, 50000, 5);
        Moto m = new Moto("67890-B-1", "Yamaha", 2022, 12000, 650);
        Camion c = new Camion("11223-D-1", "Volvo", 2018, 180000, 12.0);

        // 2. Faire rouler les véhicules
        System.out.println("--- Déplacement des véhicules ---");
        v.rouler(150);
        m.rouler(80);
        c.rouler(500);

        // 3. Affichage des véhicules avec leurs vignettes
        System.out.println("\n--- État des véhicules et vignettes ---");
        v.afficher();
        m.afficher();
        c.afficher();
    }
}
