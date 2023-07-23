package classEx5;

import java.util.Scanner;

public class SimpleDiceGame {

	//Constructor
	SimpleDiceGame(){
		
		int currentNumber = 0;
		int max = 0;
		int min = 7;
		int maxCount = 0;
		int minCount = 0;
		
		System.out.print("How many dices you want to roll? : ");
		Scanner sc = new Scanner(System.in);
		
		int numberOfDice = sc.nextInt();
		
		//Dice Rolling and taking maximum and minimum numbers
		for(int i=0; i<numberOfDice; i++) {
			
			Dice dice = new Dice(numberOfDice);
			currentNumber = dice.rollDice();
			System.out.println("Dice number "+ (i+1) + " : "+ currentNumber);
			
			//check maximum
			if(currentNumber>max) {
				max = currentNumber;
				maxCount = 1;
			}else if(currentNumber==max){
				maxCount++;
			}
			
			//check minimum
			if(currentNumber<min){
				min = currentNumber;
				minCount = 1;
			}else if(currentNumber==min) {
				minCount++;
			}
		}
		
		WinnerLoser(max,min,maxCount,minCount);
		sc.close();
	}
	
	public static void WinnerLoser(int max,int min,int maxCount,int minCount) {
		
		//Winner and Loser
		System.out.println();
		System.out.println("The winner is " + max);
		System.out.println("The loser is " + min);
		System.out.println();
		
		//Number of Winners
		if (maxCount == 1) {
            System.out.println("There is 1 winner with the highest roll which is " + max);
        } else {
            System.out.println("There are " + maxCount + " winners with the highest roll which is " + max);
        }
		
		//Numbers of Losers
		if (minCount == 1) {
            System.out.println("There is 1 loser with the lowest roll which is " + min);
        } else {
            System.out.println("There are " + minCount + " losers with the lowest roll which is " + min);
        }
	}
	
	public static void main(String[] args) {
		new SimpleDiceGame();
	}
}

//The output 
//How many dices you want to roll? : 6 <--- user input
//Dice number 1 : 2
//Dice number 2 : 6
//Dice number 3 : 6
//Dice number 4 : 4
//Dice number 5 : 6
//Dice number 6 : 2
//
//The winner is 6
//The loser is 2
//
//There are 3 winners with the highest roll which is 6
//There are 2 losers with the lowest roll which is 2

