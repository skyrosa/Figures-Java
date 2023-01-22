package App;

import classes.Color;
import classes.Square;
import classes.Sphere;
import classes.Rectangle;
import classes.Circle;


// o "import classes.*;" para importar todos de una solo vez

public class Main {

	public static void main(String[] args) {

// ---------------- RAINBOW ---------------------		

//	System.out.println(Rainbow.BLUE.toString());
//	System.out.println(Rainbow.YELLOW); // <- funciona sin el toString() pues el System.out.print() siempre busca una String


			
// ------------------- COLORES -----------------------
		
	System.out.printf("%n --------COLORES-------- %n %n");
		
	Color white = new Color(Color.Rainbow.WHITE); // 	<-----	crea nuevo color por medio de class
	System.out.printf(white.toString() + "%n"); 
	
	Color black = new Color(Color.Rainbow.BLACK);
	System.out.printf(black + "%n"); // <-- funciona sin toString() si tiene uno CONSTRUIDO y no se está usando el por defecto
	
	Color red = new Color(Color.Rainbow.RED);
	System.out.printf(red + "%n");
	
	Color green = new Color(Color.Rainbow.GREEN);
	System.out.printf(green + "%n");
	
	Color blue = new Color(Color.Rainbow.BLUE);
	System.out.printf(blue + "%n");
	
	Color magenta = new Color(Color.Rainbow.MAGENTA);
	System.out.printf(magenta + "%n");
	
	Color cyan = new Color(Color.Rainbow.CYAN);
	System.out.printf(cyan + "%n");
	
	Color yellow = new Color(Color.Rainbow.YELLOW);
	System.out.printf(yellow + "%n");
	
	Color color1 = new Color(241, 211, 164);
	System.out.println(color1.toString());
	
	
// -------------------- FORMAS ---------------------
	
	System.out.printf("%n --------FORMAS-------- %n");
		
	System.out.println();
		Square square = new Square(5.0);
		square.setColor(new Color(Color.Rainbow.WHITE));
		square.setBackgroundColor(new Color(Color.Rainbow.BLACK)); 
//		double areaSquare = square.getArea();
//		double perimeterSquare = square.getPerimeter();
	    	System.out.printf("El área del cuadrado es: %.2f %n",
	    	square.getSide());


	     Circle circle = new Circle(5.0);
//	     double perimeterCircle = circle.getPerimeter();
	     	System.out.printf("El área del círculo es: %.2f %n",
	     	circle.getRadius());
		
	System.out.println();
		Rectangle rectangle = new Rectangle(6.7, 8.7);
     	System.out.printf("El área del retangulo es: %.2f %n",
     	rectangle.getBase());

	System.out.println();
		Sphere sphere = new Sphere(5.8);
     	System.out.printf("El volumen de la esfera es: %.2f %n",
     	sphere.getVolume());

	}
}

//Square square1 = new Square();
//square1.setSide(5.0);

//Square square1 = new Square(5.0);
//	System.out.printf(...);

//color1.setRed(100);						<- NO FUNCIONA EL SETTER POR EL "FINAL" (tambien porque el Red es private, el setRED era public)
//System.out.println(color1.toString());  setRED cambia el RED
	
//color1.setColor(240, 210, 150);			<- NO FUNCIONA EL SETTER POR EL "FINAL" (tambien porque el Color es private, el setColor era public)
//System.out.println(color1.toString());  setColor cambiam los 3 valores

// EJEMPLO FORMA COMPLETA CON SETTER E TODO:
// System.out.println();
// Square square = new Square(5.0, color1, color2);
//square.setBackgroundColor(negro);
//square.setColor(blanco);
//square.setSide(15.0);
//double areaSquare = square.getArea();
//double perimeterSquare = square.getPerimeter();
//	System.out.printf("El área del cuadrado de color %s, background color %s y de lado %.2f es: %.2f %n", 
//	square.getColor().toString(), square.getBackgroundColor().toString(), square.getSide(), areaSquare);
// 	System.out.printf("El área del cuadrado es: %.2f %n",
//	square.getSide());
//	System.out.printf("El perimetro del quadrado de color %s, background color %s y de lado %.2f es: %.2f %n",
//	square.getColor().toString(),square.getBackgroundColor().toString(), square.getSide(), perimeterSquare);

