package tp4.EX5;


public class Cercle {
    Point centre;
    double rayon;

    public Cercle(Point centre, double rayon) {
        this.centre = centre;
        this.rayon = rayon;
    }

    double surface() {
        return Math.PI * rayon * rayon;
    }

    boolean contient(Point p) {
        return centre.distance(p) <= rayon;
    }
}
