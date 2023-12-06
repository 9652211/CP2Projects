
public class Rectangle implements Shape {
	private double base;
	private double height;
	public void setBase(double base) {
		this.base = base;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	@Override
	public double area() {
		return base*height;
	}
}
