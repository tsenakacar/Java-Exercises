package Loops;
import java.util.Scanner;

public class ProgramtoFindEvenNumbersUpToTheEnteredNumber {

    public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number whose multiples will be averaged.");
		int maxnum = input.nextInt();

		int a = 0;
		int b = 0;
		for (int i = 1; i < maxnum; i++) {
			if (i % 3 == 0 && i % 4 == 0) {
				a += i;
				b++;
			}

		}

		System.out.println("Average of numbers divisible by 3 and 4:");
		System.out.println(a / b);

	}
    
}
