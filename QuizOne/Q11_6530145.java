package QuizOne;

public class Q11_6530145 {

	public static boolean has99Or9x9(int[] nums) {
		for(int i=0; i<nums.length-1; i++) {
			if(nums[i]==9 && nums[i+1]==9) {
				return true;
			}
			if(i<=nums.length-3 && nums[i]==9 && nums[i+2]==9) {
				return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		int[] arr1 = {1,9,1,9};
		int[] arr2 = {1,2,3};
		int[] arr3 = {9,5,1,9,3,9};
		int[] arr4 = {9,100,9};
		int[] arr5 = {};
		int[] arr6 = {9,3,2,9,7,8,9};
		int[] arr7 = {1,2,3,99,3,9,2,1};
		System.out.println(has99Or9x9(arr1));
		System.out.println(has99Or9x9(arr2));
		System.out.println(has99Or9x9(arr3));
		System.out.println(has99Or9x9(arr4));
		System.out.println(has99Or9x9(arr5));
		System.out.println(has99Or9x9(arr6));
		System.out.println(has99Or9x9(arr7));
		
		//testing the method as given in the exam sheet!
		System.out.println();
		int[] test1 = {1,9,9};
		int[] test2 = {1,9,1,9};
		int[] test3 = {1,9,2,3,9};
		System.out.println(has99Or9x9(test1));
		System.out.println(has99Or9x9(test2));
		System.out.println(has99Or9x9(test3));
	}

}
