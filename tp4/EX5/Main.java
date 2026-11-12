package tp4.EX5;

public class Main {
    public static void main(String[] args) {

        // Créer deux points
        Point p1 = new Point(2, 3);
        Point p2 = new Point(5, 7);

        System.out.println("Distance : " + p1.distance(p2));

        // Créer un rectangle
        Rectangle r = new Rectangle(new Point(1, 2), 6, 4);

        System.out.println("Surface rectangle : " + r.surface());
        System.out.println("Perimetre rectangle : " + r.perimetre());

        Point basDroit = r.coinBasDroit();
        System.out.println("Coin bas droit : ("
                + basDroit.x + ", " + basDroit.y + ")");

        System.out.println("Le point p1 est dans le rectangle : "
                + r.contient(p1));

        // Translation du rectangle
        r.translater(2, 3);

        System.out.println("Apres translation : ("
                + r.coinHautGauche.x + ", "
                + r.coinHautGauche.y + ")");

        // Créer un cercle
        Cercle c = new Cercle(new Point(5, 5), 3);

        System.out.println("Surface cercle : " + c.surface());
        System.out.println("Le point p2 est dans le cercle : "
                + c.contient(p2));
    }
}

