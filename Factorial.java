/**
 * Title: Factorial.java
 * Abstract: A program to print out the factorials from a given user integer input.
 * 
 * Author: Daniel Wilson
 * Date: 9/1/16
 *
 */
import java.util.Scanner;

public class Factorial {

	
	public static void main(String[] args) {
		boolean anotherTry = true;
		int userInput = 0,fact_ans = 1;
		String answer;
		Scanner given = new Scanner(System.in);
		while(anotherTry == true){
			try{
				System.out.print("Enter an integer number: ");
				userInput = given.nextInt();
				if(userInput < 0){
					System.out.println("No result for a negative integer.");
				}
				else{
					System.out.print(userInput + "! --> ");
					fact_ans = 1;
					for(int i = userInput; i > 0; i--){
						if(i > 1){
							System.out.print(i + " * ");
						}
						else{
							System.out.print(i + " --> ");
						}
						fact_ans *= i;
					}
				}
				System.out.println(fact_ans);
				System.out.print("Try another factorial? [Y/N] ");
				Scanner cont = new Scanner(System.in);
				answer = cont.nextLine();
				if(answer.equals("Y")){
					continue;
				}
				else if(answer.equals("N")){
					System.out.println("Bye.");
					anotherTry = false;
				}
				else{
					System.out.println("Incorrect answer.");
					continue;
				}
				cont.close();
			}
			catch(Exception e){
				System.out.println("Not a correct format");
				given.nextLine();
			}
		}
		given.close();
	}

}
