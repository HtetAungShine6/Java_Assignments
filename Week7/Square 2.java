package week7;

public class Square extends GeometricObject{
	
	private double sides;
	
	public Square() {
		
	}
	
	public Square(double sides) {
		this.sides = sides;
	}
	
	public Square(double sides, String color, boolean filled) {
		this.sides = sides;
		setColor(color);
		setFilled(filled);
	}
	
	public double getSides(double sides) {
		return sides;
	}
	
	public void setSides(double sides) {
		this.sides = sides;
	}
	
	public double getArea() {
		return sides * sides;
	}
	
	public double getParameter() {
		return 4 * sides;
	}
	
	public void getCreatedDate() {
		System.out.println("This square is created on " + getDateCreated() + " and the length is " + sides);
	}
	
	public String toString() {
		return "This square is created on " + getDateCreated() + "\ncolor: " + getColor() +
				" and filled: " + isFilled() + "\nits length is : " + this.sides;
	}
	
}
