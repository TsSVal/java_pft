package CoordinatesSystem.Points;

/**
 * Created by stsunskaya on 9/21/2016.
 */
public class Point {
    double x, y, a, c;

    public static void main(String[] args) {
        Point P1 = new Point();
        Point P2 = new Point();
        P1.x = -5.3;
        P1.y = 5.3;
        P2.x = -5.3;
        P2.y = -5.3;
        System.out.println("P1.x = " + P1.x + ", P1.y = " + P1.y);
        System.out.println("P2.x = " + P2.x + ", P2.y = " + P2.y);
        Distance d = new Distance(-5.3, 5.3, -5.3, -5.3);
        System.out.println("Distance between Point P1 and Point P2 = " + d.Distance());

    }
}
