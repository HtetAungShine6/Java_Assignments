package classEx3;

import java.util.Arrays;
import java.util.Random;

public class StatMiddleValue {

	public static double mean(double[] arr,int n) {
		double total = 0;
		for(int i=0; i<n; i++) {
			total = total+arr[i];
		}
		double avg = total/n;
		return avg;
	}
	
	public static double mode(double[] arr,int n) {
		Arrays.sort(arr);
		double mode = arr[0];
		int max = 1;
		int current = 1;
		for(int i=1; i<n; i++) {
			if(arr[i] == arr[i-1]) {
				current++;
			}else {
				if(current > max) {
					max = current;
					mode = arr[i-1];
				}
				current = 1;
			}
		}
		if(current > max) {
			mode = arr[n-1];
		}
		return mode;
	}
	
	public static double median(double[] arr, int n) {
		Arrays.sort(arr);
		if(n % 2 != 0) {
			int med = Math.round(n / 2);
			return arr[med];
		}else {
			int med = n/2;
			int med1 = med-1;
			return (arr[med] + arr[med1])/2;
		}
	}
	
	public static double[] randomArray(int n) {
		Random r = new Random();
		double[] arr = new double[n];
		for(int i=0; i<n; i++) {
			arr[i] = r.nextInt(101);
		}
		return arr;
	}
	
	public static void main(String[] args) {
		
		//First result
		System.out.println("Displaying First Result : ");
		double[] arr = randomArray(100);
		System.out.println("Mean : " + mean(arr,arr.length));
		System.out.println("Mode : " + mode(arr,arr.length));
		System.out.println("Median : " + median(arr,arr.length));
		System.out.println();
//		Output of First result
//		Displaying First Result : 
//		Mean : 51.0
//		Mode : 3.0
//		Median : 53.0
		
		//Second result
		System.out.println("Displaying Second Result : ");
		double[] arr1 = randomArray(100);
		System.out.println("Mean : " + mean(arr1,arr.length));
		System.out.println("Mode : " + mode(arr1,arr.length));
		System.out.println("Median : " + median(arr1,arr.length));
		System.out.println();
//		Output of Second result
//		Displaying Second Result : 
//		Mean : 49.16
//		Mode : 35.0
//		Median : 46.0
		
		//Third result
		System.out.println("Displaying Third Result : ");
		double[] arr2 = randomArray(100);
		System.out.println("Mean : " + mean(arr2,arr.length));
		System.out.println("Mode : " + mode(arr2,arr.length));
		System.out.println("Median : " + median(arr2,arr.length));
//		Output of Third result
//		Displaying Third Result : 
//		Mean : 51.03
//		Mode : 7.0
//		Median : 50.5

	}
}

