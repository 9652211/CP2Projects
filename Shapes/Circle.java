
public class Circle implements Shape {
	private double r;
	public void setR(double r) {
		this.r = r;
	}
	@Override
	public double area() {
		return Math.PI*Math.pow(r, 2);
	}
}
