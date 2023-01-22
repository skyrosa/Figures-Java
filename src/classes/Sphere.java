package classes;

public class Sphere extends Shape {

	private double radius;
//	private Color color; //color de las lineas o foreground color
	
	public Sphere(double radius) {}
	

	
//	public void setRadius(double radius) {
//		if(radius < 0) {
//			System.out.println("Valor invalido");
//		} else {
//		this.radius = radius;
//		}
//	}
	
	public double getRadius() {
		return this.radius;
	}
	
	public double getVolume() {
		return (4/3) * Math.PI * radius * radius * radius; // o Math.pow(this.radius,3)
	}
	
//	public double getArea() {
//		return 4 * Math.PI * this.radius * 2; // o Math.pow(this.radius,2)	
//	}
	
// -------------- COLOR --------------

//	public Color getColor() {
//		return color;
//	}
//
//	public void setColor(Color color) {
//		this.color = color;
//	}
	
	
}
