package week8;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class Worksheet8 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the size of the ArrayList : ");
		int input = sc.nextInt();
		
		for(int i=0; i<input; i++) {
			System.out.print("Enter number " + (i+1) + ": ");
			int n = sc.nextInt();
			list.add(n);
		}
		
		System.out.println("Unsorted list -> " + list);
		Collections.sort(list);
		System.out.println("Sorted list -> " + list);
		
		getAverage(list);
		sc.close();

	}
	
	public static void getAverage(ArrayList<Integer> list) {
		int total = 0;
		for(int i=0; i<list.size(); i++) {
			total += list.get(i);
		}
		
		int average = total/list.size();
		System.out.println("The average of the ArrayList -> " + average);
	}

}
