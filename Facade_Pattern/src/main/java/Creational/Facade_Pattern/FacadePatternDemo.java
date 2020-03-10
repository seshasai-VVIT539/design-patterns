package Creational.Facade_Pattern;
public class FacadePatternDemo {
	public static void main(String[] args) {
	      ShapeMarker shapeMaker = new ShapeMarker();

	      shapeMaker.drawCircle();
	      shapeMaker.drawRectangle();
	      shapeMaker.drawSquare();		
	   }
}