package CoordinatesSystem.Points;

/**
 * Created by stsunskaya on 9/21/2016.
 */
public class Distance {
    public double x;
    public double y;
    public double a;
    public double c;
    public Distance (double x, double y, double a, double c) {
        this.x = x;
        this.y = y;
        this.a = a;
        this.c = c;
    }
    public double Distance () {
        return Math.sqrt(((this.x - this.a) * (this.x - this.a)) + ((this.y - this.c) * (this.y - this.c)));
    }

}
