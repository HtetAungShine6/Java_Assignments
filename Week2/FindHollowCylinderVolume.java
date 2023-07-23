package classEx1;

import java.util.Scanner;
import java.text.DecimalFormat;

public class FindHollowCylinderVolume {

	public static Double findVolume(double outerRadius, double innerRadius, double height) {
		return Math.PI*((double)(outerRadius*outerRadius) - (double)(innerRadius*innerRadius))*height;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Hollow Cylinder Calculator");
		
		System.out.print("Enter the outer radius : ");
		double outerRadius = sc.nextDouble();
		
		System.out.print("Enter the inner radius : ");
		double innerRadius = sc.nextDouble();
		
		System.out.print("Enter the height : ");
		double height = sc.nextDouble();
		
		DecimalFormat df = new DecimalFormat();
		df.setMaximumFractionDigits(2);
		
		
		System.out.println("The volume of this hollow cylinder is "+ df.format(findVolume(outerRadius, innerRadius, height)));
		
		sc.close();
	}

}
