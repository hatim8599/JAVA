import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Donnez votre nom : ");
        String nom = sc.nextLine();

        System.out.print("Donnez votre prénom : ");
        String prenom = sc.nextLine();

        System.out.print("Donnez votre matricule : ");
        String matricule = sc.nextLine();

        System.out.print("Donnez votre âge : ");
        int age = sc.nextInt();

        System.out.println("\n--- Informations de l'étudiant ---");
        System.out.println("Nom : " + nom);
        System.out.println("Prénom : " + prenom);
        System.out.println("Matricule : " + matricule);
        System.out.println("Âge : " + age);

        sc.close();
    }
}