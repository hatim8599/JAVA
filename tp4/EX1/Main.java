package tp4.EX1;

public class Main {
    public static void main(String[] args) {
        // Création de 3 livres
        livre l1 = new livre("Le Petit Prince", "Saint-Exupéry", 96, 45.00);
        livre l2 = new livre("Les Misérables", "Victor Hugo", 1900, 120.00);
        livre l3 = new  livre("Java pour les débutants", "Dupont", 350, 150.00);

        // Affichage initial des livres
        System.out.println("--- Affichage initial ---");
        l1.afficher();
        l2.afficher();
        l3.afficher();

        // Appliquer une remise de 10 % sur le troisième livre
        System.out.println("\n--- Test remise 10% sur l3 ---");
        l3.appliquerRemise(10.0);
        l3.afficher();

        // Tentative de remise interdite (80 %) sur le premier livre
        System.out.println("\n--- Test remise interdite (80%) sur l1 ---");
        l1.appliquerRemise(80.0);
    }
}
