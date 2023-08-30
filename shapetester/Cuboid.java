public class Cuboid {
    private double length = 0.0;
    private double width = 0.0;
    private double height = 0.0;
    public void setDims(double l, double w, double h) {
        this.length = l;
        this.width = w;
        this.height = h;
    }
    public double getVolume() {
        return length*width*height;
    }
}