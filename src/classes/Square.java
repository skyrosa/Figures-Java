package classes;

public class Square extends Shape {

	private final  double side;
	
	// Todas las clases tienen un Constructor de Objetos por defecto. Pero si yo creo uno, el Constructor por defecto es substituido.

	// CONSTRUCTOR POR DEFECTO
	public Square() {
		this.side = 1.0;
//		this.backgroundColor = new Color();
//		this.color = new Color();
	}
	
	
	public Square(double side) {
		// INICIALIZACIÓN DEL ESTADO
		if (side < 0) {
			System.out.println("Valor inválido");
			this.side = 1.0;
		} else {
			this.side = side;
		}
//		this.setBackgroundColor(new Color());
//		this.setColor(new Color());
//		this.backgroundColor = new Color();
//		this.color = new Color();
		System.out.printf("Cuadrado construido con lado igual a %f %n", this.getSide());
	}
	
	public Square(double side, Color backgroungColor, Color color) {
		if (side < 0) {
			System.out.println("Valor inválido");
			this.side = 1.0;
		} else {
			this.side = side;
		}
//		this.backgroundColor = backgroungColor;
//		this.color = color;
	}
	
	
	//Getters
	public double getSide() {
		return this.side;
	}
	
//	public double getArea() {
//		return side * side;
//	}
	
	public double getPerimeter() {
		return this.side * 4;
	}
}

	
//	public void setBackgroundColor(Color backgroundColor) {
//		this.backgroundColor = backgroundColor;
//	}

//	private final Color backgroundColor; //color de fondo
//	private final Color color; //color de las lineas o foreground color

// ------------ CONSTRUCTOR CREADO --------------------

//	public Square(double side) {
//		this.setSide(side);
//		System.out.printf("Cuadrado de área %.2f construído %n",
//				this.side);
//	}

//	public Square(double side, Color backgroundColor, Color color) {
//		this.side = 0;
//		this.backgroundColor = ;
//		this.color = ;
//	}

//  ----------------- Setter ------------------
//	public void setSide(double side) {
//		// Validación
//		if(side < 0) {
//			System.out.println("Valor invalido");
//		} else {
//		this.side = side;
//		}
//	}

// -------------- COLOR --------------	

//	public Color getBackgroundColor() {
//		return backgroundColor;
//	}

//	public Color getColor() {
//		return color;
//	}

//	public void setColor(Color color) {
//		this.color = color;
//	}