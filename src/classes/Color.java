package classes;

public class Color {

	// ATRIBUTOS
	private final int red;   // lo marcas como FINAL para que no se cambie de valor en el futuro.
	private final int green;
	private final int blue;
	private final Rainbow rainbow;
	
//	private String name = "COLOR";
	
	//CONSTRUCTORES
	
//	public Color() {}; <----- ESTE DEJA DE FUNCIONAR CON EL "FINAL". ASI COMO LOS SETTERS.
	
	public String toString() {
		if (this.rainbow == null) {
		return "From Color: " + "COLOR" + " -  RGB (" + this.red + ", " + this.green + ", " + this.blue + ")";
		} else {
			return "From Color: " + this.rainbow.toString();
		}
	}
	
	public Color(Rainbow rainbow) {
		
		this.red = rainbow.red;
		this.green = rainbow.green;
		this.blue = rainbow.blue;
		this.rainbow = rainbow;
	}
	
	public final static int MAX = 255;
	public static final int MIN = 0;
	
//	public Color() {
//		this.red = Color.MAX;
//		this.green = Color.MAX;
//		this.blue = Color.MAX;
//	}
	
	public Color(int red, int green, int blue) {
		if(validColor(red)) {
			this.red = red;
			}
		else {
			this.red = Color.MAX;
		}
		if(validColor(green)) {
			this.green = green;
		}
		else {
			this.green = Color.MAX;
		}
		if(validColor(blue)) {
			this.blue = blue;
		}
		else {
			this.blue = Color.MAX;
		}
		this.rainbow = null;
	};
	
	private boolean validColor(int value) {
		if(value < Color.MIN || value > Color.MAX) {
			System.out.printf("Valor &d inválido %n",
					value);
			return false;
		}
		else {
			return true;
		}
	}
	
	// GETTER
	
	public int getRed() {
		return this.red;
	}
	
	public int getGreen() {
		return this.green;
	}

	public int getBlue() {
		return this.blue;
	}
	
	public enum Rainbow {
		
			RED(Color.MAX, Color.MIN, Color.MIN),
			GREEN(Color.MIN, Color.MAX, Color.MIN),
			BLUE(Color.MIN, Color.MIN, Color.MAX),
			YELLOW(Color.MAX, Color.MAX, Color.MIN),
			CYAN(Color.MIN, Color.MAX, Color.MAX),
			MAGENTA(Color.MAX, Color.MIN, Color.MAX),
			BLACK(Color.MIN, Color.MIN, Color.MIN),
			WHITE(Color.MAX, Color.MAX, Color.MAX);

			private final int red;
			private final int green;
			private final int blue;

			private Rainbow(int red, int green, int blue) {
				this.red = red;
				this.green = green;
				this.blue = blue;
			}
			
			public String toString() {
				return "(From Rainbow) " + this.name() +
					   " - RGB (" + this.red + ", " + this.green + ", " + this.blue + ")";
			}
	}
}
	
//	public void setColor(int red, int green, int blue) {  <----- EL SETTER DEJA DE FUNCIONAR CON EL FINAL!!!
//		this.setRed(red);
//		this.setGreen(green);
//		this.setBlue(blue);
//	}

// VALIDEZ SIMPLE, PERO REPETITIVA. LA FUNCION validColor() SUBSTITUYE Y HACE CLEANCODE
//	if(red > 255 || red < 0) {
//		System.out.printf("Valor Inválido");
//	} else
//	this.red = red;
