package week7;

public class TestSquare {

	public static void main(String[] args) {

		Square square1 = new Square();
		System.out.println(square1.getArea());
		System.out.println(square1.getColor());
		System.out.println(square1.getParameter());
		System.out.println(square1.getDateCreated());
		square1.getCreatedDate();
		System.out.println(square1.toString());
		System.out.println("================================================");

		Square square2 = new Square(9);
		System.out.println(square2.getArea());
		System.out.println(square2.getColor());
		System.out.println(square2.getParameter());
		System.out.println(square2.getDateCreated());
		square2.getCreatedDate();
		System.out.println(square2.toString());
		System.out.println("================================================");

		Square square3 = new Square(6, "purple", true);
		System.out.println(square3.getArea());
		System.out.println(square3.getColor());
		System.out.println(square3.getParameter());
		System.out.println(square3.getDateCreated());
		square3.getCreatedDate();
		System.out.println(square3.toString());
		System.out.println("================================================");

		Square square4 = new Square(2, "orange", false);
		System.out.println(square4.getArea());
		System.out.println(square4.getColor());
		System.out.println(square4.getParameter());
		System.out.println(square4.getDateCreated());
		square4.getCreatedDate();
		System.out.println(square4.toString());

	}

}
