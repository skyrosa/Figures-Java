package classes;

public class Rectangle extends Shape {

	private double base;
	private double height;
//	private Color backgroundColor; //color de fondo
//	private Color color; //color de las lineas o foreground color
	
	public Rectangle() {}
	
	public Rectangle(double base, double height) {
//		this.setBase(height);
//		this.setHeight(height);
		System.out.printf("Rectangulo de base %.2f y altura %.2f construído %n",
				this.base, this.height);
	}

//	public void setBase(double value) {
//		if(value < 0) {
//			System.out.println("Valor invalido");			
//		} else {
//			base = value;
//		}
//	}
	
	public double getBase() {
		return this.base;
	}
	
//	public void setHeight(double value) {
//		if(value < 0) {
//			System.out.println("Valor invalido");			
//		} else {
//			height = value;
//		}
//	}
	
	public double getHeight() {
		return this.height;
	}
	
//	public double getArea() {
//		return base * height;
//	}
	
	public double getPerimeter() {
		return 2 * this.base + 2 * this.height;
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
