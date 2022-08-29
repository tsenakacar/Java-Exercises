import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
		Scanner input=new Scanner (System.in);
		System.out.println("Enter the first number:");
		int num1=input.nextInt();
		System.out.println("Enter the second number:");
		int num2=input.nextInt();
		
		System.out.println("Please enter the mathematical operation you want to do");
		System.out.println("1-Addition 2-Subtraction 3-Multiplication 4-Division");
		
		int select=input.nextInt();
		
		switch(select) {
			case 1: 
				System.out.println("Answer is " +(num1+num2)); 
				break;
			case 2: 
				System.out.println("Answer is " +(num1-num2)); 
				break;
			case 3: 
				System.out.println("Answer is " +(num1*num2)); 
				break;
			case 4: 
				System.out.println("Answer is " +(num1/num2)); 
				break;
				
			
		}

	}

}
