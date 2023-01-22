package classes;

public class Circle extends Shape {

	private double radius;
//	private Color backgroundColor; //color de fondo
//	private Color color; //color de las lineas o foreground color
	
	public Circle() {}
	
	public Circle(double radius) {
		this.setRadius(radius);
		System.out.printf("Circulo de radius %.2f construído %n",
				this.radius);
	}
	
	public void setRadius(double radius) {
		if(radius < 0) {
			System.out.println("Valor invalido");
	} else {
		this.radius = radius;
	}
	}
	
	public double getRadius() {
		return this.radius;
	}
	
//	public double getArea() {
//		return Math.PI * radius * radius;
//	}
	
	public double getPerimeter() {
		return 2 * Math.PI * this.radius;
	}

// -------------- COLOR --------------
	
//	public Color getBackgroundColor() {
//		return backgroundColor;
//	}
//	
//	public void setBackgroundColor(Color backgroundColor) {
//		this.backgroundColor = backgroundColor;
//	}
//
//	public Color getColor() {
//		return color;
//	}
//
//	public void setColor(Color color) {
//		this.color = color;
//	}
	
}
