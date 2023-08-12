
//Htet Aung Shine
//6530145
//Sec-541

package Midterm;

public class MQ1_6530145 {
	
	public static String shiftRightN(String inStr, int n) {
		if(inStr.length()<=n) {
			return inStr;
		}else {
			String start = inStr.substring(inStr.length()-n, inStr.length());
			String end = inStr.substring(0,(inStr.length()-n));
			return start+end;
		}
	}

	public static void main(String[] args) {
		System.out.println("Output 1 : " + shiftRightN("hello",10)); 				//Output 1 : hello
		System.out.println("Output 2 : " + shiftRightN("123456",3)); 				//Output 2 : 456123
		System.out.println("Output 3 : " + shiftRightN("Midterm Exam.",2));	 		//Output 3 : m.Midterm Exa
		System.out.println("Output 4 : " + shiftRightN("1912315aabb",5));   		//Output 4 : 5aabb191231
		System.out.println("Output 5 : " + shiftRightN("HtetAungShine",6)); 		//Output 5 : gShineHtetAun
		System.out.println("Output 6 : " + shiftRightN("Hello World!!!",2)); 		//Output 6 : !!Hello World!
		System.out.println("Output 7 : " + shiftRightN("Bacon Cheese",3)); 			//Output 7 : eseBacon Che
		System.out.println("Output 8 : " + shiftRightN("I am hungry",15)); 			//Output 8 : I am hungry
		System.out.println("Output 9 : " + shiftRightN("Software Engineering",7));  //Output 9 : neeringSoftware Engi
		System.out.println("Output 10 : " + shiftRightN("Hello World",11)); 		//Output 10 : Hello World (length of inStr == n)
	}
}
