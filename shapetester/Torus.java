import java.lang.Math;
public class Torus {
    private double R = 0.0;
    private double r = 0.0;
    public void setDims(double majorRadius, double minorRadius) {
        this.R = majorRadius;
        this.r = minorRadius;
    }
    public double getVolume() {
        return 2*Math.pow(Math.PI*r, 2)*R;
    }
    public double getSurfaceArea() {
        return 4*Math.pow(Math.PI, 2)*R*r;
    }
}