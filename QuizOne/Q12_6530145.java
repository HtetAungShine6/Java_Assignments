package QuizOne;

public class Q12_6530145 {

	public static String withoutChar(String str, char remove) {
		String result = "";
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i)!=remove) {
				result += str.charAt(i);
			}
		}
		return result;
	}
	
	public static void main(String[] args) {
		String test1 = "hello there!";
		String test2 = "**Another **Example!**";
		System.out.println(withoutChar(test1,'e'));
		System.out.println(withoutChar(test1,'l'));
		System.out.println(withoutChar(test2,'*'));
		System.out.println(withoutChar(withoutChar(test2,'*'),'e'));
		System.out.println();
		
		//testing the method as given in the exam sheet!
		System.out.println(withoutChar("oppo v3",'o'));
		System.out.println(withoutChar("abandon",'n'));
		System.out.println(withoutChar("without you",'a'));
	}

}
