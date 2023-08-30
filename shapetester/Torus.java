import java.lang.Math;
public class Torus {
    private double majorRadius = 0.0;
    private double minorRadius = 0.0;
    public static double getVolume(double R, double r) {
        return 2*Math.pow(Math.PI*r, 2)*R;
    }
}
