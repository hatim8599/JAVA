package tp4.EX4;


public class Main {
    public static void main(String[] args) {

        // Test 1 : normalisation
        Duree d1 = new Duree(1, 75, 130);
        System.out.print("Duree 1 : ");
        d1.afficher();

        // Test 2 : total de secondes
        Duree d2 = new Duree(3725);
        System.out.print("Duree 2 : ");
        d2.afficher();

        // Test 3 : séance de cours + pause
        Duree cours = new Duree(1, 50);
        Duree pause = new Duree(0, 20);

        Duree total = cours.ajouter(pause);

        System.out.print("Cours : ");
        cours.afficher();

        System.out.print("Pause : ");
        pause.afficher();

        System.out.print("Total : ");
        total.afficher();
    }
}

