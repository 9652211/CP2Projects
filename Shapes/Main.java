
public class Main {
	public static void main(String args[]) {
		final double phi = (1+Math.pow(5, 0.5))/2;
		Triangle tri = new Triangle();
		tri.setA(13);
		tri.setB(14);
		tri.setC(15);
		System.out.println(tri.area());
		Rectangle rect = new Rectangle();
		rect.setBase(phi);
		rect.setHeight(1);
		System.out.println(rect.area());
		Circle c = new Circle();
		c.setR(1);
		System.out.println(c.area());
	}
}
