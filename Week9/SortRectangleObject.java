package week9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SortRectangleObject {

	public static void main(String[] args) {
		
		ArrayList<Rectangle> rectangle = new ArrayList<>();
		
		rectangle.add(new Rectangle(11,9));
		rectangle.add(new Rectangle(5,10));
		rectangle.add(new Rectangle(6,12));
		rectangle.add(new Rectangle(13,17));
		rectangle.add(new Rectangle(2,1));
		rectangle.add(new Rectangle(4,6));
		
		Collections.sort(rectangle, new CompareRectangle());
		
		System.out.println("Sorted Rectangles:");
        for (Rectangle rec : rectangle) {
            System.out.println("Width: " + rec.getWidth() + ", Height: " + rec.getHeight() + ", Area: " + rec.getArea());
        }		
	}
}

class CompareRectangle implements Comparator<Rectangle>{

	public int compare(Rectangle r1, Rectangle r2) {
		double area1 = r1.getArea();
		double area2 = r2.getArea();

		if (area1 < area2) {
			return -1;
		} else if (area1 > area2) {
			return 1;
		} else {
			return 0;
		}
	}
}


//Output
//Sorted Rectangles:
//Width: 2.0, Height: 1.0, Area: 2.0
//Width: 4.0, Height: 6.0, Area: 24.0
//Width: 5.0, Height: 10.0, Area: 50.0
//Width: 6.0, Height: 12.0, Area: 72.0
//Width: 11.0, Height: 9.0, Area: 99.0
//Width: 13.0, Height: 17.0, Area: 221.0