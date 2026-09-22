import java.util.Scanner;

public class exojavascanner {

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


        System.out.println("           1ERE ANNEE");

        System.out.print("Note Algèbre : ");
        double an1_note1 = sc.nextDouble();

        System.out.print("Note Analyse : ");
        double an1_note2 = sc.nextDouble();

        System.out.print("Note Architecture d'ordinateur : ");
        double an1_note3 = sc.nextDouble();

        System.out.print("Note Python : ");
        double an1_note4 = sc.nextDouble();

        System.out.print("Note C : ");
        double an1_note5 = sc.nextDouble();

        double moyenne1 = (an1_note1 + an1_note2 + an1_note3
                + an1_note4 + an1_note5) / 5;

        System.out.println("\n Résultats 1ère année ");

        System.out.printf("Algèbre : ",
                an1_note1, an1_note1 >= 10 ? "Validé" : "Rattrapage");

        System.out.printf("Analyse : ",
                an1_note2, an1_note2 >= 10 ? "Validé" : "Rattrapage");

        System.out.printf("Architecture : ",
                an1_note3, an1_note3 >= 10 ? "Validé" : "Rattrapage");

        System.out.printf("Python : ",
                an1_note4, an1_note4 >= 10 ? "Validé" : "Rattrapage");

        System.out.printf("C :",
                an1_note5, an1_note5 >= 10 ? "Validé" : "Rattrapage");

        System.out.printf("Moyenne 1ère année : %.2f%n", moyenne1);

        if (moyenne1 >= 10) {
            System.out.println("1ère année : VALIDEE");
        } else {
            System.out.println("1ère année : NON VALIDEE");
        }

        System.out.println("  2EME ANNEE");


        System.out.print("Note C++ : ");
        double an2_note1 = sc.nextDouble();

        System.out.print("Note Algèbre : ");
        double an2_note2 = sc.nextDouble();

        System.out.print("Note Electronique analogique : ");
        double an2_note3 = sc.nextDouble();

        System.out.print("Note Réseaux : ");
        double an2_note4 = sc.nextDouble();

        System.out.print("Note Base de données : ");
        double an2_note5 = sc.nextDouble();

        System.out.print("Note Electronique numérique : ");
        double an2_note6 = sc.nextDouble();

        double moyenne2 = (an2_note1 + an2_note2 + an2_note3
                + an2_note4 + an2_note5 + an2_note6) / 6;

        System.out.println("\n--- Résultats 2ème année ---");

        System.out.printf("C++ : ",
                an2_note1, an2_note1 >= 10 ? "Validé" : "Rattrapage");

        System.out.printf("Algèbre : %.2f - %s%n",
                an2_note2, an2_note2 >= 10 ? "Validé" : "Rattrapage");

        System.out.printf("Electronique analogique : %.2f - %s%n",
                an2_note3, an2_note3 >= 10 ? "Validé" : "Rattrapage");

        System.out.printf("Réseaux : %.2f - %s%n",
                an2_note4, an2_note4 >= 10 ? "Validé" : "Rattrapage");

        System.out.printf("Base de données : %.2f - %s%n",
                an2_note5, an2_note5 >= 10 ? "Validé" : "Rattrapage");

        System.out.printf("Electronique numérique : %.2f - %s%n",
                an2_note6, an2_note6 >= 10 ? "Validé" : "Rattrapage");

        System.out.printf("Moyenne 2ème année : %.2f%n", moyenne2);

        if (moyenne2 >= 10) {
            System.out.println("2ème année : VALIDEE");
        } else {
            System.out.println("2ème année : NON VALIDEE");
        }

        System.out.println("\n=================================");
        System.out.println("       3EME ANNEE - BIG DATA");
        System.out.println("=================================");

        System.out.print("Note Intelligence artificielle : ");
        double an3_note1 = sc.nextDouble();

        System.out.print("Note Cybersécurité : ");
        double an3_note2 = sc.nextDouble();

        System.out.print("Note Python : ");
        double an3_note3 = sc.nextDouble();

        System.out.print("Note Java : ");
        double an3_note4 = sc.nextDouble();

        System.out.print("Note UML : ");
        double an3_note5 = sc.nextDouble();

        System.out.print("Note Réseau : ");
        double an3_note6 = sc.nextDouble();

        double moyenne3 = (an3_note1 + an3_note2 + an3_note3
                + an3_note4 + an3_note5 + an3_note6) / 6;

        System.out.println("\n--- Résultats 3ème année ---");

        System.out.printf("Intelligence artificielle : ",
                an3_note1, an3_note1 >= 10 ? "Validé" : "Rattrapage");

        System.out.printf("Cybersécurité : ",
                an3_note2, an3_note2 >= 10 ? "Validé" : "Rattrapage");

        System.out.printf("Python : ",
                an3_note3, an3_note3 >= 10 ? "Validé" : "Rattrapage");

        System.out.printf("Java : ",
                an3_note4, an3_note4 >= 10 ? "Validé" : "Rattrapage");

        System.out.printf("UML : ",
                an3_note5, an3_note5 >= 10 ? "Validé" : "Rattrapage");

        System.out.printf("Réseau : n",
                an3_note6, an3_note6 >= 10 ? "Validé" : "Rattrapage");

        System.out.printf("Moyenne 3ème année : ", moyenne3);

        if (moyenne3 >= 10) {
            System.out.println("3ème année : VALIDEE");
        } else {
            System.out.println("3ème année : NON VALIDEE");
        }

        double moyenneGenerale = (moyenne1 + moyenne2 + moyenne3) / 3;


        System.out.println("       RESULTAT FINAL");


        System.out.printf("Moyenne 1ère année : %.2f%n", moyenne1);
        System.out.printf("Moyenne 2ème année : %.2f%n", moyenne2);
        System.out.printf("Moyenne 3ème année : %.2f%n", moyenne3);

        System.out.printf("\nMoyenne générale des 3 années :",
                moyenneGenerale);

        System.out.println("\n Validation ");

        if (moyenne1 >= 10) {
            System.out.println("1ère année : VALIDEE");
        } else {
            System.out.println("1ère année : NON VALIDEE");
        }

        if (moyenne2 >= 10) {
            System.out.println("2ème année : VALIDEE");
        } else {
            System.out.println("2ème année : NON VALIDEE");
        }

        if (moyenne3 >= 10) {
            System.out.println("3ème année : VALIDEE");
        } else {
            System.out.println("3ème année : NON VALIDEE");
        }

        System.out.println("         RESULTAT FINAL");

        if (moyenne1 >= 10 && moyenne2 >= 10 && moyenne3 >= 10) {
            System.out.println("LES 3 ANNEES SONT VALIDEES");
            System.out.println("ETUDIANT : ADMIS");
        } else {
            System.out.println("LES 3 ANNEES NE SONT PAS TOUTES VALIDEES");
            System.out.println("ETUDIANT : NON ADMIS");
        }

        sc.close();
    }
}