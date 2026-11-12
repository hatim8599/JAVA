package tp4.EX5;

public class Point {
    double x;
    double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Distance entre deux points
    double distance(Point autre) {
        double dx = this.x - autre.x;
        double dy = this.y - autre.y;

        return Math.sqrt(dx * dx + dy * dy);
    }
}

