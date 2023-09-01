import java.lang.Math;
public class Prism {
    private double length = 0.0;
    private double width = 0.0;
    private double height = 0.0;
    public void setDims(double l, double w, double h) {
        this.length = l;
        this.width = w;
        this.height = h;
    }

    public double getVolume() {
        return length*width*height/2;
    }
    public double getSurfaceArea() {
        double edge = Math.sqrt(Math.pow(width/2, 2)+Math.pow(height, 2));
        return length*width+2*length*edge+width*height;
    }
}