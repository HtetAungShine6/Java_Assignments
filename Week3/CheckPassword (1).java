package inClassEx2;

import java.util.Scanner;

public class CheckPassword {
	
	//check password length
	public static boolean isPasswordValid(String password) {
		if(password.length()>=8) {
			return true;
		}
		return false;
	}
	
	//check special character
	public static boolean specialChars(String password) {
		int special = 0;
		String str = "_,@,#,$,/,&";
		for(int i=0; i<password.length(); i++) {
			char c = password.charAt(i);
			String strChar = Character.toString(c);
			if(str.contains(strChar)) {
				special++;
			}
		}
		if(special >= 1) {
			return true;
		}
		return false;
	}
	
	//check password is strong or not
	public static void validation(String password) {
		if(isPasswordValid(password)) {
			int upper = 0;
			int digit = 0;
			for(int i=0;i<password.length();i++) {
				char c = password.charAt(i);
				if(Character.isUpperCase(c)) {
					upper++;
				}else if(Character.isDigit(c)) {
					digit++;
				}
			}
			if(upper>=1 && digit>=1) {
				if(specialChars(password)) {
					System.out.println("Password is valid.");
				}else {
					System.out.println("Password is not valid.");
				}
			}else {
				System.out.println("Password is not valid.");
			}
		}
		else {
			System.out.println("Password needs to be more than 8 characters.");
		}
	}
	
	public static void main(String[] args) {
		System.out.println("The conditions for password validity are:\n"
				+ "At least 8 characters\n"
				+ "At least one digit\n"
				+ "At least one symbol from {_,@,#,$,/,&}");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a password : ");
		String psw = sc.nextLine();
		validation(psw);
		sc.close();
	}
}