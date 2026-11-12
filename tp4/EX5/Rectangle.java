package tp4.EX5;

public class Rectangle {
    Point coinHautGauche;
    double largeur;
    double hauteur;

    public Rectangle(Point coinHautGauche, double largeur, double hauteur) {
        this.coinHautGauche = coinHautGauche;
        this.largeur = largeur;
        this.hauteur = hauteur;
    }

    double surface() {
        return largeur * hauteur;
    }

    double perimetre() {
        return 2 * (largeur + hauteur);
    }

    Point coinBasDroit() {
        return new Point(
                coinHautGauche.x + largeur,
                coinHautGauche.y + hauteur
        );
    }

    boolean contient(Point p) {
        return p.x >= coinHautGauche.x
                && p.x <= coinHautGauche.x + largeur
                && p.y >= coinHautGauche.y
                && p.y <= coinHautGauche.y + hauteur;
    }

    // Déplacer le rectangle
    void translater(double dx, double dy) {
        coinHautGauche.x += dx;
        coinHautGauche.y += dy;
    }
}

