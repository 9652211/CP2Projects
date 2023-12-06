
public class Triangle implements Shape {
	
	private double a;
	private double b;
	private double c;
	public void setA(double a) {
		this.a = a;
	}
	public void setB(double b) {
		this.b = b;
	}
	public void setC(double c) {
		this.c = c;
	}
	@Override
	public double area() {
		double s = (a+b+c)/2;
		return Math.pow(s*(s-a)*(s-b)*(s-c), 0.5);
	}
}
